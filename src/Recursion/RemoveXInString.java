/**
 * 
 */
package Recursion;

/**
 * @author Pankaj Rai
 *
 */
public class RemoveXInString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String input = "avxxxbx";
		System.out.println(removeX(input));

	}
	
	// Return the changed string
    public static String removeX(String input){
        return removeX(input,0);
    }
    
	public static String removeX(String input, int startIndex){
		if(input.length() <= 0){
            return input;
        }
        if(startIndex >= input.length()){
            return input;
        }
        
        if(input.charAt(startIndex) == 'x'){
            String newInput = input.substring(0, startIndex) + input.substring(startIndex+1);
            return removeX(newInput, startIndex);
        }else{
            return removeX(input, startIndex+1);
        }
	}

}
