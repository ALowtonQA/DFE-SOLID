package com.qa.liskov.exercise;

public class Penthouse extends Apartment implements BedroomAddable {
	
	public Penthouse() {
		this.setNumberOfBedrooms(4);
	}

	@Override
	public void setSquareFootage(int sqft) {
		this.setSquareFootage(sqft);
	}
	
}
