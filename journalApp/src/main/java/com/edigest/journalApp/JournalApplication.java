package com.edigest.journalApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class JournalApplication {

	public static void main(String[] args) {

		SpringApplication.run(JournalApplication.class, args);
	}
}