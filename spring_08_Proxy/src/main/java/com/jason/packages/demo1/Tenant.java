package com.jason.packages.demo1;

public class Tenant {
    public static void main(String[] args) {

        Owner owner = new Owner();

        Proxy proxy = new Proxy(owner);
        proxy.rent();

    }
}
