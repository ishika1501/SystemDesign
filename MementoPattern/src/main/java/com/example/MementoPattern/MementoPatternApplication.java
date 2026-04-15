package com.example.MementoPattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MementoPatternApplication {

	public static void main(String[] args) {
		SpringApplication.run(MementoPatternApplication.class, args);

		Account account= new Account(5000);
		Bank bank = new Bank(10000);

		TransactionHistory history = new TransactionHistory();
		System.out.println("Initial Balance: " + bank.getBalance());

		history.save(bank.saveAmount());

		bank.debit(1000);
		System.out.println("After Debit: " +bank.getBalance());

		System.out.println("Transaction failed. Rolling back...");
		bank.restore(history.rollback());

		System.out.println("After Rollback: " + bank.getBalance());

	}

}
