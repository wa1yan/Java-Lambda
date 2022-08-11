package com.waiyanhtet.lambda;

public class AnimalTest {

	public static void main(String[] args) {
		Animal dog = new Animal() {
			
			@Override
			public void eat(String food) {
				System.out.println("dog eat " + food);
			}
		};
		
		Animal cat = (String food) -> System.out.println("cat eat " + food);

		dog.eat("Bone");
		cat.eat("Bread");
	}
}
