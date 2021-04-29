package com.demo.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyDemoRunner implements CommandLineRunner {

	@Autowired
	Greeter greeter;
	
	@Override
	public void run(String... args) throws Exception {
		
		System.out.println(greeter.getGreet());

	}

}
