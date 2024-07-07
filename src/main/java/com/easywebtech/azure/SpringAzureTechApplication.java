package com.easywebtech.azure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringAzureTechApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAzureTechApplication.class, args);
	}
	
	@GetMapping("/message")
	public String message() {
		return "Congrats you deployed the web application!";
	}

}
