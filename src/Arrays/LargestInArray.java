package Arrays;

public class LargestInArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,-123};
		int out = largestInArray(arr);
		System.out.println(out);
	}
	
	public static int largestInArray(int[] arr) {
		int max = Integer.MIN_VALUE;
		for(int i =0; i<arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		return max;
	}

}
