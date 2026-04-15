package com.example.MediatorPattern;

public class Bidder implements  Colleague{

    String name;
    AuctionMediator auctionMediator;

    public Bidder(String name,AuctionMediator auctionMediator) {
        this.auctionMediator = auctionMediator;
        this.name = name;
        auctionMediator.addBider(this);
    }

    @Override
    public void placeBid(int bidAmount) {
        auctionMediator.placeBid(this, bidAmount);
    }

    @Override
    public void receiveNotification(int amount) {
        System.out.println("Bidder " + name + " got the notification that someone place a bit amount " +  amount);
    }

    @Override
    public String getName() {
        return name;
    }
}
