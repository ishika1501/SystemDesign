package com.example.FlyweightPattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FlyweightPatternApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlyweightPatternApplication.class, args);

		for (int i = 0; i < 5; i++) {
			IRobot robot = roboFactory.getRobot("HUMAN");
			robot.display(i, i + 10);
		}

		for (int i = 0; i < 5; i++) {
			IRobot robot = roboFactory.getRobot("DOG");
			robot.display(i, i + 20);
		}
	}

}
