package com.qa.openclosed;

public class Triangle implements Shape {

	// properties
	private int base;
	private int height;
	
	// getters and setters
	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public double calculateArea() {
		return 0.5 * base * height;
	}
}
