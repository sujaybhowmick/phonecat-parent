package com.phonecat.spring;

import org.springframework.context.annotation.Import;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by sujay on 03/11/14.
 */
@Retention(RetentionPolicy.RUNTIME)
@Import({PhonecatApiConfiguration.class})
public @interface EnablePhonecatApi {
}
