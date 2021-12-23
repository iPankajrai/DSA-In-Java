/**
 * 
 */
package Strings;

/**
 * @author Pankaj Rai
 *
 */
public class IsPermutation {

	/**
	 * @param args : String1 and String2
	 * 		
	 * 
	 * Returns: Boolean (whether str2 is permutation of str1 or not)
	 */
	
	public static void main(String[] args) {
		System.out.println(isPermutation("abc", "cab"));	//true
		System.out.println(isPermutation("abcc", "cabb"));	//false

	}
	
	public static boolean isPermutation(String str1, String str2) {
        //if the length is not equal return false
        if(str1.length() != str2.length()){
            return false;
        }
        if(str1.length() == 1 && str2.length()==1){
            if(str1 != str2){
                return false;
            }
        }
        //if character set doesn't matches return false
		// for(int i=0; i<str1.length(); i++){
		// if(!(str2.contains(Character.toString(str1.charAt(i))))){
		// return false;
		// }
		// }
        
        //We aslo need to check for frequency of occurence of characters.
        //make frequency array of index 0 to 255. so that we can compare with ascii value of characters in string
        //and increment and decrement in the frequency array
        //increment value for one string and decrement for second string
        //if comes zero at each index of freq array then return true else return false
        //int count=0;
        int[] freqArray = new int[256];
        for(int i=0; i<str1.length(); i++){
            //for string 1
            char c1 = str1.charAt(i);
            ++freqArray[c1];
            
            //for string 2
            char c2 = str2.charAt(i);
            --freqArray[c2];
        }
        
        //if there is same number occurrences then 0 should be there at every index
        for(int j=0; j<255; j++){
            if(freqArray[j] != 0){
                return false;
            }
        }
        
        //else return true
        return true;
	}

}
