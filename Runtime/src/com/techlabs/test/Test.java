package com.techlabs.test;

import com.techlabs.model.Circle;
import com.techlabs.model.Rectangle;
import com.techlabs.model.Shape;

public class Test {

	    public static void main(String[] args) {
	        Shape rectangle = new Rectangle(5, 10);
	        Shape circle = new Circle(20);

	        System.out.println("Area of Rectangle: " + rectangle.area());
	        System.out.println("Area of Circle: " + circle.area());
	    }
	}
