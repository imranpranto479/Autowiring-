package com.imranpranto.autowiring.main.model;

import org.springframework.stereotype.Component;

import jakarta.annotation.PreDestroy;

@Component
public class Dog {

    public Dog() {
        System.out.println("Dog object created");

    }

    public void info() {
        System.out.println("This is a German Sepherd Dog");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Dog object destroyed");
    }

}
