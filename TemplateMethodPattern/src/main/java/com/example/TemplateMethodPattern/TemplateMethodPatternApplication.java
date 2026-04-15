package com.example.TemplateMethodPattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TemplateMethodPatternApplication {

	public static void main(String[] args) {
		SpringApplication.run(TemplateMethodPatternApplication.class, args);

		Maggie newMaggie1 = new CheeseMaggie();
		newMaggie1.prepareMaggie();

		Maggie newMaggie2 = new VegMaggie();
		newMaggie2.prepareMaggie();
	}

}
