package com.demo.spring;

import org.springframework.stereotype.Repository;


public class Message {

	private String messageText;
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
