package com.monocept.typecasting;

public class SortedNumber {

	public static int[] main(String[] args) {
		int[] A = {-1, 2, -8, 9, 6, -4};
		int[] result = new int[A.length];
		int low = 0; int high = A.length - 1;
			    for (int i = A.length - 1; i >= 0; i--) {
			      if (Math.abs(A[low]) >= Math.abs(A[high])) {
			        result[i] = A[low] * A[low];
			          low++;
			        } else {
			          result[i] = A[high] * A[high];
			          high--;
			         }
			     }
			    return result;
			   }
			

	
}
}
