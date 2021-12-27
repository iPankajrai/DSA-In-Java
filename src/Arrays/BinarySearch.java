package Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		
		int[] input = {1,2,3,4,5};

		int index = binarySearch(input, 0);
		System.out.println(index);

	}
	
	public static int binarySearch(int[] arr, int elem) {
		//Input array must be sorted and monotonic
		//Returns index of searched element else -1 if not found
		
		int s = 0;
		int e = arr.length-1;
		int mid = s + (e-s)/2;
		
		//we should search elem in arr while start is not greater than end
		while(s<=e) {
			if(arr[mid] == elem) {
				return mid;
			}
			else if(elem > arr[mid]) {
				s = mid +1;
			}
			else if(elem < arr[mid]) {
				e = mid-1;
			}
			mid = s+(e-s)/2;
		}
		//if not found the elem in given array then return -1
		return -1;
	}
	
	
	
}
