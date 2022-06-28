/**
 * 
 */
package Recursion;
import java.util.Scanner;
/**
 * @author Pankaj Rai
 *
 */
public class PrintTillN {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		print(n);

	}
	public static void print(int n) {
		//to print from 1 to n = print from 1 to n-1  + print n
        
		// base case if n ==0 return nothing
        if(n == 0){
            return;
        }
		
        // smallAns
        print(n-1);
        
        // calculation part
        System.out.print(n + " ");
	}

}
