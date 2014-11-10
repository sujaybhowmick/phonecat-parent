package com.phonecat.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import java.io.IOException;

/**
 * Created by sujay on 10/11/14.
 */


public class PhoneCatMethodLoggingFilter implements ContainerRequestFilter {
    private static Logger log =
            LoggerFactory.getLogger(PhoneCatMethodLoggingFilter.class);


    @Override
    public void filter(ContainerRequestContext requestContext)
            throws IOException {
        log.info("Logging for every method");


    }
}
