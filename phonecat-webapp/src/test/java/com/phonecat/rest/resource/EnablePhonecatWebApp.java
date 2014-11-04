package com.phonecat.rest.resource;

import com.phonecat.spring.PhonecatWebAppConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by sujay on 04/11/14.
 */
@Retention(RetentionPolicy.RUNTIME)
@Import(PhonecatWebAppConfiguration.class)
public @interface EnablePhonecatWebApp {
}
