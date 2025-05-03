package first;

import java.util.*;

public class eval1 {
	
	public static double findmedian(int[] A,int[] B)
	{
		int n = A.length;
		
		if (A.length > B.length)
		{
			return findmedian(B,A);
		}
		
		int low=0 ;
		int high = n;  
		int total = 2*n;
		
		while (low <= high)
		{
			int partitionA = (low+high)/2;
			int partitionB = n - partitionA;
			
			int maxleftA = (partitionA==0) ?  Integer.MIN_VALUE : A[partitionA - 1];
			int minrightA= (partitionA==n) ?Integer.MAX_VALUE : A[partitionA ];
		
			
			int maxleftB = (partitionB == 0) ? Integer.MIN_VALUE : B[partitionB - 1];
            int minrightB = (partitionB == n) ? Integer.MAX_VALUE : B[partitionB];

            if (maxleftA <= minrightB && maxleftB <= minrightA) {
                // If the combined arrays have an even number of elements
                return (Math.max(maxleftA, maxleftB) + Math.min(minrightA, minrightB)) / 2.0;
            } 	
            
            else if (maxleftA > minrightB) {
                high = partitionA - 1;
            } 
            // If maxLeftB > minRightA, move right in A
            else {
                low = partitionA + 1;
            }
		}
		
		throw new IllegalArgumentException("Input arrays are not valid.");
		
	}
	

	public static void main(String[] args) {
		int[] A = {1, 3, 8, 9, 15};
		int[] B = {7, 11, 18, 19, 21};
		
		double result = findmedian(A,B);
		System.out.println("the median is : "+result);

	}
}
