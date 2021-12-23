package Strings;

public class PrintCharOfString {

	public static void main(String[] args) {
		printCharOfString("asdbdsbad1231");
	}
	
	public static void printCharOfString(String str) {
		for(int i=0; i<str.length(); i++) {
			System.out.print(str.charAt(i) + " ");
		}
	}

}
