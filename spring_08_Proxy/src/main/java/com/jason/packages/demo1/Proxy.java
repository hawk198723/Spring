package com.jason.packages.demo1;

public class Proxy implements Rent{

    private Owner owner;

    public Proxy() {
    }

    public Proxy(Owner owner) {
        this.owner = owner;
    }

    @Override
    public void rent() {
        owner.rent();
//        System.out.println("Proxy Agent helps owner renting...");
        makeTourCheckHouse();
        chargeServiceFee();
        signContract();
    }

    public void makeTourCheckHouse(){
        System.out.println("Make a tour to check house");
    }

    public void chargeServiceFee(){
        System.out.println("Charge service fee from owner if deal made");
    }

    public void signContract(){
        System.out.println("Sign Contract");
    }
}
