package com.ytech.eazyschool.service;

import java.util.logging.Logger;

import org.springframework.stereotype.Service;

import com.ytech.eazyschool.model.Contact;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@Service
public class ContactService {
	//private static Logger log=Logger.getLogger("ContactService.class");

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

}
