package com.qa.liskov.animalsolution2;

public class Runner {

	public static void main(String[] args) {
		Animal a = new Animal();
		Owl owl = new Owl();
		Penguin penguin = new Penguin();
		
		a.learnToFly(owl);
		a.tryToFly(penguin);

	}
}
