package com.techlabs.model;

import java.io.*;
import java.util.ArrayList;

public class Person {
    private ArrayList<Person> personList;

    public Person() {
        this.personList = new ArrayList<>();
    }

	public void addPerson(Person person) {
        personList.add(person);
    }

    public void addPersonAtBeginning(Person person) {
        personList.add(0, person);
    }

    public void addPersonAtEnd(Person person) {
        personList.add(person);
    }

    public void insertPersonAt(int index, Person person) {
        personList.add(index, person);
    }

    public Person getPerson(int index) {
        return personList.get(index);
    }

    public void updatePerson(int index, Person person) {
        personList.set(index, person);
    }

    public void removePerson(int index) {
        personList.remove(index);
    }

    public boolean containsPerson(Person person) {
        return personList.contains(person);
    }

    public int indexOfPerson(Person person) {
        return personList.indexOf(person);
    }

    public void clearAllPersons() {
        personList.clear();
    }

    public void printAllPersons() {
        for (Person p : personList) {
            System.out.println(p);
        }
    }

    public int getSize() {
        return personList.size();
    }

    public void saveToTextFile(String filename) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (Person person : personList) {
                writer.write(person.toString());
                writer.newLine();
            }
        }
    }

    public void loadFromTextFile(String filename) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            personList.clear();
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(", ");
                String name = parts[0].split(": ")[1];
                int age = Integer.parseInt(parts[1].split(": ")[1]);
                String address = parts[2].split(": ")[1];
                personList.add(new Person());
            }
        }
    }
}

