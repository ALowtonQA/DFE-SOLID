package com.qa.liskov.animalsolution2;

public class Animal {

	public void learnToFly(Owl owl) {
		owl.fly();
	}
	
	public void tryToFly(Penguin penguin) {
		penguin.flap();
	}
}
