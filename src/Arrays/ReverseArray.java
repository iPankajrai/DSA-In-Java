package Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		int[] input = {1,2,3,45,6,7,9};
		
		PrintArray p = new PrintArray();
		p.printArray(reverseArray(input));

	}
	
	public static int[] reverseArray(int[] arr) {
		int n = arr.length;
		int s=0;
		int e = n-1;
		while(s<e) {
			int temp = arr[s];
			arr[s] = arr[e];
			arr[e] = temp;
			s++;
			e--;
		}
		
		return arr;
	}

}
