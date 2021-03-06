package com.digitalml.rest.resources.codegentest.application;

import io.dropwizard.Application;
import io.dropwizard.setup.Environment;
import io.katharsis.core.properties.KatharsisProperties;
import io.katharsis.rs.KatharsisFeature;

public class ExtendApplication extends Application<ExtendConfiguration> {

	@Override
	public void run(ExtendConfiguration dropwizardConfiguration, Environment environment) throws Exception {
		environment.jersey().property(KatharsisProperties.RESOURCE_SEARCH_PACKAGE, dropwizardConfiguration.katharsis.searchPackage);

		KatharsisFeature katharsisFeature = new KatharsisFeature();
		environment.jersey().register(katharsisFeature);
	}

	public static void main(String[] args) throws Exception {
		new ExtendApplication().run(args);
	}
}