package io.openems.edge.sma;

import io.openems.common.channel.AccessMode;
import io.openems.common.channel.Unit;
import io.openems.common.types.OpenemsType;
import io.openems.edge.common.channel.ChannelId;
import io.openems.edge.common.channel.Doc;
import io.openems.edge.sma.enums.AbsorptionPhaseActive;
import io.openems.edge.sma.enums.AcknowledgeGeneratorErrors;
import io.openems.edge.sma.enums.ActiveBatteryChargingMode;
import io.openems.edge.sma.enums.AutomaticFrequencySynchronization;
import io.openems.edge.sma.enums.AutomaticGeneratorStart;
import io.openems.edge.sma.enums.BatteryType;
import io.openems.edge.sma.enums.BmsOperatingMode;
import io.openems.edge.sma.enums.ConfigurationOfTheCosphiEndPoint;
import io.openems.edge.sma.enums.ConfigurationOfTheCosphiStartingPoint;
import io.openems.edge.sma.enums.ControlOfBatteryChargingViaCommunicationAvailable;
import io.openems.edge.sma.enums.DataTransferRateOfNetworkTerminalA;
import io.openems.edge.sma.enums.DuplexModeOfNetworkTerminalA;
import io.openems.edge.sma.enums.GeneratorStatus;
import io.openems.edge.sma.enums.GridCreatingGenerator;
import io.openems.edge.sma.enums.GridRequestViPowerSwitchOn;
import io.openems.edge.sma.enums.GridRequestViaChargeType;
import io.openems.edge.sma.enums.ManualControlOfNetworkConnection;
import io.openems.edge.sma.enums.ManualEqualizationCharge;
import io.openems.edge.sma.enums.ManualGeneratorStart;
import io.openems.edge.sma.enums.MemoryCardStatus;
import io.openems.edge.sma.enums.MeterSetting;
import io.openems.edge.sma.enums.MultifunctionRelayStatus;
import io.openems.edge.sma.enums.OperatingModeForActivePowerLimitation;
import io.openems.edge.sma.enums.OperatingModeOfActivePowerLimitationAtOverFrequency;
import io.openems.edge.sma.enums.PowerFeedbackToPublicGridAllowed;
import io.openems.edge.sma.enums.PowerSupplyStatus;
import io.openems.edge.sma.enums.PvMainsConnection;
import io.openems.edge.sma.enums.ReasonForGeneratorRequest;
import io.openems.edge.sma.enums.RepetitionCycleOfTheControlledInverter;
import io.openems.edge.sma.enums.RepetitionCycleOfTheTimeControlledGeneratorOperation;
import io.openems.edge.sma.enums.RiseInSelfConsumptionSwitchedOn;
import io.openems.edge.sma.enums.SetControlMode;
import io.openems.edge.sma.enums.SpeedWireConnectionStatusOfNetworkTerminalA;
import io.openems.edge.sma.enums.StatusBatteryApplicationArea;
import io.openems.edge.sma.enums.StatusDigitalInput;
import io.openems.edge.sma.enums.StatusOfUtilityGrid;
import io.openems.edge.sma.enums.SystemState;
import io.openems.edge.sma.enums.TimeControlledGeneratorOperation;
import io.openems.edge.sma.enums.TimeControlledInverterOperation;
import io.openems.edge.sma.enums.TypeOfAcSubdistribution;

public enum SiChannelId implements ChannelId {
	// EnumReadChannels
	SPEED_WIRE_CONNECTION_STATUS_OF_NETWORK_TERMINAL_A(Doc.of(SpeedWireConnectionStatusOfNetworkTerminalA.values())), //
	SYSTEM_STATE(Doc.of(SystemState.values())), //
	ACTIVE_BATTERY_CHARGING_MODE(Doc.of(ActiveBatteryChargingMode.values())), //
	MULTIFUNCTION_RELAY_STATUS(Doc.of(MultifunctionRelayStatus.values())), //
	POWER_SUPPLY_STATUS(Doc.of(PowerSupplyStatus.values())), //
	REASON_FOR_GENERATOR_REQUEST(Doc.of(ReasonForGeneratorRequest.values())), //
	PV_MAINS_CONNECTION(Doc.of(PvMainsConnection.values())), //
	STATUS_OF_UTILITY_GRID(Doc.of(StatusOfUtilityGrid.values())), //
	GENERATOR_STATUS(Doc.of(GeneratorStatus.values())), //
	DATA_TRANSFER_RATE_OF_NETWORK_TERMINAL_A(Doc.of(DataTransferRateOfNetworkTerminalA.values())), //
	DUPLEX_MODE_OF_NETWORK_TERMINAL_A(Doc.of(DuplexModeOfNetworkTerminalA.values())), //
	STATUS_BATTERY_APPLICATION_AREA(Doc.of(StatusBatteryApplicationArea.values())), //
	ABSORPTION_PHASE_ACTIVE(Doc.of(AbsorptionPhaseActive.values())), //
	CONTROL_OF_BATTERY_CHARGING_VIA_COMMUNICATION_AVAILABLE(
			Doc.of(ControlOfBatteryChargingViaCommunicationAvailable.values())), //
	STATUS_DIGITAL_INPUT(Doc.of(StatusDigitalInput.values())), //
	BATTERY_TYPE(Doc.of(BatteryType.values())), //
	TYPE_OF_AC_SUBDISTRIBUTION(Doc.of(TypeOfAcSubdistribution.values())), //
	OPERATING_MODE_FOR_ACTIVE_POWER_LIMITATION(Doc.of(OperatingModeForActivePowerLimitation.values())), //

	// EnumWriteChannsl
	AUTOMATIC_GENERATOR_START(Doc.of(AutomaticGeneratorStart.values())), //
	MANUAL_GENERATOR_CONTROL(Doc.of(ManualGeneratorStart.values())), //
	GRID_CREATING_GENERATOR(Doc.of(GridCreatingGenerator.values())), //
	RISE_IN_SELF_CONSUMPTION_SWITCHED_ON(Doc.of(RiseInSelfConsumptionSwitchedOn.values())), //
	ACKNOWLEGDE_GENERATOR_ERRORS(Doc.of(AcknowledgeGeneratorErrors.values())), //
	OPERATING_MODE_OF_ACTIVE_POWER_LIMITATION_AT_OVERFREQUENCY(
			Doc.of(OperatingModeOfActivePowerLimitationAtOverFrequency.values())), //
	CONFIGURATION_OF_THE_COSPHI_STARTING_POINT(Doc.of(ConfigurationOfTheCosphiStartingPoint.values())), //
	CONFIGURATION_OF_THE_COSPHI_END_POINT(Doc.of(ConfigurationOfTheCosphiEndPoint.values())), //
	BMS_OPERATING_MODE(Doc.of(BmsOperatingMode.values())), //
	GRID_REQUEST_VIA_POWER_SWITCH_ON(Doc.of(GridRequestViPowerSwitchOn.values())), //
	MANUAL_CONTROL_OF_NETWORK_CONNECTION(Doc.of(ManualControlOfNetworkConnection.values())), //
	GRID_REQUEST_VIA_CHARGE_TYPE(Doc.of(GridRequestViaChargeType.values())), //
	MANUAL_EQUAIZATION_CHARGE(Doc.of(ManualEqualizationCharge.values())), //
	TIME_CONTROLLED_GENERATOR_OPERATION(Doc.of(TimeControlledGeneratorOperation.values())), //
	REPETITION_CYCLE_OF_TIME_CONTROLLED_GENERATOR_OPERATION(
			Doc.of(RepetitionCycleOfTheTimeControlledGeneratorOperation.values())), //
	TIME_CONTROLLED_INVERTER_OPERATION(Doc.of(TimeControlledInverterOperation.values())), //
	REPETITION_CYCLE_OF_TIME_CONTROLLED_INVERTER(Doc.of(RepetitionCycleOfTheControlledInverter.values())), //
	MEMORY_CARD_STATUS(Doc.of(MemoryCardStatus.values())), //
	AUTOMATIC_FREQUENCY_SYNCHRONIZATION(Doc.of(AutomaticFrequencySynchronization.values())), //
	POWER_FEEDBACK_TO_PUBLIC_GRID_ALLOWED(Doc.of(PowerFeedbackToPublicGridAllowed.values())), //
	SET_CONTROL_MODE(Doc.of(SetControlMode.values()).accessMode(AccessMode.READ_WRITE)), //
	METER_SETTING(Doc.of(MeterSetting.values())), //

	// LongReadChannels
	SERIAL_NUMBER(Doc.of(OpenemsType.LONG)), //
	CURRENT_BATTERY_CHARGING_SET_VOLTAGE(Doc.of(OpenemsType.LONG) //
			.unit(Unit.VOLT)), //
	CURRENT_SELF_CONSUMPTION(Doc.of(OpenemsType.LONG) //
			.unit(Unit.WATT)), //
	BATTERY_CHARGING_SOC(Doc.of(OpenemsType.LONG) //
			.unit(Unit.WATT)), //
	BATTERY_DISCHARGING_SOC(Doc.of(OpenemsType.LONG) //
			.unit(Unit.WATT)), //
	REMAINING_TIME_UNTIL_FULL_CHARGE(Doc.of(OpenemsType.LONG) //
			.unit(Unit.SECONDS)), //
	REMAINING_TIME_UNTIL_EQUALIZATION_CHARGE(Doc.of(OpenemsType.LONG) //
			.unit(Unit.SECONDS)), //
	RATED_BATTERY_CAPACITY(Doc.of(OpenemsType.LONG)), //

	// IntegerWriteChannels
	BATTERY_BOOST_CHARGE_TIME(Doc.of(OpenemsType.INTEGER) //
			.accessMode(AccessMode.WRITE_ONLY) //
			.unit(Unit.MINUTE)), //
	BATTERY_EQUALIZATION_CHARGE_TIME(Doc.of(OpenemsType.INTEGER) //
			.accessMode(AccessMode.WRITE_ONLY) //
			.unit(Unit.HOUR)), //
	BATTERY_FULL_CHARGE_TIME(Doc.of(OpenemsType.INTEGER) //
			.accessMode(AccessMode.WRITE_ONLY) //
			.unit(Unit.HOUR)), //
	MAX_BATTERY_CHARGING_CURRENT(Doc.of(OpenemsType.INTEGER) //
			.accessMode(AccessMode.WRITE_ONLY) //
			.unit(Unit.AMPERE)), //
	RATED_GENERATOR_CURRENT(Doc.of(OpenemsType.INTEGER) //
			.accessMode(AccessMode.WRITE_ONLY) //
			.unit(Unit.AMPERE)), //
	GENERATOR_REQUEST_VIA_POWER_ON(Doc.of(OpenemsType.INTEGER)), //
	GENERATOR_SHUT_DOWN_LOAD_LIMIT(Doc.of(OpenemsType.INTEGER) //
			.accessMode(AccessMode.WRITE_ONLY) //
			.unit(Unit.WATT)), //
	GENERATOR_START_UP_LOAD_LIMIT(Doc.of(OpenemsType.INTEGER) //
			.accessMode(AccessMode.WRITE_ONLY) //
			.unit(Unit.WATT)), //
	INITIATE_DEVICE_RESTART(Doc.of(OpenemsType.INTEGER)), //
	CELL_CHARGE_NOMINAL_VOLTAGE_FOR_BOOST_CHARGE(Doc.of(OpenemsType.INTEGER) //
			.accessMode(AccessMode.WRITE_ONLY) //
			.unit(Unit.VOLT)), //
	CELL_CHARGE_NOMINAL_VOLTAGE_FOR_FULL_CHARGE(Doc.of(OpenemsType.INTEGER) //
			.accessMode(AccessMode.WRITE_ONLY) //
			.unit(Unit.VOLT)), //
	CELL_CHARGE_NOMINAL_VOLTAGE_FOR_EQUALIZATION_CHARGE(Doc.of(OpenemsType.INTEGER) //
			.accessMode(AccessMode.WRITE_ONLY) //
			.unit(Unit.VOLT)), //
	CELL_CHARGE_NOMINAL_VOLTAGE_FOR_FLOAT_CHARGE(Doc.of(OpenemsType.INTEGER) //
			.accessMode(AccessMode.WRITE_ONLY) //
			.unit(Unit.VOLT)), //
	VOLTAGE_MONITORING_UPPER_MINIMUM_THRESHOLD(Doc.of(OpenemsType.INTEGER) //
			.accessMode(AccessMode.WRITE_ONLY) //
			.unit(Unit.VOLT)), //
	VOLTAGE_MONITORING_UPPER_MAXIMUM_THRESHOLD(Doc.of(OpenemsType.INTEGER) //
			.accessMode(AccessMode.WRITE_ONLY) //
			.unit(Unit.VOLT)), //
	VOLTAGE_MONITORING_HYSTERESIS_MINIMUM_THRESHOLD(Doc.of(OpenemsType.INTEGER) //
			.accessMode(AccessMode.WRITE_ONLY) //
			.unit(Unit.VOLT)), //
	VOLTAGE_MONITORING_HYSTERESIS_MAXIMUM_THRESHOLD(Doc.of(OpenemsType.INTEGER) //
			.accessMode(AccessMode.WRITE_ONLY) //
			.unit(Unit.VOLT)), //
	FREQUENCY_MONITORING_UPPER_MINIMUM_THRESHOLD(Doc.of(OpenemsType.INTEGER) //
			.accessMode(AccessMode.WRITE_ONLY) //
			.unit(Unit.HERTZ)), //
	FREQUENCY_MONITORING_UPPER_MAXIMUM_THRESHOLD(Doc.of(OpenemsType.INTEGER) //
			.accessMode(AccessMode.WRITE_ONLY) //
			.unit(Unit.HERTZ)), //
	FREQUENCY_MONITORING_HYSTERESIS_MINIMUM_THRESHOLD(Doc.of(OpenemsType.INTEGER) //
			.accessMode(AccessMode.WRITE_ONLY) //
			.unit(Unit.HERTZ)), //
	FREQUENCY_MONITORING_HYSTERESIS_MAXIMUM_THRESHOLD(Doc.of(OpenemsType.INTEGER) //
			.accessMode(AccessMode.WRITE_ONLY) //
			.unit(Unit.HERTZ)), //
	VOLTAGE_MONITORING_GENERATOR_MINIMUM_THRESHOLD(Doc.of(OpenemsType.INTEGER) //
			.accessMode(AccessMode.WRITE_ONLY) //
			.unit(Unit.VOLT)), //
	VOLTAGE_MONITORING_GENERATOR_MAXIMUM_THRESHOLD(Doc.of(OpenemsType.INTEGER) //
			.accessMode(AccessMode.WRITE_ONLY) //
			.unit(Unit.VOLT)), //
	FREQUENCY_MONITORING_GENERATOR_MINIMUM_THRESHOLD(Doc.of(OpenemsType.INTEGER) //
			.accessMode(AccessMode.WRITE_ONLY) //
			.unit(Unit.HERTZ)), //
	FREQUENCY_MONITORING_GENERATOR_MAXIMUM_THRESHOLD(Doc.of(OpenemsType.INTEGER) //
			.accessMode(AccessMode.WRITE_ONLY) //
			.unit(Unit.HERTZ)), //
	VOLTAGE_MONITORING_GENERATOR_MAXIMUM_REVERSE_POWER(Doc.of(OpenemsType.INTEGER)), //
	VOLTAGE_MONITORING_GENERATOR_MAXIMUM_REVERSE_POWER_TRIPPING_TIME(Doc.of(OpenemsType.INTEGER) //
			.accessMode(AccessMode.WRITE_ONLY) //
			.unit(Unit.SECONDS)), //
	NOMINAL_FREQUENCY(Doc.of(OpenemsType.INTEGER) //
			.accessMode(AccessMode.WRITE_ONLY) //
			.unit(Unit.HERTZ)), //
	DIFFERENCE_BETWEEN_STARTING_FREQ_AND_GRID_FREQ(Doc.of(OpenemsType.INTEGER) //
			.accessMode(AccessMode.WRITE_ONLY) //
			.unit(Unit.HERTZ)), //
	DIFFERENCE_BETWEEN_RESET_FREQ_AND_GRID_FREQ(Doc.of(OpenemsType.INTEGER) //
			.accessMode(AccessMode.WRITE_ONLY) //
			.unit(Unit.HERTZ)), //
	COSPHI_AT_STARTING_POINT(Doc.of(OpenemsType.INTEGER) //
			.accessMode(AccessMode.WRITE_ONLY) //
			.unit(Unit.HERTZ)), //
	COSPHI_AT_THE_END_POINT(Doc.of(OpenemsType.INTEGER) //
			.accessMode(AccessMode.WRITE_ONLY) //
			.unit(Unit.HERTZ)), //
	ACTIVE_POWER_AT_STARTING_POINT(Doc.of(OpenemsType.INTEGER) //
			.accessMode(AccessMode.WRITE_ONLY) //
			.unit(Unit.PERCENT)), //
	ACTIVE_POWER_AT_END_POINT(Doc.of(OpenemsType.INTEGER) //
			.accessMode(AccessMode.WRITE_ONLY) //
			.unit(Unit.PERCENT)), //
	ACTIVE_POWER_GRADIENT_CONFIGURATION(Doc.of(OpenemsType.INTEGER) //
			.accessMode(AccessMode.WRITE_ONLY) //
			.unit(Unit.PERCENT)), //
	GRID_REQUEST_SWITCH_ON_POWER_LIMIT(Doc.of(OpenemsType.INTEGER) //
			.accessMode(AccessMode.WRITE_ONLY) //
			.unit(Unit.WATT)), //
	GRID_REQUEST_SWITCH_OFF_POWER_LIMIT(Doc.of(OpenemsType.INTEGER) //
			.accessMode(AccessMode.WRITE_ONLY) //
			.unit(Unit.WATT)), //
	GENERATOR_REQUEST(Doc.of(OpenemsType.INTEGER)), //
	LIMIT_SOC_GENERATOR_START_IN_TIME_RANGE(Doc.of(OpenemsType.INTEGER) //
			.accessMode(AccessMode.WRITE_ONLY) //
			.unit(Unit.PERCENT)), //
	LIMIT_SOC_GENERATOR_SHUTDOWN_IN_TIME_RANGE(Doc.of(OpenemsType.INTEGER) //
			.accessMode(AccessMode.WRITE_ONLY) //
			.unit(Unit.PERCENT)), //
	START_TIME_ADDTIONAL_TIME_RANGE_GENERATOR_REQUEST(Doc.of(OpenemsType.INTEGER)), //
	START_TIME_RANGE_FOR_GENERATOR_REQUEST(Doc.of(OpenemsType.INTEGER)), //
	LIMIT_SOC_GENERATOR_STOP_ADD_IN_TIME_RANGE(Doc.of(OpenemsType.INTEGER) //
			.accessMode(AccessMode.WRITE_ONLY) //
			.unit(Unit.PERCENT)), //
	LIMIT_SOC_GENERATOR_START_ADD_IN_TIME_RANGE(Doc.of(OpenemsType.INTEGER) //
			.accessMode(AccessMode.WRITE_ONLY) //
			.unit(Unit.PERCENT)), //
	START_TIME_FOR_TIME_CONTROLLED_GENERATOR_OPERATION(Doc.of(OpenemsType.INTEGER)), //
	OPERATING_TIME_FOR_TIME_CONTROLLED_GENERATOR_OPERATION(Doc.of(OpenemsType.INTEGER)), //
	GENERATOR_REQUEST_WITH_SET_CHARGE_TYPE(Doc.of(OpenemsType.INTEGER)), //
	REACTION_TO_DIGITAL_INPUT_OF_GENERATOR_REQUEST(Doc.of(OpenemsType.INTEGER)), //
	AVERAGE_TIME_FOR_GENERATOR_REQUEST_VIA_POWER(Doc.of(OpenemsType.INTEGER) //
			.accessMode(AccessMode.WRITE_ONLY) //
			.unit(Unit.SECONDS)), //
	AVERAGE_OPERATING_TIME_OF_GENERATOR(Doc.of(OpenemsType.INTEGER) //
			.accessMode(AccessMode.WRITE_ONLY) //
			.unit(Unit.SECONDS)), //
	AVERAGE_IDLE_PERIOD_OF_GENERATOR(Doc.of(OpenemsType.INTEGER) //
			.accessMode(AccessMode.WRITE_ONLY) //
			.unit(Unit.SECONDS)), //
	COOLING_DOWN_TIME_OF_GENERATOR(Doc.of(OpenemsType.INTEGER) //
			.accessMode(AccessMode.WRITE_ONLY) //
			.unit(Unit.SECONDS)), //
	IDLE_PERIOD_AFTER_GENERATOR_FAULT(Doc.of(OpenemsType.INTEGER) //
			.accessMode(AccessMode.WRITE_ONLY) //
			.unit(Unit.SECONDS)), //
	WARM_UP_TIME_OF_GENERATOR(Doc.of(OpenemsType.INTEGER) //
			.accessMode(AccessMode.WRITE_ONLY) //
			.unit(Unit.SECONDS)), //
	GENERATOR_NOMINAL_FREQUENCY(Doc.of(OpenemsType.INTEGER) //
			.accessMode(AccessMode.WRITE_ONLY) //
			.unit(Unit.HERTZ)), //
	START_TIME_FOR_TIME_CONTROLLED_INVERTER(Doc.of(OpenemsType.INTEGER)), //
	OPERATING_TIME_FOR_TIME_CONTROLLED_INVERTER(Doc.of(OpenemsType.INTEGER) //
			.accessMode(AccessMode.WRITE_ONLY) //
			.unit(Unit.SECONDS)), //
	DEVICE_NAME(Doc.of(OpenemsType.INTEGER)), //
	AUTOMATIC_UPDATES_ACTIVATED(Doc.of(OpenemsType.INTEGER)), //
	TIME_OF_THE_AUTOMATIC_UPDATE(Doc.of(OpenemsType.INTEGER)), //
	GRID_GUARD_VERSION(Doc.of(OpenemsType.INTEGER)), //
	UPDATE_VERSION_OF_THE_MAIN_PROCESSOR(Doc.of(OpenemsType.INTEGER)), //
	START_FEED_IN_PV(Doc.of(OpenemsType.INTEGER)), //
	STOP_FEED_IN_PV(Doc.of(OpenemsType.INTEGER)), //
	CUT_OFF_TIME_UNTIL_CONNECTION_TO_EXTERNAL_NETWORK(Doc.of(OpenemsType.INTEGER)), //
	MAXIMUM_CURRENT_FROM_PUBLIC_GRID(Doc.of(OpenemsType.INTEGER)), //
	GRID_REQUEST_VIA_SOC_SWITCHED_ON(Doc.of(OpenemsType.INTEGER)), //
	LIMIT_SOC_FOR_CONNECTION_TO_GRID(Doc.of(OpenemsType.INTEGER)), //
	LIMIT_SOC_FOR_DISCONNECTION_FROM_GRID(Doc.of(OpenemsType.INTEGER)), //
	START_TIME_ADDTIONAL_TIME_RANGE_GRID_REQUEST(Doc.of(OpenemsType.INTEGER)), //
	START_INTERVAL_GRID_REQUEST(Doc.of(OpenemsType.INTEGER)), //
	LIMIT_SOC_FOR_CONNECT_TO_GRID_IN_ADD_TIME_RANGE(Doc.of(OpenemsType.INTEGER)), //
	LIMIT_SOC_FOR_DISCONNECT_FROM_GRID_IN_ADD_TIME_RANGE(Doc.of(OpenemsType.INTEGER)), //
	ENERGY_SAVING_MODE_SWITCH_ON(Doc.of(OpenemsType.INTEGER)), //
	MAXIMUM_GRID_REVERSE_POWER(Doc.of(OpenemsType.INTEGER)), //
	MAXIMUM_GRID_REVERSE_POWER_TRIPPING_TIME(Doc.of(OpenemsType.INTEGER)), //
	TIME_UNTIL_CHANGE_OVER_TO_ENERGY_SAVING_MODE(Doc.of(OpenemsType.INTEGER)), //
	MAXIMUM_DURATION_OF_ENERGY_SAVING_MODE(Doc.of(OpenemsType.INTEGER)), //
	START_TIME_OF_BATTERY_PROTECTION_MODE_LEVEL(Doc.of(OpenemsType.INTEGER)), //
	END_TIME_OF_BATTERY_PROTECTION_MODE_LEVEL(Doc.of(OpenemsType.INTEGER)), //
	BATTERY_SOC_FOR_PROTECTION_MODE(Doc.of(OpenemsType.INTEGER)), //
	BATTERY_SWITCH_ONLIMIT_AFTER_OVER_TEMP_SHUT_DOWN(Doc.of(OpenemsType.INTEGER)), //
	OUTPUT_RESISTANCE_OF_BATTERY_CONNECTION(Doc.of(OpenemsType.INTEGER)), //
	LOWER_LIMIT_DEEP_DISCHARGE_PROTECT_AREA_PRIOR_SHUTDOWN(Doc.of(OpenemsType.INTEGER)), //
	MINIMUM_WIDTH_OF_DEEP_DISCHARGE_PROTECTION_AREA(Doc.of(OpenemsType.INTEGER)), //
	MINIMUM_WIDTH_OF_BAKCUP_POWER_AREA(Doc.of(OpenemsType.INTEGER)), //
	AREA_WIDTH_FOR_CONSERVING_SOC(Doc.of(OpenemsType.INTEGER)), //
	MINIMUM_WIDTH_OF_OWN_CONSUMPTION_AREA(Doc.of(OpenemsType.INTEGER)), //
	MOST_PRODUCTIVE_MONTH_FOR_BATTERY_USAGE_RANGE(Doc.of(OpenemsType.INTEGER)), //
	SEASON_OPERATION_ACTIVE(Doc.of(OpenemsType.INTEGER)), //
	VOLTAGE_SET_POINT_WITH_DEACTIVATED_BATTERY_MENAGEMENT(Doc.of(OpenemsType.INTEGER)), //
	CYCLE_TIME_FOR_FULL_CHARGE(Doc.of(OpenemsType.INTEGER)), //
	CYCLE_TIME_FOR_EQUALIZATION_CHARGE(Doc.of(OpenemsType.INTEGER)), //
	BATTERY_TEMPERATUR_COMPENSATION(Doc.of(OpenemsType.INTEGER)), //
	AUTOMATIC_EQUALIZATION_CHARGE(Doc.of(OpenemsType.INTEGER)), //
	TYPE_OF_ADDTIONAL_DC_SOURCES(Doc.of(OpenemsType.INTEGER)), //
	LIMITATION_TYPE_OF_GENERATOR_CURRENT(Doc.of(OpenemsType.INTEGER)), //
	SENSIVITY_OF_GENERATOR_FAILURE_DETECTION(Doc.of(OpenemsType.INTEGER)), //
	INVERTER_NOMINAL_VOLTAGE(Doc.of(OpenemsType.INTEGER) //
			.accessMode(AccessMode.WRITE_ONLY) //
			.unit(Unit.VOLT)), //
	INVERTER_NOMINAL_FREQUENCY(Doc.of(OpenemsType.INTEGER) //
			.accessMode(AccessMode.WRITE_ONLY) //
			.unit(Unit.HERTZ)), //
	MAXIMUM_AC_BATTERY_CHARGE_CURRENT(Doc.of(OpenemsType.INTEGER) //
			.accessMode(AccessMode.WRITE_ONLY) //
			.unit(Unit.AMPERE)), //
	LIMIT_VALUE_SOC_FOR_START_LOAD_SHEDDING_1(Doc.of(OpenemsType.INTEGER) //
			.accessMode(AccessMode.WRITE_ONLY) //
			.unit(Unit.PERCENT)), //
	LIMIT_VALUE_SOC_FOR_STOP_LOAD_SHEDDING_1(Doc.of(OpenemsType.INTEGER) //
			.accessMode(AccessMode.WRITE_ONLY) //
			.unit(Unit.PERCENT)), //
	START_TIME_ADDITIONAL_TIME_RANGE_LOAD_SHEDDING_1(Doc.of(OpenemsType.INTEGER)), //
	TIME_LOAD_SHEDDING_1(Doc.of(OpenemsType.INTEGER)), //
	LIMIT_SOC_FOR_START_LOAD_SHEDDING_1_IN_ADD_TIME_RANGE(Doc.of(OpenemsType.INTEGER)), //
	LIMIT_SOC_FOR_STOP_LOAD_SHEDDING_1_IN_ADD_TIME_RANGE(Doc.of(OpenemsType.INTEGER)), //
	LIMIT_VALUE_SOC_FOR_START_LOAD_SHEDDING_2(Doc.of(OpenemsType.INTEGER) //
			.accessMode(AccessMode.WRITE_ONLY) //
			.unit(Unit.PERCENT)), //
	LIMIT_VALUE_SOC_FOR_STOP_LOAD_SHEDDING_2(Doc.of(OpenemsType.INTEGER) //
			.accessMode(AccessMode.WRITE_ONLY) //
			.unit(Unit.PERCENT)), //
	START_TIME_ADDITIONAL_TIME_RANGE_LOAD_SHEDDING_2(Doc.of(OpenemsType.INTEGER)), //
	TIME_LOAD_SHEDDING_2(Doc.of(OpenemsType.INTEGER)), //
	LIMIT_SOC_FOR_START_LOAD_SHEDDING_2_IN_ADD_TIME_RANGE(Doc.of(OpenemsType.INTEGER)), //
	LIMIT_SOC_FOR_STOP_LOAD_SHEDDING_2_IN_ADD_TIME_RANGE(Doc.of(OpenemsType.INTEGER)), //
	CLUSTER_BEHAVIOUR_WHEN_A_DEVICE_FAILS(Doc.of(OpenemsType.INTEGER)), //
	TIME_OUT_FOR_COMMUNICATION_FAULT_INDICATION(Doc.of(OpenemsType.INTEGER)), //
	ENERGY_SAVING_MODE(Doc.of(OpenemsType.INTEGER)), //
	SET_ACTIVE_POWER(Doc.of(OpenemsType.INTEGER) //
			.accessMode(AccessMode.WRITE_ONLY) //
			.unit(Unit.WATT)), //
	SET_REACTIVE_POWER(Doc.of(OpenemsType.INTEGER) //
			.accessMode(AccessMode.WRITE_ONLY) //
			.unit(Unit.VOLT_AMPERE)), //
	MIN_SOC_POWER_ON(Doc.of(OpenemsType.INTEGER)), //
	GRID_GUARD_CODE(Doc.of(OpenemsType.INTEGER)), //
	MIN_SOC_POWER_OFF(Doc.of(OpenemsType.INTEGER)), //
	MAXIMUM_BATTERY_CHARGING_POWER_CAPACITY(Doc.of(OpenemsType.INTEGER)), //
	MAXIMUM_BATTERY_DISCHARGING_POWER_CAPACITY(Doc.of(OpenemsType.INTEGER)), //

	// IntegerReadChannels
	DEVICE_CLASS(Doc.of(OpenemsType.INTEGER)), //
	DEVICE_TYPE(Doc.of(OpenemsType.INTEGER)), //
	SOFTWARE_PACKAGE(Doc.of(OpenemsType.INTEGER)), //
	WAITING_TIME_UNTIL_FEED_IN(Doc.of(OpenemsType.INTEGER) //
			.unit(Unit.SECONDS)), //
	MESSAGE(Doc.of(OpenemsType.INTEGER)), //
	RECOMMENDED_ACTION(Doc.of(OpenemsType.INTEGER)), //
	FAULT_CORRECTION_MEASURE(Doc.of(OpenemsType.INTEGER)), //
	NUMBER_OF_EVENT_FOR_USER(Doc.of(OpenemsType.INTEGER)), //
	NUMBER_OF_EVENT_FOR_INSTALLER(Doc.of(OpenemsType.INTEGER)), //
	NUMBER_OF_EVENT_FOR_SERVICE(Doc.of(OpenemsType.INTEGER)), //
	NUMBER_OF_GENERATORS_STARTS(Doc.of(OpenemsType.INTEGER)), //
	AMP_HOURS_COUNTER_FOR_BATTERY_CHARGE(Doc.of(OpenemsType.INTEGER) //
			.unit(Unit.AMPERE_HOURS)), //
	AMP_HOURS_COUNTER_FOR_BATTERY_DISCHARGE(Doc.of(OpenemsType.INTEGER) //
			.unit(Unit.AMPERE_HOURS)), //
	METER_READING_CONSUMPTION_METER(Doc.of(OpenemsType.INTEGER) //
			.unit(Unit.WATT_HOURS)), //
	ENERGY_CONSUMED_FROM_GRID(Doc.of(OpenemsType.INTEGER) //
			.unit(Unit.WATT_HOURS)), //
	ENERGY_FED_INTO_GRID(Doc.of(OpenemsType.INTEGER) //
			.unit(Unit.WATT_HOURS)), //
	GRID_REFERENCE_COUNTER_READING(Doc.of(OpenemsType.INTEGER) //
			.unit(Unit.WATT_HOURS)), //
	GRID_FEED_IN_COUNTER_READING(Doc.of(OpenemsType.INTEGER) //
			.unit(Unit.WATT_HOURS)), //
	POWER_OUTAGE(Doc.of(OpenemsType.INTEGER) //
			.unit(Unit.SECONDS)), //
	RISE_IN_SELF_CONSUMPTION(Doc.of(OpenemsType.INTEGER) //
			.unit(Unit.WATT_HOURS)), //
	RISE_IN_SELF_CONSUMPTION_TODAY(Doc.of(OpenemsType.INTEGER) //
			.unit(Unit.WATT_HOURS)), //
	ABSORBED_ENERGY(Doc.of(OpenemsType.INTEGER) //
			.unit(Unit.WATT_HOURS)), //
	RELEASED_ENERGY(Doc.of(OpenemsType.INTEGER) //
			.unit(Unit.WATT_HOURS)), //
	NUMBER_OF_GRID_CONNECTIONS(Doc.of(OpenemsType.INTEGER)), //
	GRID_VOLTAGE_L1(Doc.of(OpenemsType.INTEGER) //
			.unit(Unit.VOLT)), //
	GRID_VOLTAGE_L2(Doc.of(OpenemsType.INTEGER) //
			.unit(Unit.VOLT)), //
	GRID_VOLTAGE_L3(Doc.of(OpenemsType.INTEGER) //
			.unit(Unit.VOLT)), //
	FREQUENCY(Doc.of(OpenemsType.INTEGER) //
			.unit(Unit.HERTZ)), //
	COSPHI_SET_POINT_READ(Doc.of(OpenemsType.INTEGER)), //
	CURRENT_BATTERY_CAPACITY(Doc.of(OpenemsType.INTEGER) //
			.unit(Unit.PERCENT)), //
	NUMBER_OF_BATTERY_CHARGE_THROUGHPUTS(Doc.of(OpenemsType.INTEGER)), //
	BATTERY_MAINT_SOC(Doc.of(OpenemsType.INTEGER)), //
	LOAD_POWER(Doc.of(OpenemsType.INTEGER) //
			.unit(Unit.WATT)), //
	POWER_GRID_REFERENCE(Doc.of(OpenemsType.INTEGER) //
			.unit(Unit.WATT)), //
	POWER_GRID_FEED_IN(Doc.of(OpenemsType.INTEGER) //
			.unit(Unit.WATT)), //
	PV_POWER_GENERATED(Doc.of(OpenemsType.INTEGER) //
			.unit(Unit.WATT)), //
	CURRENT_RISE_IN_SELF_CONSUMPTION(Doc.of(OpenemsType.INTEGER) //
			.unit(Unit.WATT)), //
	GRID_FREQ_OF_EXTERNAL_POWER_CONNECTION(Doc.of(OpenemsType.INTEGER) //
			.unit(Unit.HERTZ)), //
	VOLTAGE_EXTERNAL_POWER_CONNECTION_PHASE_A(Doc.of(OpenemsType.INTEGER) //
			.unit(Unit.VOLT)), //
	VOLTAGE_EXTERNAL_POWER_CONNECTION_PHASE_B(Doc.of(OpenemsType.INTEGER) //
			.unit(Unit.VOLT)), //
	VOLTAGE_EXTERNAL_POWER_CONNECTION_PHASE_C(Doc.of(OpenemsType.INTEGER) //
			.unit(Unit.VOLT)), //
	CURRENT_EXTERNAL_POWER_CONNECTION_PHASE_A(Doc.of(OpenemsType.INTEGER) //
			.unit(Unit.AMPERE)), //
	CURRENT_EXTERNAL_POWER_CONNECTION_PHASE_B(Doc.of(OpenemsType.INTEGER) //
			.unit(Unit.AMPERE)), //
	CURRENT_EXTERNAL_POWER_CONNECTION_PHASE_C(Doc.of(OpenemsType.INTEGER) //
			.unit(Unit.AMPERE)), //
	GRID_CURRENT_L1(Doc.of(OpenemsType.INTEGER) //
			.unit(Unit.AMPERE)), //
	GRID_CURRENT_L2(Doc.of(OpenemsType.INTEGER) //
			.unit(Unit.AMPERE)), //
	GRID_CURRENT_L3(Doc.of(OpenemsType.INTEGER) //
			.unit(Unit.AMPERE)), //
	OUTPUT_OF_PHOTOVOLTAICS(Doc.of(OpenemsType.INTEGER)), //
	TOTAL_CURRENT_EXTERNAL_GRID_CONNECTION(Doc.of(OpenemsType.INTEGER) //
			.unit(Unit.AMPERE)), //
	FAULT_BATTERY_SOC(Doc.of(OpenemsType.INTEGER) //
			.unit(Unit.PERCENT)), //
	MAXIMUM_BATTERY_CURRENT_IN_CHARGE_DIRECTION(Doc.of(OpenemsType.INTEGER) //
			.unit(Unit.AMPERE)), //
	MAXIMUM_BATTERY_CURRENT_IN_DISCHARGE_DIRECTION(Doc.of(OpenemsType.INTEGER) //
			.unit(Unit.AMPERE)), //
	CHARGE_FACTOR_RATIO_OF_BATTERY_CHARGE_DISCHARGE(Doc.of(OpenemsType.INTEGER)), //
	OPERATING_TIME_OF_BATTERY_STATISTICS_COUNTER(Doc.of(OpenemsType.INTEGER) //
			.unit(Unit.SECONDS)), //
	LOWEST_MEASURED_BATTERY_TEMPERATURE(Doc.of(OpenemsType.INTEGER) //
			.unit(Unit.DEGREE_CELSIUS)), //
	HIGHEST_MEASURED_BATTERY_TEMPERATURE(Doc.of(OpenemsType.INTEGER) //
			.unit(Unit.DEGREE_CELSIUS)), //
	MAX_OCCURRED_BATTERY_VOLTAGE(Doc.of(OpenemsType.INTEGER) //
			.unit(Unit.VOLT)), //

	REMAINING_ABSORPTION_TIME(Doc.of(OpenemsType.INTEGER) //
			.unit(Unit.SECONDS)), //
	LOWER_DISCHARGE_LIMIT_FOR_SELF_CONSUMPTION_RANGE(Doc.of(OpenemsType.INTEGER) //
			.unit(Unit.PERCENT)), //
	TOTAL_OUTPUT_CURRENT_OF_SOLAR_CHARGER(Doc.of(OpenemsType.INTEGER) //
			.unit(Unit.AMPERE)), //
	REMAINING_MIN_OPERATING_TIME_OF_GENERATOR(Doc.of(OpenemsType.INTEGER) //
			.unit(Unit.SECONDS)), //
	OPERATING_STATUS_MASTER_L1(Doc.of(OpenemsType.INTEGER)), //
	TOTAL_ENERGY_PHOTOVOLTAICS(Doc.of(OpenemsType.INTEGER) //
			.unit(Unit.KILOWATT_HOURS)), //
	TOTAL_ENERGY_PHOTOVOLTAICS_CURRENT_DAY(Doc.of(OpenemsType.INTEGER) //
			.unit(Unit.WATT_HOURS)), //
	NUMBER_OF_EQALIZATION_CHARGES(Doc.of(OpenemsType.INTEGER) //
			.unit(Unit.KILOWATT_HOURS)), //
	NUMBER_OF_FULL_CHARGES(Doc.of(OpenemsType.INTEGER)), //
	RELATIVE_BATTERY_DISCHARGING_SINCE_THE_LAST_FULL_CHARGE(Doc.of(OpenemsType.INTEGER) //
			.unit(Unit.PERCENT)), //
	RELATIVE_BATTERY_DISCHARGING_SINCE_LAST_EQUALIZATION_CHARGE(Doc.of(OpenemsType.INTEGER) //
			.unit(Unit.PERCENT)), //
	OPERATING_TIME_ENERGY_COUNT(Doc.of(OpenemsType.INTEGER) //
			.unit(Unit.SECONDS)), //
	PHOTOVOLTAIC_ENERGY_IN_SOLAR_CHARGER(Doc.of(OpenemsType.INTEGER) //
			.unit(Unit.WATT_HOURS)), //

	OUTPUT_EXTERNAL_POWER_CONNECTION(Doc.of(OpenemsType.INTEGER) //
			.unit(Unit.WATT)), //
	OUTPUT_EXTERNAL_POWER_CONNECTION_L1(Doc.of(OpenemsType.INTEGER) //
			.unit(Unit.WATT)), //
	OUTPUT_EXTERNAL_POWER_CONNECTION_L2(Doc.of(OpenemsType.INTEGER) //
			.unit(Unit.WATT)), //
	OUTPUT_EXTERNAL_POWER_CONNECTION_L3(Doc.of(OpenemsType.INTEGER) //
			.unit(Unit.WATT)), //
	REACTIVE_POWER_EXTERNAL_POWER_CONNECTION(Doc.of(OpenemsType.INTEGER) //
			.unit(Unit.VOLT_AMPERE_REACTIVE)), //
	REACTIVE_POWER_EXTERNAL_POWER_CONNECTION_L1(Doc.of(OpenemsType.INTEGER) //
			.unit(Unit.VOLT_AMPERE_REACTIVE)), //
	REACTIVE_POWER_EXTERNAL_POWER_CONNECTION_L2(Doc.of(OpenemsType.INTEGER) //
			.unit(Unit.VOLT_AMPERE_REACTIVE)), //
	REACTIVE_POWER_EXTERNAL_POWER_CONNECTION_L3(Doc.of(OpenemsType.INTEGER) //
			.unit(Unit.VOLT_AMPERE_REACTIVE)), //
	MAX_BATTERY_TEMPERATURE(Doc.of(OpenemsType.INTEGER) //
			.unit(Unit.DEGREE_CELSIUS)), //
	RATED_BATTERY_VOLTAGE(Doc.of(OpenemsType.INTEGER)), //

	FIRMWARE_VERSION_OF_THE_MAIN_PROCESSOR(Doc.of(OpenemsType.INTEGER)), //
	FIRMWARE_VERSION_OF_THE_LOGIC_COMPONENET(Doc.of(OpenemsType.INTEGER)), //

	BATTERY_NOMINAL_CAPACITY(Doc.of(OpenemsType.INTEGER)), //
	COMMUNICATION_VERSION(Doc.of(OpenemsType.INTEGER)), //

	UPDATE_VERSION_OF_THE_LOGIC_COMPONENT(Doc.of(OpenemsType.INTEGER)), //
	FIRMWARE_VERSION_OF_PROTOCOL_CONVERTER(Doc.of(OpenemsType.INTEGER)), //
	HARDWARE_VERSION_OF_PROTOCOL_CONVERTER(Doc.of(OpenemsType.INTEGER)), //
	SERIAL_NUMBER_OF_THE_PROTOCOL_CONVERTER(Doc.of(OpenemsType.INTEGER)), //

	BATTERY_VOLTAGE(Doc.of(OpenemsType.INTEGER) //
			.unit(Unit.VOLT)), //
	BATTERY_TEMPERATURE(Doc.of(OpenemsType.INTEGER) //
			.unit(Unit.DEGREE_CELSIUS)), //
	OPERATING_MODE_FOR_REACTIVE_POWER(Doc.of(OpenemsType.INTEGER));

	private final Doc doc;

	private SiChannelId(Doc doc) {
		this.doc = doc;
	}

	@Override
	public Doc doc() {
		return this.doc;
	}
}