package com.demo.spring;
import com.demo.spring.msg.Message;
public class Mail {

	private String toAddress;
	private String fromAddress;
	Message message;
	
	public Mail() {
		// TODO Auto-generated constructor stub
	}

	public String getToAddress() {
		return toAddress;
	}

	public void setToAddress(String toAddress) {
		this.toAddress = toAddress;
	}

	

	public String getFromAddress() {
		return fromAddress;
	}

	public void setFromAddress(String fromAddress) {
		this.fromAddress = fromAddress;
	}

	public Message getMessage() {
		return message;
	}

	public void setMessage(Message message) {
		this.message = message;
	}
	
	
	
}
