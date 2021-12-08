package com.qa.singleresponsbility;

public class Car {

	//solely responsible for setting the attributes
	private String colour; 
	private String model;
	private int mileage; 
	
	// constructor
	public Car(String colour, int mileage, String model) {
		super();
		this.colour = colour;
		this.mileage = mileage;
		this.model = model;
	}

	// getters and setters
	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
}
