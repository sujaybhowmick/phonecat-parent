package com.phonecat;

import com.phonecat.spring.PhonecatWebAppConfiguration;
import org.glassfish.jersey.servlet.ServletContainer;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * Created by sujay on 03/11/14.
 */
@Order(Ordered.HIGHEST_PRECEDENCE)
public class PhonecatApplicationInitializer implements WebApplicationInitializer {
    @Override
    public void onStartup(ServletContext servletContext)
            throws ServletException {

        servletContext.addListener(ContextLoaderListener.class);
        servletContext.setInitParameter(ContextLoader.CONTEXT_CLASS_PARAM,
                AnnotationConfigWebApplicationContext.class.getName());
        servletContext.setInitParameter(ContextLoader.CONFIG_LOCATION_PARAM,
                PhonecatWebAppConfiguration.class.getName());

        ServletRegistration.Dynamic servletRegistration = servletContext
                .addServlet("Phonecat", ServletContainer.class.getName());

        servletRegistration.addMapping("/api/*");
        servletRegistration.setLoadOnStartup(1);
        servletRegistration.setInitParameter("javax.ws.rs.Application",
                PhonecatApplication.class.getName());

    }
}
