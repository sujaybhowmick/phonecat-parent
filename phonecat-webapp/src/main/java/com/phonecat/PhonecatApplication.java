package com.phonecat;

import com.google.common.collect.ImmutableSet;
import com.phonecat.logging.LoggingFeature;
import com.phonecat.rest.resource.PhoneResource;

import javax.ws.rs.core.Application;
import java.util.Set;

/**
 * Created by sujay on 25/10/14.
 *
 * Not choosing to annotate JAX-RS classes with @Component + Classpath-scanning
 * and/or have them defined in a Java Config which would then result in Spring
 * managing them. All the Resources and relevant providers are registered with
 * Jersey by extending the javax.ws.rs.core.Application class as shown below.
 *
 */
public class PhonecatApplication extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        return ImmutableSet.<Class<?>> of(PhoneResource.class,
                LoggingFeature.class);
    }
}
