package com.ytech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	/* Model interface:
	 * Model is an interface inside spring MVC framework which will acts as an
	 * container between UI and back-end code. (like req and res object)
	 * 
	 * Thymeleaf template caching: 
	 * By default Thymeleaf will cache the templates that way you don't have to compile every time. Until server is up same 
	 * cache will be used. So if we done changes at back-end will not gets reflect until server restart is done. 
	 * To avoid this we can disable Thymeleaf cache. Remember, this cashing is related to static content not for Java code.   
	 * Note:If you are using DevTools, then caching is automatically disabled by DevTools itself.
	 * 
	 * SpringBoot DevTools:
	 * SpringBoot DevTools provides features like Automatic restart and LiveReload. By default dependent libraries like 
	 * Thymeleaf, springMVC cashing will be disabled by devTools.
	 * 
	 * DevTools maintains two class loaders one with classes that doesn't change(inbuilt classes) and other one with classes 
	 * that change(your application classes). When restart needed it only reload second class loader which makes restart faster.
	 * 
	 * DevTools includes an embedded LiveReload Server that can be used to trigger browser refresh when resource like properties file or Java code
	 * is changed but for this we need to add LiveReload related browser extension.
	 * 
	 * 
	 */

	@RequestMapping(value = { "", "/", "/home" })
	public String displayHomePage(Model model) {
		model.addAttribute("username", "John Doe");
		return "home.html";
	}
}
