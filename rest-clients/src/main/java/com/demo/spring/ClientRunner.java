package com.demo.spring;



import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.demo.spring.entity.Emp;

//@Component
public class ClientRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {

		RestTemplate rt = new RestTemplate();

		Emp response = rt.getForObject("http://localhost:8080/emp/find/" + 104, Emp.class);
		System.out.println(response.getName());
		
		//approach2
		
		HttpHeaders headers= new HttpHeaders();
		
		headers.set("Accept", MediaType.APPLICATION_XML_VALUE);
		
		HttpEntity reqData=new HttpEntity<>(headers);
		
		ResponseEntity<Emp> response2 = rt.exchange("http://localhost:8080/emp/find/" + 104, HttpMethod.GET, reqData, Emp.class);
		
		System.out.println(response2.getBody().getName());
		
		ResponseEntity<String> response3=rt.exchange("http://localhost:8080/emp/find/" + 104, HttpMethod.GET, reqData, String.class);
		System.out.println(response3.getBody());
		

	}

}
