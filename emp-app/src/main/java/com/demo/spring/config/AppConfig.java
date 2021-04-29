package com.demo.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.demo.spring.dao.EmpDao;
import com.demo.spring.dao.EmpDaoImpl;

@Configuration
@ComponentScan(basePackages = "com.demo.spring")
public class AppConfig {
	
	@Bean
	public EmpDao empDao3() {
		return new EmpDaoImpl(); //EmpDao dao=new EmpDaoImpl();
	}

}
