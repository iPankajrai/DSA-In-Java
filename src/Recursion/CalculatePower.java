/**
 * 
 */
package Recursion;

/**
 * @author Pankaj Rai
 *
 */
public class CalculatePower {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println(power(2,6));
	}
	
	public static int power(int x, int n) {
		// base case
		if(n==0) {
			return 1;
		}
		
		// smaller problem
		//x^n = x^1 * x^(n-1)
		int smallAns = power(x, n-1);
		return x*smallAns;
	}
	

}
