package com.softwareHeroes.sachin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.softwareHeroes.sachin")
public class PdfGenratorApplication {

	public static void main(String[] args) {
		SpringApplication.run(PdfGenratorApplication.class, args);
	}

}
