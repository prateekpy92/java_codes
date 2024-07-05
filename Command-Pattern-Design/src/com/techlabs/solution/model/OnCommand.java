package com.techlabs.solution.model;

public class OnCommand implements ICommand {
    private Television tv;

    public OnCommand(Television tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.on();
    }
}

