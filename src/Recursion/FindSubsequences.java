/**
 * 
 */
package Recursion;

import Arrays.PrintArray;

/**
 * @author Pankaj Rai
 *
 */
public class FindSubsequences {

	public static void main(String[] args) {
		String str = "abcd";
		String[] strSeq = findSubsequences(str);
		for(int i=0; i<strSeq.length; i++) {
			System.out.println(strSeq[i]);
		}

	}
	
	public static String[] findSubsequences(String str) {
		if(str.length() == 0) {
			String ans[] = {""};
			return ans;
		}
		
		String smallAns[] = findSubsequences(str.substring(1));
		String ans[] = new String[2*smallAns.length];
		
		for(int i=0; i<smallAns.length; i++) {
			ans[i] = smallAns[i];
		}
		
		for(int i=0; i<smallAns.length; i++) {
			ans[i+smallAns.length] = str.charAt(0) + smallAns[i];
		}
		return ans;
	}

}
