package com.techlabs.test;

import com.techlabs.model.BoxWeight;

public class BoxTest {
	

		 public static void main(String[] args) {
		  // TODO Auto-generated method stub
		BoxWeight boxweight=new BoxWeight();
		boxweight.setDept(20);
		boxweight.setWidth(30);
		boxweight.setHeight(50);
		boxweight.setWeight(100);
		System.out.println(boxweight.getDept());
		System.out.println(boxweight.getWidth());
		System.out.println(boxweight.getHeight());
		System.out.println(boxweight.getWeight());

		 }

}
