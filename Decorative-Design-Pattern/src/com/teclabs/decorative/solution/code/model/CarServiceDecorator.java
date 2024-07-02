package com.teclabs.decorative.solution.code.model;

public abstract class CarServiceDecorator implements ICarService {
    protected ICarService carObj;

    public CarServiceDecorator(ICarService carObj) {
        this.carObj = carObj;
    }

    @Override
    public double getCost() {
        return carObj.getCost();
    }
}
