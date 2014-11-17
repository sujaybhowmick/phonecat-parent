package com.phonecat.com.phonecat.mongo;

import com.phonecat.spring.PropertyPlaceholderConfiguration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by sujay on 17/11/14.
 */

@Retention(RetentionPolicy.RUNTIME)
@Import(PropertyPlaceholderConfiguration.class)
@PropertySource("classpath:mongo-${APP_ENV:local}.properties")
public @interface MongoPropertyConfiguration {
}
