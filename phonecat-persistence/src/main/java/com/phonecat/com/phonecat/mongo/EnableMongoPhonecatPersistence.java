package com.phonecat.com.phonecat.mongo;

import org.springframework.context.annotation.Import;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by sujay on 03/11/14.
 */
@Retention(RetentionPolicy.RUNTIME)
@Import({MongoConfiguration.class, MongoPropertyPlaceHolderConfig.class})
public @interface EnableMongoPhonecatPersistence {
}
