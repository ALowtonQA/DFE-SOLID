package com.qa.liskov.exercise;

public class Maisonette extends Apartment implements BedroomAddable{

	@Override
	public void setSquareFootage(int sqft) {
		this.setSquareFootage(sqft);
	}
}
