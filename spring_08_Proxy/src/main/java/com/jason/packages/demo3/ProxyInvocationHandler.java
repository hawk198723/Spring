package com.jason.packages.demo3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyInvocationHandler implements InvocationHandler {
    private Rent rent;

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), rent.getClass().getInterfaces(),this);
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        makeTourCheckHouse();
        Object result = method.invoke(rent, args);
        chargeServiceFee();
        signContract();
        return result;
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
