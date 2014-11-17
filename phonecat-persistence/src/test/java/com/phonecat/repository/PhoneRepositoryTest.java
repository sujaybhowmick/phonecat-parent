package com.phonecat.repository;

import com.phonecat.entities.Phone;
import com.phonecat.com.phonecat.mongo.MongoConfiguration;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

@ContextConfiguration(classes = {MongoConfiguration.class})
@RunWith(SpringJUnit4ClassRunner.class)
public class PhoneRepositoryTest {

    @Autowired
    private PhoneRepository phoneRepository;

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }


    @Test
    public void testFindAll() throws Exception {
      List<Phone> phones =  phoneRepository.findAll();
      assertNotNull(phones);
      assertEquals(1, phones.size());
      assertNotEquals(0, phones.size());

      for (Phone phone: phones){
        System.out.println(phone.getId());
      }

    }
}