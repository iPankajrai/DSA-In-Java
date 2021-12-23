package Strings;

public class CheckPalindrome {

	public static void main(String[] args) {
		
		System.out.println(checkPalindrome("1230321"));
		
		System.out.println(checkPalindrome2("123321"));

	}
	
	public static boolean checkPalindrome(String str) {
		if(str.equals(reverseString(str))) {
			return true;
		}
		return false;
	}
	
	public static String reverseString(String str) {
		String stringg = "";
		for(int i =0; i<str.length(); i++) {
			stringg = str.charAt(i) + stringg;
		}
		return stringg;
	}
	
	public static boolean checkPalindrome2(String str) {
		int s = 0;
		int e = str.length()-1;
		while(s<e) {
			if(str.charAt(s) != str.charAt(e)) {
				return false;
			}
			s++;
			e--;
		}
		return true;
	}

}
