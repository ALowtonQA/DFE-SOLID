package com.qa.dependencyinversion.solution;

public class Runner {

	public static void main(String[] args) {
		WeatherTracker w = new WeatherTracker();
		w.setConditions("sunny");
		Phone p = new Phone();
		Email e = new Email();
		
		w.notify(p);
		w.notify(e);
		
	}
	
}
