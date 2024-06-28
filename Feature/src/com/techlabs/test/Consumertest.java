package com.techlabs.test;

import com.techlabs.model.Consumer;

public class Consumertest {

	public static void main(String[] args) {
		Consumer consumer=(arg)->System.out.println(arg);
		
		consumer.accept(50);
	}

}
