package com.demo.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@SpringBootApplication
public class EmpDataServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmpDataServiceApplication.class, args);
	}

	@Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI().info(new Info().title("Foobar API")
            .version("3.0.1")
            .description("This is a sample Foobar server created using springdocs - a library for OpenAPI 3 with spring boot.")
            .termsOfService("http://swagger.io/terms/")
            .license(new License().name("Apache 2.0")
                .url("http://springdoc.org")));
    }
}

