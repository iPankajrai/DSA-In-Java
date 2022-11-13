/**
 * 
 */
package Recursion;

/**
 * @author Pankaj Rai
 *
 */
public class MultiplyTwoIntegers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(multiplyTwoIntegers(2,5));

	}
	
	public static int multiplyTwoIntegers(int m, int n){
		if(n == 1){
            return m;
        }
     	int smallOutput = multiplyTwoIntegers(m, n-1);
        int ans = smallOutput + m;
        return ans;
	}

}
