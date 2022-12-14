package com.jason.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton") //or prototyype
public class User {

//    @Value("Jason also")
    public String name;

    @Value("Jason setter")
    public void setName(String name) {
        this.name = name;
    }
}
