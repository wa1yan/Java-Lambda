package com.waiyanhtet.lambda;

public class RunnableTest {

	public static void main(String[] args) {
	
		Runnable r1 = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Hello runner 1");
				
			}
		};
		
		Runnable r2 = () -> System.out.println("Hello runner 2");
		
		r1.run();
		r2.run();
	}
}
