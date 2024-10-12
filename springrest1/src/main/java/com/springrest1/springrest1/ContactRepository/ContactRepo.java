package com.springrest1.springrest1.ContactRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest1.springrest1.Entity.ContactEntity;
public interface ContactRepo extends JpaRepository<ContactEntity,Long>  {

	@SuppressWarnings("unchecked")
	ContactEntity save(ContactEntity contactEntity);

}
