package io.openems.edge.controller.linechart;

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
import io.openems.edge.common.channel.Doc;
import io.openems.edge.common.channel.DoubleWriteChannel;
import io.openems.edge.common.channel.StringWriteChannel;
import io.openems.edge.common.component.AbstractOpenemsComponent;
import io.openems.edge.common.component.OpenemsComponent;
import io.openems.edge.controller.api.Controller;

public interface LineChart extends Controller, OpenemsComponent {

	public enum ChannelId implements io.openems.edge.common.channel.ChannelId {
		PRODUCTION_W(Doc.of(OpenemsType.DOUBLE).unit(Unit.WATT).accessMode(AccessMode.READ_WRITE)
				.persistencePriority(PersistencePriority.HIGH)),
		TIMESTAMP(Doc.of(OpenemsType.STRING).unit(Unit.NONE).accessMode(AccessMode.READ_WRITE)
				.persistencePriority(PersistencePriority.HIGH)),
		;

		private final Doc doc;

		private ChannelId(Doc doc) {
			this.doc = doc;
		}

		@Override
		public Doc doc() {
			return this.doc;
		}
	}
	
	public default DoubleWriteChannel getProductionW() {
		return this.channel(ChannelId.PRODUCTION_W);
	}

	public default void _setProductionW(double value) {
		this.getProductionW().setNextValue(value);
	}
	public default StringWriteChannel getTimestamp() {
		return this.channel(ChannelId.TIMESTAMP);
	}

	public default void _setTimestamp(String value) {
		this.getTimestamp().setNextValue(value);
	}

	public Config getConfig();
}
