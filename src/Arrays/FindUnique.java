package Arrays;

public class FindUnique {

	public static void main(String[] args) {
		
		int[] input = {1,1,2,2,3,4,4};
		
		int out = findUnique(input);
		System.out.println(out);
	}
	
	//Array will have duplicate integer in pairs and only one integer will be unique hence we can make use of XOR
	public static int findUnique(int[] arr) {
		int ans =0;
		for (int i=0; i<arr.length; i++) {
			ans ^= arr[i];
		}
		return ans;
	}
}
