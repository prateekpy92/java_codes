package com.techlabs.test;

import com.techlabs.model.Print;

public class Print_test {
	public static void main(String args[]) {
	Print print1=new Print();
	System.out.println("Point1:");
	System.out.println("("+print1.getX()+", "+print1.getY()+")");
	print1.setX(10);
	print1.setY(20);
	System.out.println("("+print1.getX()+", "+print1.getY()+")");
	Print print2=new Print(print1);
	System.out.println(print1.hashCode());
	System.out.println(print2.hashCode());
	print2=print1;
	System.out.println(print1.hashCode());
	System.out.println(print2.hashCode()); 
	System.out.println("Point2:" );
	System.out.println("("+print2.getX()+", "+print2.getY()+")");
	Print print3=new Print(25,50);
	System.out.println("Point3:");
	System.out.println("("+print3.getX()+", "+print3.getY()+")");

}
}