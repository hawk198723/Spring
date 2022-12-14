package com.jason.config;

import com.jason.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("com.jason.pojo")
@Import(JaosnConfig2.class)
public class JasonConfig {

    @Bean
    public User someJasonUser(){
        return new User();
    }
}
