/**
 * 
 */
package Strings;

/**
 * @author Pankaj Rai
 *
 */
public class RemoveConsecutiveDuplicates {

	/**
	 * @param args : String
	 * 
	 * Returns : String (after the consecutive duplicates are removed)
	 */
	public static void main(String[] args) {
		System.out.println(removeConsecutiveDuplicates("abbbcccdddv"));

	}
	
	public static String removeConsecutiveDuplicates(String str) {
		//Your code goes here
        String output =Character.toString(str.charAt(0));
        for(int i=1; i<str.length(); i++){
            if(str.charAt(i) != str.charAt(i-1)){
                output +=str.charAt(i);
            }
        }
        
        return output;
	}
}
