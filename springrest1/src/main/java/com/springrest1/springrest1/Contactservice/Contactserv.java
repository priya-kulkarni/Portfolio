package com.springrest1.springrest1.Contactservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springrest1.springrest1.ContactRepository.ContactRepo;
import com.springrest1.springrest1.Entity.ContactEntity;

@Service
public class Contactserv {
	
	@Autowired
	private ContactRepo contactRepo;
	
	public ContactEntity saveContact(ContactEntity contactEntity) {
		return contactRepo.save(contactEntity);
	}

	public List<ContactEntity> getAllcontacts() {
		// TODO Auto-generated method stub
		return contactRepo.findAll();
	}

}
