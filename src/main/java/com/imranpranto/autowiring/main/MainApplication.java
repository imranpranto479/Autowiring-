package com.imranpranto.autowiring.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.imranpranto.autowiring.main.model.Coder;

@SpringBootApplication
public class MainApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(MainApplication.class, args);

		Coder c1= context.getBean(Coder.class);
		// c1.petInfo();
		c1.name= "Adam";
		System.out.println(c1.name);

		Coder c2= context.getBean(Coder.class);
		// c2.name= "Adam";
		System.out.println(c2.name);


	}

}
