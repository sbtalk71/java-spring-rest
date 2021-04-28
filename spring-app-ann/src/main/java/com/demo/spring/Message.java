package com.demo.spring;

import org.springframework.stereotype.Component;

@Component
public class Message {

	private String messageText="Welcome to Spring App";
	public Message() {
		// TODO Auto-generated constructor stub
	}
	public Message(String messageText) {
		this.messageText = messageText;
	}
	public String getMessageText() {
		return messageText;
	}
	public void setMessageText(String messageText) {
		this.messageText = messageText;
	}
	
	
}
