package com.techlabs.whilel;
import java.util.Scanner;
public class perfect {
public static void main(String[] args) {
		long n, sum=0;  
		Scanner scanner=new Scanner(System.in);         
		System.out.print("Enter the number: ");  
		n=scanner.nextLong();  
		int i=1;  
		while(i <= n/2)  
		{  
		if(n % i == 0)  
		{  
		 sum = sum + i;  
		} 
		i++;  
		}   
		if(sum==n)  
		{  
		System.out.println(n+" is a perfect number.");  
		} 
		else  
		 System.out.println(n+" is not a perfect number.");   
		}  
		}

