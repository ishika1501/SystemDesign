package com.example.MementoPattern;

public class Bank {
    private int balance;

    public Bank(int balance) {
        this.balance = balance;
    }

    public void debit(int amount) {
        balance -= amount;
    }

    public void credit(int amount) {
        balance += amount;
    }

    public int getBalance() {
        return balance;
    }

    public Account saveAmount(){
        return new Account(balance);
    }

    public void restore(Account account){
        this.balance =  account.getBalance();
    }
}
