package com.example.InterpreterPattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InterpreterPatternApplication {
	public static void main(String[] args) {
		SpringApplication.run(InterpreterPatternApplication.class, args);
		Expression nums1 = new NumberExpression(2);
		Expression nums2 =  new NumberExpression(5);

		Expression add = new AddExpression(nums1, nums2);
		System.out.println(add.interpret());
	}
}
