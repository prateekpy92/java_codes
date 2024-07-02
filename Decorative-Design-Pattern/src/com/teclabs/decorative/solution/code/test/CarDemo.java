package com.teclabs.decorative.solution.code.test;

import com.teclabs.decorative.solution.code.model.CarInspection;
import com.teclabs.decorative.solution.code.model.ICarService;
import com.teclabs.decorative.solution.code.model.OilChange;
import com.teclabs.decorative.solution.code.model.WheelAlign;

public class CarDemo {
	public static void main(String[] args) {
        ICarService inspection = new CarInspection();
        System.out.println("Cost of Car Inspection: " + inspection.getCost());  
        System.out.println();
        ICarService oilChange = new OilChange(inspection);
        System.out.println("Cost of Car Inspection + Oil Change: " + oilChange.getCost());  
        System.out.println();
        ICarService wheelAlign = new WheelAlign(oilChange);
        System.out.println("Cost of Car Inspection + Oil Change + Wheel Alignment: " + wheelAlign.getCost());  
    }

}
