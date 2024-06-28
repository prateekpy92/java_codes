package com.techlabs.solution.test;

import com.techlabs.solution.model.ICarFactory;
import com.techlabs.solution.model.ICars;
import com.techlabs.solution.model.MahindraFactory;
import com.techlabs.solution.model.MarutiFactory;
import com.techlabs.solution.model.TataFactory;

public class abstractDemo {
	public static void main(String[] args) {
        ICarFactory marutiFactory = new MarutiFactory();
        ICars maruti = marutiFactory.makeCar();
        maruti.start();
        maruti.stop();
        
        ICarFactory tataFactory = new TataFactory();
        ICars tata = tataFactory.makeCar();
        tata.start();
        tata.stop();
        
        ICarFactory mahindraFactory = new MahindraFactory();
        ICars mahindra = mahindraFactory.makeCar();
        mahindra.start();
        mahindra.stop();
    }
}


