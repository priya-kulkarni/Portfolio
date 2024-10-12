package com.springrest1.springrest1.ContactController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springrest1.springrest1.Contactservice.Contactserv;
import com.springrest1.springrest1.Entity.ContactEntity;




@RestController
@RequestMapping("/api/contact")
@CrossOrigin
public class ContactCon {
	@Autowired
	private Contactserv contactserv;
	
	@PostMapping("/submit")
	public ContactEntity submitForm(@RequestBody ContactEntity contactEntity) {
		return contactserv.saveContact(contactEntity);
	}
	
	@GetMapping("/getAllForms")
	public List<ContactEntity>getAllForms() {
		return contactserv.getAllcontacts();
	}
}
