package org.burmister.payman.rest.config;

import org.glassfish.jersey.filter.LoggingFilter;
import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;


/**
 * @author Kyrylo Berehovyi
 */
public class PaymanResourceConfig extends ResourceConfig{

    public PaymanResourceConfig() {
        packages("org.burmister.payman.rest.resource");
        register(JacksonFeature.class);
        register(LoggingFilter.class);
    }
}
