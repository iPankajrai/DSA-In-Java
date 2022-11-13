/**
 * 
 */
package Recursion;

/**
 * @author Pankaj Rai
 *
 */
public class SumOfDigitRec {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println(sumOfDigits(123));

	}
	
	public static int sumOfDigits(int input){
		//base case
        if(input == 0){
            return 0;
        }
        return ((input%10) + sumOfDigits(input/10));
	}

}
