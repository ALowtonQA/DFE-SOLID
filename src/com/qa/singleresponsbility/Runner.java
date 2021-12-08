package com.qa.singleresponsbility;

public class Runner {
	
	public static void main(String[] args) {
		
		// Create the car object
		Car ford = new Car("blue", 5000, "focus");
		
		// Create the driver object
		Driver anoush = new Driver(); 
		
		// How many miles does the driver drive?
		anoush.setMilesDriven(500);
		
		// The driver drives the car
		anoush.drive(ford);
		
		// View the mileage after the driver has driven the car
		System.out.println(ford.getMileage());
		
	}
	
}
