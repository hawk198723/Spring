package com.jason.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class User {
//    @Value("haishi Jason")
    private String name;

    public String getName() {
        return name;
    }
    @Value("haishi Jason")
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
