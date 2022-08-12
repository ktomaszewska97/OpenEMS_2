package io.openems.edge.controller.LoadManagement;

import org.osgi.service.component.ComponentContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.metatype.annotations.Designate;

import io.openems.common.channel.AccessMode;
import io.openems.common.channel.PersistencePriority;
import io.openems.common.channel.Unit;
import io.openems.common.exceptions.OpenemsError.OpenemsNamedException;
import io.openems.common.types.OpenemsType;
import io.openems.edge.common.channel.BooleanWriteChannel;
import io.openems.edge.common.channel.Doc;
import io.openems.edge.common.channel.DoubleWriteChannel;
import io.openems.edge.common.channel.IntegerWriteChannel;
import io.openems.edge.common.channel.StringDoc;
import io.openems.edge.common.channel.StringWriteChannel;
import io.openems.edge.common.component.AbstractOpenemsComponent;
import io.openems.edge.common.component.OpenemsComponent;
import io.openems.edge.controller.api.Controller;

public interface LoadManagement extends Controller, OpenemsComponent {

	public enum ChannelId implements io.openems.edge.common.channel.ChannelId {
		TOTAL_START_TIME(Doc.of(OpenemsType.STRING).unit(Unit.NONE).accessMode(AccessMode.READ_WRITE)
				.persistencePriority(PersistencePriority.HIGH)),
		TOTAL(Doc.of(OpenemsType.DOUBLE).unit(Unit.NONE).accessMode(AccessMode.READ_WRITE)
				.persistencePriority(PersistencePriority.HIGH)),
		YESTERDAY(Doc.of(OpenemsType.DOUBLE).unit(Unit.NONE).accessMode(AccessMode.READ_WRITE)
				.persistencePriority(PersistencePriority.HIGH)),
		TODAY(Doc.of(OpenemsType.DOUBLE).unit(Unit.NONE).accessMode(AccessMode.READ_WRITE)
				.persistencePriority(PersistencePriority.HIGH)),
		POWER(Doc.of(OpenemsType.DOUBLE).unit(Unit.NONE).accessMode(AccessMode.READ_WRITE)
				.persistencePriority(PersistencePriority.HIGH)),
		APPARENT_POWER(Doc.of(OpenemsType.DOUBLE).unit(Unit.NONE).accessMode(AccessMode.READ_WRITE)
				.persistencePriority(PersistencePriority.HIGH)),
		REACTIVE_POWER(Doc.of(OpenemsType.DOUBLE).unit(Unit.NONE).accessMode(AccessMode.READ_WRITE)
				.persistencePriority(PersistencePriority.HIGH)),
		FACTOR(Doc.of(OpenemsType.DOUBLE).unit(Unit.NONE).accessMode(AccessMode.READ_WRITE)
				.persistencePriority(PersistencePriority.HIGH)),
		VOLTAGE(Doc.of(OpenemsType.DOUBLE).unit(Unit.NONE).accessMode(AccessMode.READ_WRITE)
				.persistencePriority(PersistencePriority.HIGH)),
		CURRENT(Doc.of(OpenemsType.DOUBLE).unit(Unit.NONE).accessMode(AccessMode.READ_WRITE)
				.persistencePriority(PersistencePriority.HIGH)),
		BUTTON_STATUS_ON(Doc.of(OpenemsType.INTEGER).unit(Unit.NONE).accessMode(AccessMode.READ_WRITE)
				.persistencePriority(PersistencePriority.HIGH)),
		BUTTON_STATUS_OFF(Doc.of(OpenemsType.INTEGER).unit(Unit.NONE).accessMode(AccessMode.READ_WRITE)
				.persistencePriority(PersistencePriority.HIGH)),
		CHANNEL_VALUES(new StringDoc() //
				.unit(Unit.NONE) //
				.accessMode(AccessMode.READ_WRITE) //
				.onInit(channel -> { //
					// on each Write to the channel -> set the value
					((StringWriteChannel) channel).onSetNextWrite(value -> {
						LoadManagementImpl newdevice = (LoadManagementImpl) channel.getComponent();
						newdevice.receiveChannelValues(value);
						channel.setNextValue(value);
					});
				})),
		;
		//factor=power factor
		//TotalStartTime + yesterday - ignore in the UI
		//StatusSNS igore and not in the channel
		private final Doc doc;

		private ChannelId(Doc doc) {
			this.doc = doc;
		}

		@Override
		public Doc doc() {
			return this.doc;
		}
	}
	
	public default StringWriteChannel getTotalStartTimeChannel() {
		return this.channel(ChannelId.TOTAL_START_TIME);
	}

	public default void _setTotalStartTime(String value) {
		this.getTotalStartTimeChannel().setNextValue(value);
	}
	
	public default DoubleWriteChannel getTotalChannel() {
		return this.channel(ChannelId.TOTAL);
	}

	public default void _setTotal(double value) {
		this.getTotalChannel().setNextValue(value);
	}
	
	public default DoubleWriteChannel getYesterdayChannel() {
		return this.channel(ChannelId.YESTERDAY);
	}

	public default void _setYesterday(double value) {
		this.getYesterdayChannel().setNextValue(value);
	}
	
	public default DoubleWriteChannel getTodayChannel() {
		return this.channel(ChannelId.TODAY);
	}

	public default void _setToday(double value) {
		this.getYesterdayChannel().setNextValue(value);
	}
	
	public default DoubleWriteChannel getPowerChannel() {
		return this.channel(ChannelId.POWER);
	}

	public default void _setPower(double value) {
		this.getPowerChannel().setNextValue(value);
	}
	
	public default DoubleWriteChannel getApparentPowerChannel() {
		return this.channel(ChannelId.APPARENT_POWER);
	}

	public default void _setApparentPower(double value) {
		this.getApparentPowerChannel().setNextValue(value);
	}
	
	public default DoubleWriteChannel getReactivePowerChannel() {
		return this.channel(ChannelId.REACTIVE_POWER);
	}

	public default void _setReactivePower(double value) {
		this.getReactivePowerChannel().setNextValue(value);
	}
	
	public default DoubleWriteChannel getFactorChannel() {
		return this.channel(ChannelId.FACTOR);
	}

	public default void _setFactor(double value) {
		this.getFactorChannel().setNextValue(value);
	}
	
	public default DoubleWriteChannel getVoltageChannel() {
		return this.channel(ChannelId.VOLTAGE);
	}

	public default void _setVoltage(double value) {
		this.getVoltageChannel().setNextValue(value);
	}
	
	public default DoubleWriteChannel getCurrentChannel() {
		return this.channel(ChannelId.CURRENT);
	}

	public default void _setCurrent(double value) {
		this.getCurrentChannel().setNextValue(value);
	}
	
	public default IntegerWriteChannel getButtonStatusOnChannel() {
		return this.channel(ChannelId.BUTTON_STATUS_ON);
	}

	public default void _setButtonStatusOn(int value) {
		this.getButtonStatusOnChannel().setNextValue(value);
	}
	
	public default IntegerWriteChannel getButtonStatusOffChannel() {
		return this.channel(ChannelId.BUTTON_STATUS_OFF);
	}

	public default void _setButtonStatusOff(int value) {
		this.getButtonStatusOffChannel().setNextValue(value);
	}
	
	public default StringWriteChannel getChannelValues() {
		return this.channel(ChannelId.CHANNEL_VALUES);
	}

	public default void _setChannelValues(String value) {
		this.getChannelValues().setNextValue(value);
	}
}
