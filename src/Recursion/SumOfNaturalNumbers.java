/**
 * 
 */
package Recursion;

/**
 * @author Pankaj Rai
 *
 */
public class SumOfNaturalNumbers {
	
	public static void main(String[] args) {
		int n = 4;
		System.out.println(sum(n));

	}
	
	public static int sum(int n) {
		// base case
		if(n ==1) {
			return 1;
		}
		
		// smaller problem
		int smallAns = sum(n-1);
		
		// operation with smaller problem to get the actual solution
		return n + smallAns;
	}
}
