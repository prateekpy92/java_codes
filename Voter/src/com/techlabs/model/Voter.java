package com.techlabs.model;



import com.techlabs.model.AgeNotValidException;

public class Voter {
    private String name;
    private int age;

    public Voter(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void vote() throws AgeNotValidException {
        if (age < 18) {
            throw new AgeNotValidException("Age " + age + " is not valid for voting. Must be at least 18.");
        }
        System.out.println(name + " has cast a vote.");
    }
}

