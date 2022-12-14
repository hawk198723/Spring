package com.jason.packages.demo3;

public class Client {
    public static void main(String[] args) {
        Owner owner = new Owner();
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        pih.setRent(owner);

        Rent proxy = (Rent) pih.getProxy();
        proxy.rent();
    }
}
