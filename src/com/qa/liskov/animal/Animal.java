package com.qa.liskov.animal;

public class Animal {

	public void learnToFly(Bird bird) throws Exception {
		
		if (bird instanceof Owl) {
			bird.fly();
		}
		
//		 This might throw an Exception depending on the type of bird !!
//		 bird.fly();
	}
}
