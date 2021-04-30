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

@Component
public class ClientRunner2 implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {

		RestTemplate rt = new RestTemplate();

		HttpHeaders headers= new HttpHeaders();
		
		headers.set("Accept", MediaType.TEXT_PLAIN_VALUE);
		headers.set("Content-Type", MediaType.APPLICATION_XML_VALUE);
		
		Emp e= new Emp(109, "Dilip", "Mumbai", 46000);
		
		HttpEntity reqData=new HttpEntity<>(e,headers);
		
		
		
		ResponseEntity<String> response3=rt.exchange("http://localhost:8080/emp/save", HttpMethod.POST, reqData, String.class);
		System.out.println(response3.getBody());
		

	}

}
