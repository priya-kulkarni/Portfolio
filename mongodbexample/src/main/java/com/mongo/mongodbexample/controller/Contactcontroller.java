package com.mongo.mongodbexample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mongo.mongodbexample.model.Contact;
import com.mongo.mongodbexample.repository.Contactrepo;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins="http://localhost:5500")
public class Contactcontroller {
	@Autowired
	private Contactrepo contactrepo;
	
	@PostMapping("/submitform")
	public ResponseEntity<Contact> submitForm(@RequestBody Contact contact) {
		Contact savedContact = contactrepo.save(contact);
	    return ResponseEntity.status(HttpStatus.CREATED).body(savedContact);
	}
}
