package com.lmartino.openClosed.after;

public class Circle implements Shape {
	
	private int radius;
	
	public Circle(int radius) {
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public double calculateArea() {
		return Math.PI * Math.pow(radius, 2);
	}
}
