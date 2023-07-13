package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Webapplication {

	private Logger logger = LoggerFactory.getLogger(Webapplication.class);
	
	
	@GetMapping("/")
	public String index() {
		
		logger.info("index started");
		
		return "index page hello";
	}
	
	@GetMapping("/msg")
	public String WelcomeMsg() {
		logger.debug("this is debug msg from welcome.....");
		logger.info("welcomeMsg() execution started.....");

		String msg = "Welcome To world...";

		try {
			int i = 10 / 0;
		} catch (Exception e) {
			logger.error("Exception Occured" + e.getMessage());
		}

		logger.warn("This is warning from welcome method...");

		logger.info("welcomeMsg() execution ended...");
		return msg;
	}
	
	
}
