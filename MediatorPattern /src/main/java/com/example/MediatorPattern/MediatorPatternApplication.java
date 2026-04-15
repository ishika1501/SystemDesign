package com.example.MediatorPattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MediatorPatternApplication {

	public static void main(String[] args) {
		SpringApplication.run(MediatorPatternApplication.class, args);
		AuctionMediator auctionMediator = new Auction();
		Colleague colleague1 = new Bidder("A" , auctionMediator);
		Colleague colleague2= new Bidder("B" , auctionMediator);

		colleague1.placeBid(2000);
		colleague2.placeBid(3000);

	}

}
