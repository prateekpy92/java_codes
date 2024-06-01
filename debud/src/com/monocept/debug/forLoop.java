package com.monocept.debug;

public class forLoop {
	static int row=6;
	static int i;
	static int j;
	public static void main(String[] args) {
		 System.out.println("Prime numbers between 1 and 50:");

		    for ( int num = 2; num <= 50; num++) {
		     
boolean Prime = true;

for (int i = 2; i < num; i++) {
		        if (num % i == 0) {
		          Prime = false;
		          break; 
		        }
		      }

if (Prime) {
 
	for(i=0; i<row; i++) 
		
	{   
	for( j=0; j<=i; j++)   
	{   
	System.out.print(num);   
	}   
	System.out.println("");   
		      }
		      }

	}
	}
}