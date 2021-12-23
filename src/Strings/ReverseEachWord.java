package Strings;

public class ReverseEachWord {

	public static void main(String[] args) {
		System.out.println(reverseEachWord("letters of words should be reversed being words in same order"));
	}
	
	public static String reverseEachWord(String input) {
		//letters of words will be reversed being words in same order
		int n = input.length();
		String output ="";
		int currentWordStart =0;
		int currentWordEnd = 0;
		for(int i=0; i<n; i++) {
			if(input.charAt(i) == ' ') {
				//reverse current word
				currentWordEnd = i-1;
				String reversedWord = "";
				for(int j = currentWordStart; j<= currentWordEnd; j++) {
					reversedWord = input.charAt(j) + reversedWord;
				}
				//add to output string
				output += reversedWord + " ";
				currentWordStart = i+1;	
			}
			else if(i == n-1) {
				currentWordEnd = i;
				String reversedWord = "";
				for(int j = currentWordStart; j<= currentWordEnd; j++) {
					reversedWord = input.charAt(j) + reversedWord;
				}
				//add to output string
				output += reversedWord + " ";
				currentWordStart = i+1;	
			}
		}
		
		
		return output;
		
	}

}
