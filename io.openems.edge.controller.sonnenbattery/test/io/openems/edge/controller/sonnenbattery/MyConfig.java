package io.openems.edge.controller.sonnenbattery;

import java.lang.annotation.Annotation;

@SuppressWarnings("all")
public class MyConfig implements Config {

	protected static class Builder {
		private String id;
//		private String setting0;

		private Builder() {
		}

		public Builder setId(String id) {
			this.id = id;
			return this;
		}

//		public Builder setSetting0(String setting0) {
//			this.setting0 = setting0;
//			return this;
//		}

		public MyConfig build() {
			return new MyConfig();
		}
	}

	/**
	 * Create a Config builder.
	 * 
	 * @return a {@link Builder}
	 */
	public static Builder create() {
		return new Builder();
	}

	@Override
	public String apiUrl() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String chargeRequestUrl() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String dischargeRequestUrl() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String apiChangeAutomaticMode() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String apiChangeManualMode() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String apiGetOperatingMode() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Class<? extends Annotation> annotationType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String id() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String alias() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean enabled() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean csvLoggerEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int loggerCounter() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String webconsole_configurationFactory_nameHint() {
		// TODO Auto-generated method stub
		return null;
	}

//	@Override
//	public String setting0() {
//		return this.builder.setting0;
//	}

}