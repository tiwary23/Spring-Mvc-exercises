package com.stackroute.config;

import com.stackroute.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class config {

    @Bean("user")
    public User user(User user){
        return new User("deepak");
    }

}
