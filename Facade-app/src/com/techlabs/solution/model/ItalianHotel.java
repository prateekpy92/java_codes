package com.techlabs.solution.model;

//Concrete Hotel Class for Italian Hotel
public class ItalianHotel implements IHotel {
 @Override
 public IMenu getMenu() {
     return new ItalianMenu();
 }
}
