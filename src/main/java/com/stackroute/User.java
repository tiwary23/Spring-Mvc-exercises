package com.stackroute;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class User {
    private String name;

    @Autowired
    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
