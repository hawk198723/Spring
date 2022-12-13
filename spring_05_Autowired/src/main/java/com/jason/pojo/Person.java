package com.jason.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.lang.Nullable;

public class Person {
//    @Autowired(required = false)
    @Autowired
    @Qualifier(value = "cat111")
    private Cat cat;
    @Autowired
    @Qualifier(value = "dog222")
    private Dog dog;
    private String name;

    @Override
    public String toString() {
        return "Person{" +
                "cat=" + cat +
                ", dog=" + dog +
                ", name='" + name + '\'' +
                '}';
    }

    public Person(@Nullable String name) {
        this.name = name;
    }

    public Cat getCat() {
        return cat;
    }


    public Dog getDog() {
        return dog;
    }

    public String getName() {
        return name;
    }

}
