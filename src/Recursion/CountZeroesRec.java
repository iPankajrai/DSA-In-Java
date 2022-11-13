/**
 * 
 */
package Recursion;

/**
 * @author Pankaj Rai
 *
 */
public class CountZeroesRec {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int countZero = countZerosRec(1000300);
		System.out.println(countZero);

	}
	public static int countZerosRec(int input){
		// Write your code here
        if(input/10 == 0 && input == 0){
            return 1;
        }else if(input/10 == 0 && input !=0){
            return 0;
        }
        else{
            int smallOut = countZerosRec(input/10);
        
        	if(input%10 == 0){
                return smallOut + 1;
            }else{
                return smallOut;
            }
        }   
	}
}
