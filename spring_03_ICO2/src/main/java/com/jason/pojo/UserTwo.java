package com.jason.pojo;

public class UserTwo {
    private String name;

    public UserTwo(String name) {
        this.name = name;
        System.out.println("UserTwo is being called");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println("name=" + name);
    }
}
