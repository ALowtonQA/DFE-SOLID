package com.qa.liskov.animalsolution;

public class Penguin extends FlightlessBird {
	
	@Override
    public void flap() {
        System.out.println("I'm flapping... but no joy :(");
    }
	
}
