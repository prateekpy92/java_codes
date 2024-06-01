package com.techlabs.model;


public class complexNumbers {
    
    private double real;
    private double imaginary;


    public complexNumbers(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    
    public double getReal() {
        return real;
    }

   
    public void setReal(double real) {
        this.real = real;
    }

    public double getImaginary() {
        return imaginary;
    }

    
    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

   
    public void add(complexNumbers other) {
        this.real += other.real;
        this.imaginary += other.imaginary;
    }

 
   
  
    
    }

}
   