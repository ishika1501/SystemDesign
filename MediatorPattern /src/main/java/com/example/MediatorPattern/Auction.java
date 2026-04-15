package com.example.MediatorPattern;

import java.util.ArrayList;
import java.util.List;

public class Auction implements AuctionMediator{
    List<Colleague>bidders= new ArrayList<>();

    @Override
    public void addBider(Bidder bidder) {
        bidders.add(bidder);
    }

    @Override
    public void placeBid(Colleague bidder, int amount) {
        for (Colleague c : bidders) {
            if (!c.getName().equals(bidder.getName())) {
                c.receiveNotification( amount);
            }
        }
    }
}
