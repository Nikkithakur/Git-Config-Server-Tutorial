package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class Service2Application {

	public static void main(String[] args) {
		SpringApplication.run(Service2Application.class, args);
	}

}

@RestController
class Service1Controller{
	
	@Value("${party.partyId:Def1234567890}")
	String name;
	@Value("${party.orgName:DefOrgName}")
	String orgName;

	@GetMapping("/service2")
	public String getValue() {
		return name + "|" + orgName;
	}
}
