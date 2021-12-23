package Arrays;

public class PrintArray {

	public static void main(String[] args) {
		
		int[] input = {1,2,3,4,11,1};
		printArray(input);

	}
	
	public static void printArray(int[] arr) {
		int size = arr.length;
		for(int i=0; i<size; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
