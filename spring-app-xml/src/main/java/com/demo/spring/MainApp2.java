package com.demo.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp2 {

	public static void main(String[] args) {
		ApplicationContext ctx=
				new ClassPathXmlApplicationContext("context2.xml");
		
		Mail mail=ctx.getBean(Mail.class);
		
		//System.out.println(mail.getMessage().getBody());

	}

}
