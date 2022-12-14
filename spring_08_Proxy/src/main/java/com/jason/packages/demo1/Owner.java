package com.jason.packages.demo1;

public class Owner implements Rent{
    @Override
    public void rent() {
        System.out.println("Owner wants rent house...");
    }
}
