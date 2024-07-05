package com.techlabs.composite.solution.example.model;

public class Developer implements IEmployee {
    private String name;
    private String position;

    public Developer(String name, String position) {
        this.name = name;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println("Developer: " + name + ", Position: " + position);
    }

    @Override
    public String toString() {
        return "Developer{name='" + name + "', position='" + position + "'}";
    }
}

