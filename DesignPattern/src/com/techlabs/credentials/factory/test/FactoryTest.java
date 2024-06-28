package com.techlabs.credentials.factory.test;

import com.techlabs.credentials.factory.model.Car;
import com.techlabs.credentials.factory.model.Mahindra;
import com.techlabs.credentials.factory.model.Maruti;
import com.techlabs.credentials.factory.model.TATA;

public class FactoryTest {

	    public static void main(String[] args) {
	        Car car;
	       
	        car=new Maruti();
	        car.start();
	        car.stop();
	        car=new TATA();
	        car.start();
	        car.stop();
	        car=new Mahindra();
	        car.start();
	        car.stop();
}
}