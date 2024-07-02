package com.teclabs.decorative.solution.model;

public abstract class HatDecorator implements IHat {
    protected IHat hat;

    public HatDecorator(IHat hat) {
        this.hat = hat;
    }

    

	@Override
    public String getName() {
        return hat.getName();
    }

    @Override
    public String getDescription() {
        return hat.getDescription();
    }
}
