/**
 * 	Given a non-negative integer x, compute and return the square root of x.

	Since the return type is an integer, the decimal digits are truncated, and only the integer part of the result is returned.
 	
 	Approach 1: brute force method (On(under root n))
 	
 	Approach 2: Using binary search - 
 					Ans i.e sqrt of n will lie in the range of 0 to n
 					and 0,1,2, ... n will be sorted and monotonic hence We can use Binary search
 					0 to n is called as "Search Space" for the solution.
 */
package Arrays;

import java.util.Scanner;

/**
 * @author Pankaj Rai
 *
 */
public class SqrtUsingBSearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Please enter the number ");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		System.out.println("Answer is = " + mySqrt(n));
		s.close();
		return;
	}
	
	public static double mySqrt(int n) {
		
		int tempsoln = binarySearch(n);
		int precision = 3;
		return morePrecision(tempsoln, n, precision );
	}
	
	public static int binarySearch(int n) {
		
		if(n ==0) {
			return 0;
		}
		if(n ==1) {
			return 1;
		}
		int s=1, e=n, mid = s + (e-s)/2, ans=-1;
		
		while((s<=e) && (mid !=0)) {

			if(mid == n/mid) {	//same as mid*mid == n, but prevent overflows
				return mid;
			}
			else if(mid > n/mid) {
				e = mid-1;
			}
			else if(mid < n/mid) {
				ans = mid;
				s = mid+1;
			}
			
			mid = s + (e-s)/2;
		}
		
		return ans;
	}
	
	
	public static double morePrecision(int tempsoln, int n, int precision ) {
		if(tempsoln == 0) {
			return 0;
		}
		double ans = tempsoln, factor =1;
		for(int i=0; i<precision; i++) {
			factor /=10;
			for(double j=ans; j<n/j; j = j+factor) {
				ans =j;
			}
		}
		ans =  Math.floor(ans * 1000) / 1000;	//to remove the unwanted decimal numbers after precision count position
		return ans;
	}
}
