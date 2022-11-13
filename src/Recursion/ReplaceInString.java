/**
 * 
 */
package Recursion;

/**
 * @author Pankaj Rai
 *
 */
public class ReplaceInString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String input = "pixxpixp";
		
		System.out.println(replace(input));

	}
	
	public static String replace(String input){
		return replace(input, 0);
	}
    
    public static String replace(String input, int startIndex){
		
        if(input.length() <= 1){
            return input;
        }
        if(startIndex >= input.length()-1){
            return input;
        }else{
         	if(input.charAt(startIndex) == 'p' && input.charAt(startIndex+1) == 'i'){
                String newInput = input.substring(0,startIndex) + "3.14" + input.substring(startIndex+2);
                return replace(newInput, startIndex+1);
            }else{
                return replace(input, startIndex+1);
            }   
        }
         
    }

}
