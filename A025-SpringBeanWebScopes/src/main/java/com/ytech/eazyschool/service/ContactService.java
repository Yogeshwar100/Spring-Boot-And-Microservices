package com.ytech.eazyschool.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

import com.ytech.eazyschool.model.Contact;

/*
@Slf4j, is a Lombok-provided annotation that will automatically generate an SLF4J
Logger static property in the class at compilation time.
* */
@Slf4j
@Service
@RequestScope
//@SessionScope
//@ApplicationScope
public class ContactService {

	private static int counter = 0;

	public ContactService() {
		counter++;
		System.out.println("Contact Service Bean initialized");
	}

	/**
	 * Save Contact Details into DB
	 * 
	 * @param contact
	 * @return boolean
	 */
	public boolean saveMessageDetails(Contact contact) {
		boolean isSaved = true;
		// TODO - Need to persist the data into the DB table
		log.info(contact.toString());
		return isSaved;
	}

	public int getCounter() {
		return counter;
	}

}
