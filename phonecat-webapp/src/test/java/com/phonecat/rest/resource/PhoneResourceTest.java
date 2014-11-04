package com.phonecat.rest.resource;

import com.phonecat.entities.Phone;
import com.phonecat.spring.PhonecatApiConfiguration;
import com.phonecat.spring.PhonecatWebAppConfiguration;
import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import org.springframework.test.context.web.AnnotationConfigWebContextLoader;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;

import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;

import java.net.URI;
import java.util.List;

import static org.junit.Assert.*;

@WebAppConfiguration
@ContextConfiguration(loader = AnnotationConfigWebContextLoader.class,
classes = {PhoneResourceTestContextConfiguration.class})
@RunWith(SpringJUnit4ClassRunner.class)

public class PhoneResourceTest {

    private HttpServer httpServer;
    private WebTarget webTarget;
    private static final URI baseUri = URI.
            create("http://localhost:9090/api");

    @Before
    public void setUp() throws Exception {
        ResourceConfig resourceConfig = new ResourceConfig(PhoneResource.class);
        httpServer = GrizzlyHttpServerFactory
                .createHttpServer(baseUri, resourceConfig);
        httpServer.start();
        Client client = ClientBuilder.newClient();
        webTarget = client.target(baseUri);

    }

    @After
    public void tearDown() throws Exception {
        httpServer.shutdown();

    }

    @Test
    public void testGetAllPhones() throws Exception {
        List<Phone> phones = webTarget.path("/phone").request()
                .accept(MediaType.APPLICATION_JSON)
                .get(new GenericType<List<Phone>>() {
                });
        assertEquals(1, phones.size());

    }
}