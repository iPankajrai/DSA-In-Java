/**
 * 
 */
package Recursion;

/**
 * @author Pankaj Rai
 *
 */
public class CountDigit {

	public static void main(String[] args) {
		
		System.out.println(count(666));

	}
	
	public static int count(int n){
        if(n==0){
            return 0;
        }
        int smallAns = count(n/10);
        
        int ans = smallAns+1;
        return ans;
    }

}
