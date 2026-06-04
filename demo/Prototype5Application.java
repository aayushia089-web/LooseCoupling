package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.looseCoupling.Person;

@SpringBootApplication
public class Prototype5Application {

	public static void main(String[] args) {
		 ApplicationContext context = SpringApplication.run(Prototype5Application.class, args);
	     Person person = context.getBean(Person.class);
	     person.personPlay();
	}

}
