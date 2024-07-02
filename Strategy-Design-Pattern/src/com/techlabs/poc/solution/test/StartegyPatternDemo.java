package com.techlabs.poc.solution.test;

import java.io.BufferedReader;  
import java.io.IOException;  
import java.io.InputStreamReader;

import com.techlabs.poc.solution.model.Addition;
import com.techlabs.poc.solution.model.Context;
import com.techlabs.poc.solution.model.Multiplication;
import com.techlabs.poc.solution.model.Subtraction;  
  
public class StartegyPatternDemo {  
      
    public static void main(String[] args) throws NumberFormatException, IOException {  
          
          BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
          System.out.print("Enter the first value: ");  
          float value1=Float.parseFloat(br.readLine()); 
          System.out.println("----------------------- ");  
          System.out.println("Enter the second value: "); 
           
          float value2=Float.parseFloat(br.readLine());  
          System.out.println("----------------------- ");
          System.out.println("----------------------- ");
          Context context = new Context(new Addition());          
          System.out.println("Addition = " + context.executeStrategy(value1, value2));  
          System.out.println("----------------------- "); 
          context = new Context(new Subtraction());       
          System.out.println("Subtraction = " + context.executeStrategy(value1, value2));  
          System.out.println("----------------------- "); 
          context = new Context(new Multiplication());        
          System.out.println("Multiplication = " + context.executeStrategy(value1, value2));  
       }  
  
}
