package com.techlabs.solution.test;

import com.techlabs.solution.model.CDBuilder;
import com.techlabs.solution.model.CDType;

public class CompanyTest{  
	 public static void main(String args[]){  
	   CDBuilder cdBuilder=new CDBuilder();  
	   CDType cdType1=cdBuilder.buildNokiaCD();  
	   cdType1.showItems();  
	  
	   CDType cdType2=cdBuilder.buildSamsungCD();  
	   cdType2.showItems();  
	 }  
	}  