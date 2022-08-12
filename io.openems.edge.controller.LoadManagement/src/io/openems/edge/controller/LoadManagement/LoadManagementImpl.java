package io.openems.edge.controller.LoadManagement;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.osgi.service.component.ComponentContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.metatype.annotations.Designate;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import io.openems.common.exceptions.OpenemsError.OpenemsNamedException;
import io.openems.edge.common.channel.Doc;
import io.openems.edge.common.component.AbstractOpenemsComponent;
import io.openems.edge.common.component.OpenemsComponent;
import io.openems.edge.controller.api.Controller;

@Designate(ocd = Config.class, factory = true)
@Component(//
		name = "Controller.LoadManagement", //
		immediate = true, //
		configurationPolicy = ConfigurationPolicy.REQUIRE //
)
public class LoadManagementImpl extends AbstractOpenemsComponent implements LoadManagement, Controller, OpenemsComponent {

	private Config config = null;
	private static final String USER_AGENT = "Mozilla/5.0";

	public LoadManagementImpl() {
		super(//
				OpenemsComponent.ChannelId.values(), //
				Controller.ChannelId.values(), //
				LoadManagement.ChannelId.values() //
		);
	}

	@Activate
	void activate(ComponentContext context, Config config) {
		super.activate(context, config.id(), config.alias(), config.enabled());
		this.config = config;
		this._setButtonStatusOff(0);
		this._setButtonStatusOn(0);
	}

	@Deactivate
	protected void deactivate() {
		super.deactivate();
	}

	@Override
	public void run() throws OpenemsNamedException {
		
		try {
			this.sendGet();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		try {
			if (this.getButtonStatusOffChannel().value().get() == 1) {
				try {
					this.sendPowerOffRequest();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				this._setButtonStatusOff(0);
			}
		} catch (Exception e) {
			System.out.println("Cannot get Button Off status.");
		}
		
		try {
			if (this.getButtonStatusOnChannel().value().get() == 1) {
				try {
					this.sendPowerOnRequest();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				this._setButtonStatusOn(0);
			}
		} catch (Exception e) {
			System.out.println("Cannot get Button On status.");
		}
	}
	
	private void sendGet() throws IOException {
		URL obj = new URL(this.config.apiUrl());
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
		con.setRequestMethod("GET");
		con.setRequestProperty("User-Agent", USER_AGENT);
		int responseCode = con.getResponseCode();
		System.out.println("Fetch Data - GET Response Code: " + responseCode);
		
		if (responseCode == HttpURLConnection.HTTP_OK) { // success
			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String inputLine;
			StringBuffer response = new StringBuffer();

			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			
			//System.out.println(response);
			//System.out.println(JsonParser.parseString(response.toString()).isJsonObject());

			in.close();

			if (JsonParser.parseString(response.toString()).isJsonObject()) {

				JsonObject jo = JsonParser.parseString(response.toString()).getAsJsonObject();
				JsonObject jo_=(JsonObject) jo.get("StatusSNS").getAsJsonObject().get("ENERGY");

				//System.out.println("PRINTING JSON OBJECT (if JSON is fetched?): " + jo_ );

				this._setTotal(jo_.get("Total").getAsDouble());
				this._setYesterday(jo_.get("Yesterday").getAsDouble());
				this._setToday(jo_.get("Today").getAsDouble());
				this._setPower(jo_.get("Power").getAsDouble());
				this._setApparentPower(jo_.get("ApparentPower").getAsDouble());
				this._setReactivePower(jo_.get("ReactivePower").getAsDouble());
				this._setFactor(jo_.get("Factor").getAsDouble());
				this._setVoltage(jo_.get("Voltage").getAsDouble());
				this._setCurrent(jo_.get("Current").getAsDouble());
				
//				System.out.println("PRINTING GRID FEED IN W (GET): " + jo.get("GridFeedIn_W").getAsDouble());
//				this._setGridFeedInW(jo.get("GridFeedIn_W").getAsDouble());
				System.out.println("PRINTING values of buttons: " + this.getButtonStatusOffChannel().value() + this.getButtonStatusOnChannel().value());
				System.out.println("Reactive: " + this.getReactivePowerChannel());
				System.out.println("Reactive: " + this.getTodayChannel());
				
			} else {
				System.out.println("Not JsonObject.");
				System.out.println("JsonArray:" + JsonParser.parseString(response.toString()).isJsonArray());
			}
		}
		
	}
	
	private void sendPowerOnRequest() throws IOException {
		String url = config.powerOnUrl();
		System.out.println("Charge URL: " + url);
		URL obj = new URL(url);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
		con.setRequestMethod("GET");
		con.setRequestProperty("User-Agent", USER_AGENT);

		int responseCode = con.getResponseCode();
		System.out.println("Send Power On request - GET Response Code:  " + responseCode);
		// System.out.println("GET Response Message : " + con.getResponseMessage());

		if (responseCode == HttpURLConnection.HTTP_OK) { // success
			System.out.println("On command sent.");

		} else {
			System.out.println("GET not working in Power On request.");
		}
	}
	
	private void sendPowerOffRequest() throws IOException {
		String url = config.powerOffUrl();
		System.out.println("Charge URL: " + url);
		URL obj = new URL(url);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
		con.setRequestMethod("GET");
		con.setRequestProperty("User-Agent", USER_AGENT);

		int responseCode = con.getResponseCode();
		System.out.println("Send Power Off request - GET Response Code:  " + responseCode);
		// System.out.println("GET Response Message : " + con.getResponseMessage());

		if (responseCode == HttpURLConnection.HTTP_OK) { // success
			System.out.println("On command sent.");

		} else {
			System.out.println("GET not working in Power Off request.");
		}
	}
	
	public void receiveChannelValues(String channelValues) {

		if (JsonParser.parseString(channelValues.toString()).isJsonObject()) {
			JsonObject jo = JsonParser.parseString(channelValues.toString()).getAsJsonObject();

			System.out.println("\n");
			System.out.println(jo);
			System.out.println("\n");

			if (jo.get("buttonStatusOn") != null) {
				this._setButtonStatusOn(jo.get("buttonStatusOn").getAsInt());
			}
			
			if (jo.get("buttonStatusOff") != null) {
				this._setButtonStatusOff(jo.get("buttonStatusOff").getAsInt());
			}
		}
		
	}
	
}
