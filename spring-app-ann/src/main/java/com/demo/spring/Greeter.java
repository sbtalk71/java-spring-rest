package com.demo.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("gg")
public class Greeter {

	@Autowired
	private Message message;

	public Greeter() {
		// TODO Auto-generated constructor stub
	}

	public Greeter(Message message) {
		System.out.println("Message injected in constructor..");
		this.message = message;
	}

	public Message getMessage() {
		return message;
	}

	public void setMessage(Message message) {
		System.out.println(" Message is set " + message.getMessageText());
		this.message = message;
	}

}
