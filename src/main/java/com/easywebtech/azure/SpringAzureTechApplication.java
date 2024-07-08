package com.easywebtech.azure;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringAzureTechApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAzureTechApplication.class, args);
	}
	
	@GetMapping("/message")
	public String message() {
		return "Web application deployed in Azure!";
	}
	
	@Autowired
	private BookRepo bookRepo;
	
	@PostMapping("/addBook")
	public Book addBook(@RequestBody Book book) {
		return bookRepo.save(book);
	}
	
	@GetMapping("/getBooks")
	public List<Book> getBooks() {
		return bookRepo.findAll();
	}

}
