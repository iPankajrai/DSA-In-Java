package Strings;

public class ReverseString {

	public static void main(String[] args) {
		
		System.out.println(reverseString("abcd123"));

	}
	
	public static String reverseString(String str) {
		// char[] string = str.toCharArray();
		// int s =0;
		// int e = string.length-1;
		
		// while(s<e) {
		// 	char temp = string[s];
		// 	string[s]= string[e];
		// 	string[e] = temp;
		// 	s++;
		// 	e--;
		// }
		// String stringg = String.valueOf(string);
		
		//approach 2: simply concatenate from end to initial
		String stringg = "";
		for(int i =0; i<str.length(); i++) {
			stringg = str.charAt(i) + stringg;
		}
		return stringg;
		
	}

}
