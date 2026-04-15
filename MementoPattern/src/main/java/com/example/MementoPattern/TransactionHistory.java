package com.example.MementoPattern;

import java.util.Stack;

public class TransactionHistory {
    private Stack<Account> history = new Stack<>();

    public void save(Account memento) {
        history.push(memento);
    }

    public Account rollback() {
        return history.pop();
    }
}
