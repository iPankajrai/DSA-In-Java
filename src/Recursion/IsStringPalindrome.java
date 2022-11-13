/**
 * 
 */
package Recursion;

/**
 * @author Pankaj Rai
 *
 */
public class IsStringPalindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String input = "abc0cba";
		System.out.println(isStringPalindrome(input));

	}
	
	public static boolean isStringPalindrome(String input) {
		
        if(input.length() == 1){
            return true;
        }else if(input.length() == 2 && input.charAt(0) == input.charAt(1)){
            return true;
        }
        
        if(input.charAt(0) != input.charAt(input.length()-1)){
            return false;
        }
        
        return isStringPalindrome(input.substring(1, input.length()-1));

	}
}
