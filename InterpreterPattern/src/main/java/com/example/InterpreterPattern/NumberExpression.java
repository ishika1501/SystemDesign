package com.example.InterpreterPattern;

public class NumberExpression extends Expression{

    private int number;

    public NumberExpression(int number) {
        this.number = number;
    }

    @Override
    int interpret() {
        return number;
    }

}

