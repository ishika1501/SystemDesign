package com.example.TemplateMethodPattern;

public abstract class Maggie {
    final void prepareMaggie(){
        boilwater();
        pourNoodle();
        addExtra();
        serve();
    }

    public void boilwater(){
        System.out.println("Boiling Water");
    }

    public void pourNoodle(){
        System.out.println("pour the noodles");
    }

    abstract void addExtra();

    public void serve(){
        System.out.println("Serve it hot");
    }
}
