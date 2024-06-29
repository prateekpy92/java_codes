package com.techlabs.solution.model;

//Concrete Menu Class for Indian Menu
public class IndianMenu implements IMenu {
 @Override
 public void displayMenu() {
     System.out.println("Indian Menu");
     System.out.println("1. Butter Chicken");
     System.out.println("2. Paneer Tikka");
     System.out.println("3. Naan");
     System.out.println("4. Biryani");
 }
}
