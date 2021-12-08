package com.qa.interfacesegregation.solution;

public class MealOrder implements MealOrderService {

	@Override
	public void orderMeal(int quantity, int fries) {
		System.out.println("Received order of " + quantity + " burgers and " + fries + " fries");	
	}
}
