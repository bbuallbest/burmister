package org.burmister.payman.api.rest.config;

import org.glassfish.jersey.filter.LoggingFilter;
import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.ApplicationPath;


/**
 * @author Kyrylo Berehovyi
 */
@ApplicationPath("/payman")
public class PaymanResourceConfig extends ResourceConfig{

    private static final String RESOURCES_PACKAGE_TO_SCAN = "org.burmister.payman.api.rest.resource";

    public PaymanResourceConfig() {
        packages(RESOURCES_PACKAGE_TO_SCAN);
        register(JacksonFeature.class);
        register(LoggingFilter.class);
    }
}
