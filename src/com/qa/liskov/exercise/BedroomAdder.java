package com.qa.liskov.exercise;

public class BedroomAdder {
	
	public void addSqft(Apartment apartment) {
		apartment.setSquareFootage(apartment.getSquareFootage() + 40);
	}
	
	// You can only add bedrooms to the penthouse, not studio, so this becomes its own method
	public void addPenthouseBedroom(Penthouse penthouse) {
		addSqft(penthouse);
		penthouse.setNumberOfBedrooms(penthouse.getNumberOfBedrooms() + 1);
	}	
}