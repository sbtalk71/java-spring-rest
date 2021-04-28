package com.demo.spring;

public class Greeter {

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
		System.out.println(" Message is set "+message.getMessageText());
		this.message = message;
	}

}
