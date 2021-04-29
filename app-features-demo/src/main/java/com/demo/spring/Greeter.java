package com.demo.spring;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class Greeter {
	Logger logger=LogManager.getLogger(Greeter.class);
	
	public Greeter() {
		logger.info("Greet Object is created by Spring..");
	}

	@Value("${message:No Greeting available}")
	private String greetMessage;

	public String getGreet() {
		logger.info("Message read from file..");
		return this.greetMessage;
	}
}
