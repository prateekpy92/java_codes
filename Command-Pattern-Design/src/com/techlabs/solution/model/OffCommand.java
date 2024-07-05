package com.techlabs.solution.model;

public class OffCommand implements ICommand {
    private Television tv;

    public OffCommand(Television tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.off();
    }
}
