package io.openems.edge.controller.LoadManagement;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@ObjectClassDefinition(//
		name = "Controller io.openems.edge.controller.LoadManagement", //
		description = "")
@interface Config {

	@AttributeDefinition(name = "Component-ID", description = "Unique ID of this Component")
	String id() default "ctrlio.openems.edge.controller.LoadManagement0";

	@AttributeDefinition(name = "Alias", description = "Human-readable name of this Component; defaults to Component-ID")
	String alias() default "";

	@AttributeDefinition(name = "Is enabled?", description = "Is this Component enabled?")
	boolean enabled() default true;
	
	@AttributeDefinition(name = "GET Status parameters", description = "The GET URL of the API")
	String apiUrl() default "http://0.0.0.0:3000/cm";
	
	@AttributeDefinition(name = "GET Power On", description = "The GET URL of the API")
	String powerOnUrl() default "http://10.3.141.1/cm?cmnd=Power%20On";

	@AttributeDefinition(name = "GET Power Off", description = "The GET URL of the API")
	String powerOffUrl() default "http://10.3.141.1/cm?cmnd=Power%20Off";
	
	String webconsole_configurationFactory_nameHint() default "Controller io.openems.edge.controller.LoadManagement [{id}]";

}