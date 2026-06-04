package com.example.demo.looseCoupling;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {
	
	@Qualifier("Parrot")
	@Autowired
	Animal animal;
	public void personPlay()
	{
		animal.play();
		System.out.println("Person is playing");
	}

}
