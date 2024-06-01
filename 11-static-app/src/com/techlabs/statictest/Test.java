package com.techlabs.statictest;

import com.techlabs.model.StaticDemo;

public class Test {

	public static void main(String[] args) {
		StaticDemo demo1 = new StaticDemo();
		demo1.display();
		System.out.println("HELLLLLLLLLLLO");
		StaticDemo demo2 = new StaticDemo();
		demo2.display();
		System.out.println("HELLLLLLLLLLLO");
		StaticDemo demo3 = new StaticDemo();
		demo3.display();
		
		
		

		demo1.increment();
		demo1.display();
		
		demo2.increment();
		demo2.display();
		
		demo3.increment();
		demo3.display();

	}
	static {
		StaticDemo demo3 = new StaticDemo();
		System.out.println("HELLLLLLLLLLLO");
	}

}
