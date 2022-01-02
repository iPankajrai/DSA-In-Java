/**
 * Given a string S (that can contain multiple words), you need to find the word which has minimum length.
	Note : If multiple words are of same length, then answer will be first minimum length word in the string.
	Words are seperated by single space only.
	Input Format :
	String S
	Output Format :
	Minimum length word
	Constraints :
	1 <= Length of String S <= 10^5
	Sample Input 1 :
	this is test string
	Sample Output 1 :
	is
	Sample Input 2 :
	abc de ghihjk a uvw h j
	Sample Output 2 :
	a
 * 
 */
package Test2;

/**
 * @author Pankaj Rai
 *
 */
public class MinLengthOfString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
public static String minLengthWord(String input){
		
        int n = input.length();
        int currWordStart =0;
        int currWordEnd = -1;
        int minLength =Integer.MAX_VALUE, currLength =0;
        
        String output ="";
		for(int i=0; i<n; i++){
            if(input.charAt(i) == ' '){
                currWordEnd = i-1;
                currLength = currWordEnd - currWordStart;
                if(currLength < minLength){
                    output = "";
                    minLength = currLength;
                    output  += input.substring(currWordStart, currWordEnd+1); 
                }
                
                currWordStart = i+1;
            }
            
            if(input.charAt(currWordStart) != ' '){
                currWordEnd = n-1;
                currLength = currWordEnd - currWordStart;
                if(currLength < minLength){
                    output = "";
                    minLength = currLength;
                    output  += input.substring(currWordStart, currWordEnd+1); 
                }
            }
            
        }
        
        return output;
		
	}

}
