package com.example.FlyweightPattern;

public class HumanRobo implements IRobot {
    private String type;   // intrinsic
    private String weapon; // intrinsic

    public HumanRobo(String type, String weapon) {
        this.type = type;
        this.weapon = weapon;
    }

    @Override
    public void display(int x, int y) {
        System.out.println(type + " with " + weapon + " at (" + x + ", " + y + ")");
    }
}