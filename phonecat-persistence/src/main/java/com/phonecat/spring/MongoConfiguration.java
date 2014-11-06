package com.phonecat.spring;

import com.mongodb.MongoClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.authentication.UserCredentials;
import org.springframework.data.mongodb.core.MongoTemplate;

/**
 * Created by sujay on 03/11/14.
 */
@Configuration
public class MongoConfiguration {

    private static Logger log = LoggerFactory.getLogger(MongoConfiguration.class);

    @Value("${db.host}") private String host;
    @Value("${db.database}") private String database;
    @Value("${db.user}") private String user;
    @Value("${db.password}") private String password;
    @Value("${db.port}") private int port;

    public @Bean
    MongoTemplate mongoTemplate() throws Exception {
        log.info(String.format("Mongo Host: %s", host));
        log.info(String.format("Mongo Database: %s", database));
        log.info(String.format("Mongo port: %d", port));
        log.info(String.format("Mongo user: %s", user));

        UserCredentials userCredentials = new UserCredentials(user, password);
        return new MongoTemplate(new MongoClient(host, port), database);
    }
}
