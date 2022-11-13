package Test2;

public class SortUsingBinarySearch {

	public static void main(String[] args) {
		int[] arr = {4,2,5,1,3};
		
		for(int i=0; i< arr.length; i++) {
			System.out.print(sortBS(arr)[i] + " ");
		}

	}
	
	public static int[] sortBS(int[] arr) {
		// {4,2,5,1,3}
		
		int s = 0;
		int e = arr.length -1;
		
		int mid = (s + (e-s)/2);
		
		while(s<=e) {
			if(arr[e] < arr[s]) {
				// swap arr[s] with arr[e]
				int temp = arr[e];
				arr[e] = arr[s];
				arr[s] = temp;
				e = mid-1;
			}else if(arr[e] > arr[s]) {
				s = mid +1;
			}
			mid = (s + (e-s)/2);
			
		}
		
		return arr;
	}
	
}
