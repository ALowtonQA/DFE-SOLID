package com.qa.liskov.animal;

public class Runner {

	public static void main(String[] args) {
		
		Animal animal = new Animal();
		
		Owl owl = new Owl();
		Penguin penguin = new Penguin();

		try {
			animal.learnToFly(owl);
			animal.learnToFly(penguin);
		} catch (Exception e) {
			System.err.println(e);
		}
		
	}
}
