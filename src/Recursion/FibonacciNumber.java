/**
 * 
 */
package Recursion;

/**
 * @author Pankaj Rai
 *
 */
public class FibonacciNumber {

	public static void main(String[] args) {
		int n =3;
		System.out.println(fib(n));
	}
	
	public static int fib(int n) {
		if(n == 0 || n ==1 ) {
			return n;
		}
		int smallAns = fib(n-1) + fib(n-2);
		return smallAns;
	}
}
