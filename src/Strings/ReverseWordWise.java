package Strings;

public class ReverseWordWise {

	public static void main(String[] args) {
		System.out.println(reverseWordWise("I am testing the reverse word wise function"));

	}
	
	public static String reverseWordWise(String input) {
		//Returns words in reverse order
		
		int end = input.length();
		int i = input.length() -1;
		String output ="";
		
		while(i>=0) {
			if(input.charAt(i) == ' ') {
				output += input.substring(i+1, end) + " ";
				end =i;
			}
			i--;
		}
		//for first word
		output += input.substring(i+1, end) + " ";
		return output;
	}
}
