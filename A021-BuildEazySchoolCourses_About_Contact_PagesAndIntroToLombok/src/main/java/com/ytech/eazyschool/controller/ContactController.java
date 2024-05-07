package com.ytech.eazyschool.controller;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

import com.ytech.eazyschool.model.Contact;
import com.ytech.eazyschool.service.ContactService;

import lombok.extern.slf4j.Slf4j;

@Slf4j	//lombok supported annotation
@Controller
public class ContactController {

	//private static Logger log = Logger.getLogger("ContactController.class");
	private final ContactService contactService;

	@Autowired
	public ContactController(ContactService contactService) {
		this.contactService = contactService;
	}

	@RequestMapping("/contact")
	public String displayContactPage() {
		return "contact.html";
	}

	/*
	 * // @RequestMapping(value = "/saveMsg", method = RequestMethod.POST)
	 * 
	 * @PostMapping("/saveMsg") public ModelAndView save(@RequestParam(name =
	 * "name") String name, @RequestParam String mobileNum,
	 * 
	 * @RequestParam String email, @RequestParam String message) {
	 * System.out.println(name + "> " + mobileNum + "> " + email + "> " + message);
	 * log.info("Name : " + name); log.info("mobileNum : " + mobileNum);
	 * log.info("email : " + email); log.info("message : " + message);
	 * 
	 * return new ModelAndView("redirect:/contact"); }
	 */

	/*
	 * Internally, Spring MVC uses the bind(WebRequest request) method of the
	 * WebRequestDataBinder class to perform data binding between request parameters
	 * and properties of a POJO.
	 */
	@RequestMapping(value = "/saveMsg", method = RequestMethod.POST)
	public ModelAndView saveMessage(Contact contact) {
		System.out.println("email: "+contact.getEmail());
		contactService.saveMessageDetails(contact);
		return new ModelAndView("redirect:/contact");
	}
}
