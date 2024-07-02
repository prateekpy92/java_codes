package com.teclabs.decorative.solution.code.model;

public class WheelAlign extends CarServiceDecorator {
    public WheelAlign(ICarService carObj) {
        super(carObj);
    }

    @Override
    public double getCost() {
        return 400 + super.getCost();
    }
}

