package com.example.demo.looseCoupling;

import org.springframework.stereotype.Component;

@Component("Parrot")
public class Parrot implements Animal{
	public void play()
	{
		System.out.println("Parrot is playing");
	}
}
