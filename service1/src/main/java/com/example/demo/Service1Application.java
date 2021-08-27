package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class Service1Application {

	public static void main(String[] args) {
		SpringApplication.run(Service1Application.class, args);
	}

}

@RestController
class Service1Controller{
	
	// inject value, if not found insert default value
	@Value("${party.partyId:Def1234567890}")
	String name;
	@Value("${party.orgName:DefOrgName}")
	String orgName;

	@GetMapping("/service1")
	public String getValue() {
		return name + "|" + orgName;
	}
}
