package com.digitalml.rest.resources.codegentest.application;

import io.dropwizard.Configuration;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public class ExtendConfiguration extends Configuration {

    @Valid
    @NotNull
    public KatharsisConfiguration katharsis = new KatharsisConfiguration();

    public class KatharsisConfiguration {

        @Valid
        @NotNull
        public String searchPackage = "com.digitalml.rest.resources.codegentest.application.domain";
        
        @Valid
        @NotNull
        public String host;
    }
}