package com.lmartino.openClosed.after;

public class ShapeCalculator {

	public double calculateArea(Object shape) {
		if (shape instanceof Circle) {
			return circleArea((Circle) shape);
		} else if (shape instanceof Rectangle) {
			return rectangleArea((Rectangle) shape);
		} else if (shape instanceof Triangle) {
			return triangleArea((Triangle) shape);
		}
		throw new UnsupportedOperationException();
	}

	public double calculateArea(Shape shape) {
		return shape.calculateArea();
	}

	private double triangleArea(Triangle triangle) {
		return triangle.getBase() * triangle.getHeight() / 2.0;
	}

	private double rectangleArea(Rectangle rectangle) {
		return rectangle.getHeight() * rectangle.getWidth();
	}

	private double circleArea(Circle circle) {
		return Math.PI * Math.pow(circle.getRadius(), 2);
	}
	
}
