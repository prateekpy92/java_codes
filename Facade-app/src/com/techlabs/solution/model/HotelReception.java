package com.techlabs.solution.model;


public class HotelReception {
 public void getIndianMenu() {
     IHotel indHotel = new IndianHotel();
     IMenu menu = indHotel.getMenu();
     menu.displayMenu();
 }

 public void getItalianMenu() {
     IHotel itaHotel = new ItalianHotel();
     IMenu menu = itaHotel.getMenu();
     menu.displayMenu();
 }

}
