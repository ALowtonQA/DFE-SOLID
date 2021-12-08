package com.qa.dependencyinversion;

public class WeatherTracker {
	private String conditions;
	Phone phone;
	Email email;

	public WeatherTracker() {
		phone = new Phone();
		email = new Email();
	}

	public void setConditions(String weather) {
		this.conditions = weather;
		if (weather.equals("rainy")) {
			String alert = phone.generateWeatherAlert(weather);
			System.out.println(alert);
		}
		if (weather.equals("sunny")) {
			String alert = email.generateWeatherAlert(weather);
			System.out.println(alert);
		}
	}

	public String getConditions() {
		return conditions;
	}
}
