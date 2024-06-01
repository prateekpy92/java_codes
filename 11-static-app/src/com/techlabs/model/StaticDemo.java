package com.techlabs.model;

public class StaticDemo {
	private static int number1;
	private  int number2;
	
	public StaticDemo()
	{
		number1=0;
		number2=0;
		
	}
	public void increment(){
		number1++;
		number2++;
	}
	public void display() {
		System.out.println("number 1:"+number1);
		System.out.println("number 2:"+number2);
	}
	static {
		System.out.println("HIIIIIIIIIIIII"+number1);
	}
}
