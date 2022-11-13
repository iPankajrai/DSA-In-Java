package Test2;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = {4,2,2,1,5,3};
		//2,4,2,1,5,3
		//2,2,4,1,5,3
		//2,2,1,4,5,3
		//2,2,1,4,3,5
		
		//2,2,1,4,3,5
		//2,1,2,4,3,5
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
			System.out.print(" ");
		}
	}
	
	public static int[] bubbleSort(int[] arr) {
		
		int len = arr.length;
		
		for(int k = 0; k<len; k++) {
			for(int i=k; i<len-1; i++) {
				//ascending order
				if(arr[i+1] < arr[i]) {
					// swap(arr[i+1], arr[i]);
					int temp = arr[i+1];
					arr[i+1] = arr[i];
					arr[i] = temp;
				}
			}
		}
		
		return arr;
		
	}
	
	
	

}
