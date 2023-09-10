package com.greatlearning.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller    // Stereotype annotation@component
public class HelloController {
	// adding the request mapping ---->URL
	
		@RequestMapping("/")
		public String giveWelcomeMessage () {
			
			return "welcome";   // view file jsp
		}
	// adding the request mapping ---->URL
	
	@RequestMapping("/hello")
	public String giveHelloMessage () {
		
		return "hello";    // view file jsp
	}

	// adding the request mapping ---->URL
	
		@RequestMapping("/goodbye")
		public String giveGoodbyeMessage () {
			
			return "goodbye";   // view file jsp
}
}
