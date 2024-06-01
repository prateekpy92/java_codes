package com.teclabs.assi;

public class all_operators {

	public static void main(String[] args) {
		

		       
		        int a = 20, b = 45;
		        System.out.println("a + b = " + (a + b)); 
		        System.out.println("a - b = " + (a - b)); 
		        System.out.println("a * b = " + (a * b));
		        System.out.println("a / b = " + (a / b)); 
		        System.out.println("a % b = " + (a % b));

		       
		        int c = 15;
		        c += 3; 
		        System.out.println("c = " + c);
		        c -= 2;  
		        System.out.println("c = " + c);

		        
		        boolean isEqual = a == b;
		        System.out.println("a == b is " + isEqual); 
		        boolean isGreater = a > b;
		        System.out.println("a > b is " + isGreater); 
		        boolean isLessEqual = c <= b;
		        System.out.println("c <= b is " + isLessEqual); 

		        
		        boolean isEven = (a % 2 == 0) && (b % 2 == 0);
		        System.out.println("(a % 2 == 0) && (b % 2 == 0) is " + isEven); 
		        boolean isTrue = isGreater || isLessEqual;
		        System.out.println("isGreater || isLessEqual is " + isTrue); 
		        boolean isNotEqual = !isEqual;
		        System.out.println("!isEqual is " + isNotEqual); 

		        
		        int count = 0;
		        count++; 
		        System.out.println("count = " + count);
		        count--; 
		        System.out.println("count = " + count);
		        int preIncrement = ++count; 
		        System.out.println("preIncrement = " + preIncrement); 
		        int preDecrement = --count; 
		        System.out.println("preDecrement = " + preDecrement); 

		        
		        byte x = 2; 
		        byte y = 3; 
		        byte bitwiseAnd = (byte) (x & y); 
		        System.out.println("x & y = " + bitwiseAnd); 
		        byte bitwiseOr = (byte) (x | y); 
		        System.out.println("x | y = " + bitwiseOr);
		        byte bitwiseXor = (byte) (x ^ y); 
		        System.out.println("x ^ y = " + bitwiseXor); 
		        byte leftShift = (byte) (x << 1); 
		        System.out.println("x << 1 = " + leftShift); 
		        byte rightShift = (byte) (y >> 1); 
		        System.out.println("y >> 1 = " + rightShift); 
		        
		        String max = (a > b) ? "a is greater" : "b is greater";
		        System.out.println("Max  "+ max);


	}

}
