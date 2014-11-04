package com.phonecat.rest.resource;

import com.phonecat.entities.Phone;
import com.phonecat.repository.PhoneRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

/**
 * Created by sujay on 03/11/14.
 */
@Path("/phone")
@Produces(MediaType.APPLICATION_JSON)
public class PhoneResource {
    private static final Logger log =
            LoggerFactory.getLogger(PhoneResource.class);

    @Autowired
    private PhoneRepository phoneRepository;

    @GET
    public Response getPhones(){
        List<Phone> phones = phoneRepository.findAll();
        return Response.ok(phones).build();
    }
}
