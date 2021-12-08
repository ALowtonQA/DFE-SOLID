package com.qa.openclosed;

public class Runner {

	public static void main(String[] args) {
		
		// Shapes
		Rectangle rectangle = new Rectangle();
		rectangle.setLength(10);
		rectangle.setWidth(10);
		
		Triangle triangle = new Triangle();
		triangle.setBase(5);
		triangle.setHeight(10);
		
		Circle circle = new Circle();
		circle.setRadius(10);

		AreaCalculator calc = new AreaCalculator();
		calc.calculateArea(rectangle);
		calc.calculateArea(triangle);
		calc.calculateArea(circle);
	}

}
