package com.imranpranto.autowiring.main.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PreDestroy;

@Component
@Scope(value="prototype")
public class Coder {

    public String name;
    @Autowired
    Dog dog;

    public Coder(){
        System.out.println("Coder object created");
    }

    public void petInfo(){
        dog.info();
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Coder object destroyed");
    }


}
