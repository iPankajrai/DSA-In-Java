package Arrays;

public class FindDuplicate {

	public static void main(String[] args) {
		
		int[] input = {1,2,3,4,4};
		int out = findDuplicate(input);
		System.out.println(out);
	}
	
	public static int findDuplicate(int[] arr) {
		int ans =0;
		
		//XOR with array elements with 1 to n-1 numbers, because array elements consists of 1 to n-1 numbers
		for(int i=0; i<arr.length; i++) {
			ans ^= arr[i]; 
		}
		for(int i =1; i<arr.length; i++) {
			ans ^= i;
		}
		
		return ans;
	}
	
}
