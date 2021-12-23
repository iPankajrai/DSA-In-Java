/**
 * 
 */
package Strings;

/**
 * @author Pankaj Rai
 *
 */
public class GetCompressedString {

	/**
	 * @param args : string
	 * 
	 * Return : Compressed string i.e. Count for consecutive duplicates letters (if letter_count > 1)
	 */
	public static void main(String[] args) {
		System.out.println(getCompressedString("aaacddssda"));

	}
	
	public static String getCompressedString(String str) {
		int n = str.length();
        // String output = Character.toString(str.charAt(0));
        
        // int[] freqArr = new int[256];
        
        // for(int i=0; i<n; i++){
        //     ++freqArr[str.charAt(i)];
        // }
        // if(freqArr[str.charAt(0)] >1){
        //     output += "" + freqArr[str.charAt(0)];
        // }
        
        // for(int i=1; i<n; i++){
        //     if(str.charAt(i) != str.charAt(i-1)){
        //     	output += Character.toString(str.charAt(i));
        //         if(freqArr[str.charAt(i)] >1){
        //             output += freqArr[str.charAt(i)];
        //         }
        //     }
        // }
        
        String ans =Character.toString(str.charAt(0));
        int count =1;
    	for(int i=1; i<n; i++){
            if(str.charAt(i-1) != str.charAt(i)){
                if(count>1){
                	ans += count + Character.toString(str.charAt(i));    
                }else{
                    ans += Character.toString(str.charAt(i));
                }
                
                count=0;
            }
            count++;
        }
        if(count>1){
            ans += "" + count;
        }
        
        return ans;
        // return output;
	}

}
