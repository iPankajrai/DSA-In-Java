/**
 * 
 */
package Recursion;

/**
 * @author Pankaj Rai
 *
 */
public class Factorial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n = 4;
		System.out.println(fact(n));

	}
	
	public static int fact(int n) {
		// n! = n*(n-1)*(n-2)*....*1 = n*(n-1)!
		
		//base case
		if(n==0) {
			return 1;
		}
		
		//smaller problem
		int smallAns = fact (n-1);
		
		//n * => operation with smaller problem to get the solution of the actual problem
		return n * smallAns;
	}

}
