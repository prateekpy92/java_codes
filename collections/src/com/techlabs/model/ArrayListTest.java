package com.techlabs.model;
import java.util.ArrayList;
public class ArrayListTest {


	


	    public static void main(String[] args) {
	        ArrayList<String> list = new ArrayList<String>();
	        list.add("A");
	        list.add("X");
	        //list.add(20);
	        System.out.println(list);
	        list.remove(1);
	        System.out.println(list);
	    }
	}

