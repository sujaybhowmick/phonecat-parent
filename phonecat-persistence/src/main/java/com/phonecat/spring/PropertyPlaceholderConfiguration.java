package com.phonecat.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * Created by sujay on 06/11/14.
 */
@Configuration
@PropertySource("classpath:mongo-${APP_ENV:local}.properties")
public class PropertyPlaceholderConfiguration {

    @Bean
    public static PropertySourcesPlaceholderConfigurer
                                    propertySourcesPlaceholderConfigurer(){
        return new PropertySourcesPlaceholderConfigurer();

    }
}
