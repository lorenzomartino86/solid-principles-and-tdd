package com.lmartino.liskovSubstitution.after;

public class MallardDuck implements Duck, Flying {

	public void fly() {
		System.out.println("Fly, fly, fly!");
	}
	
	public void quack() {
		System.out.println("Quack! Quack! Quack!");
	}	

}
