package com.techlabs.solution.model;

public class MahindraFactory implements ICarFactory {
    @Override
    public ICars makeCar() {
        return new Mahindra();
    }
}
