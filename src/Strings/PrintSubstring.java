package Strings;

public class PrintSubstring {

	public static void main(String[] args) {
		printSubstring("aser");
	}
	
	
	public static void printSubstring(String str) {
		//substring count for string of length n will be n*(n+1)/2
		//returns all the permutation substring formed in same order
		
		
		//Approach 1: 
		// int count =0;
		// int n = str.length();
		// for(int i=0; i<n; i++) {
		// 	for(int j =i; j<=n; j++) {
		// 		System.out.print(str.substring(i, j) + " ");
		// 		if(j<n) {
		// 			count++;
		// 		}
		// 	}
		// 	System.out.println();	
		// }
		// System.out.println("Count of Substrings = " + count);
		
		// Approach 2: Length wise print
		// int i=0,j=1;	//subString's end point is not inclusive
		int n = str.length();
		// int count =n;
		// while((count >=0)) {
		// 	i=0;
		// 	while(i<count) {
		// 		System.out.print(str.substring(i,i+j));		//(i,i+j) can go upto (0,4) where 4 is not inclusive for substring
		// 		System.out.print(" ");
		// 		i++;
		// 	}
		// 	j++;
		// 	count--;
		// }
		
		for(int len=1; len<=n; len++) {
			for(int start = 0; start<=(n-len); start++) {
				int end = start + len;
				System.out.println(str.substring(start,end));
			}
		}
	}
	
}
