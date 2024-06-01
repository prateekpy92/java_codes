package com.techlabs.whilel;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		 
	     int num=0 , reverse = 0, rem, temp;
	      num = scanner.nextInt();
	      scanner.close();
	     

	       temp = num;
	     
	     while (temp != 0)
	       {
	     	rem = temp % 10;
	     	reverse = reverse * 10 + rem;
	     	temp /= 10;
	       };

	     
	     if (num == reverse)
	       System.out.println (num + " is Palindrome");
	     else
	       System.out.println (num + " is not Palindrome");

	}

}
