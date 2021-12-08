package com.qa.openclosed;

public class Circle implements Shape {
	
	private double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double calculateArea() {
		return radius * radius * Math.PI;
	}
}
