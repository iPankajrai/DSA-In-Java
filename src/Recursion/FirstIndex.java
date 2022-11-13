package Recursion;

public class FirstIndex {

	public static void main(String[] args) {
		
		int[] input = {1,3,4,5,1,4};
		
		int ans = firstIndex(input, 4);
		
		System.out.println(ans);

	}
	
	public static int firstIndex(int input[], int x) {
		return searchFirstIndex(input, x, 0);
	}
	
	private static int searchFirstIndex(int input[], int x, int startIndex) {
		if(startIndex >= input.length) {
			return -1;
		}
		if(input[startIndex] == x) {
			return startIndex;
		}
		return searchFirstIndex(input, x, startIndex+1);
	}

}
