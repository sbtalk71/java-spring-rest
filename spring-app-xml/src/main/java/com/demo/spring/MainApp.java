package com.demo.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext ctx=
				new ClassPathXmlApplicationContext("context.xml");
		
		Greeter g=(Greeter)ctx.getBean("greeter");
		
		System.out.println(g.getMessage().getMessageText());
		
		Greeter g2=ctx.getBean(Greeter.class);
		System.out.println(g==g2);

	}

}
