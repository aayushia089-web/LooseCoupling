package com.example.demo.looseCoupling;

import org.springframework.stereotype.Component;

@Component("Dog")
public class Dog implements Animal 
{
	public void play()
	{
		System.out.println("Dog is playing");
	}
}
