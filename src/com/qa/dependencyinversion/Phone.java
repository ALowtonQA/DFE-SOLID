package com.qa.dependencyinversion;

public class Phone {
	public String generateWeatherAlert(String conditions) {
		String alert = "It is " + conditions;
		return alert;
	}
}
