package com.example.MediatorPattern;

public interface Colleague {
    void placeBid(int bidAmount);
    void receiveNotification(int amount);
    String getName();
}
