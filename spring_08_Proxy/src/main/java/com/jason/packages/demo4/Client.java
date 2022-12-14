package com.jason.packages.demo4;

import com.jason.packages.demo2.UserService;
import com.jason.packages.demo2.UserServiceImpl;

public class Client {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();

        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        pih.setTarget(userService);
        UserService proxy = (UserService) pih.getProxy();

        proxy.add();
    }
}
