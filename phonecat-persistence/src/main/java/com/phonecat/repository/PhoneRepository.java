package com.phonecat.repository;

import com.phonecat.entities.Phone;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by sujay on 03/11/14.
 */

@Repository
public interface PhoneRepository extends MongoRepository<Phone, ObjectId> {
}
