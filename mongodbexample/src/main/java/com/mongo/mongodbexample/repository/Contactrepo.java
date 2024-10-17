package com.mongo.mongodbexample.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mongo.mongodbexample.model.Contact;

public interface Contactrepo extends MongoRepository<Contact,String> {

}
