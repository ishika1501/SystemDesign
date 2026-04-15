package com.example.MediatorPattern;

public interface AuctionMediator {
    public void addBider(Bidder bidder);
    public void placeBid(Colleague bidder, int amount);
}
