package com.phonecat.logging;

import javax.ws.rs.container.DynamicFeature;
import javax.ws.rs.container.ResourceInfo;
import javax.ws.rs.core.FeatureContext;
import javax.ws.rs.ext.Provider;
import java.lang.annotation.Annotation;

/**
 * Created by sujay on 10/11/14.
 */
@Provider
public class LoggingFeature implements DynamicFeature{

    @Override
    public void configure(ResourceInfo resourceInfo, FeatureContext context) {

        if(isAnnotationPresent(Logger.class, resourceInfo)) {
            PhoneCatMethodLoggingFilter filter = new PhoneCatMethodLoggingFilter();
            context.register(filter);
        }

    }

    private boolean isAnnotationPresent(Class<? extends Annotation> a, ResourceInfo resourceInfo){
        return resourceInfo.getResourceMethod().isAnnotationPresent(a);

    }
}
