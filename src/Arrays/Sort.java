package Arrays;

public class Sort {

	public static void main(String[] args) {
		
		int[] input = {1,3,1,0,5,9,5,4,10,11};
		int[] input2 = {1,3,5,9,10,11,34,56,67};	//sorted for merge sort
		
		PrintArray print= new PrintArray();
		print.printArray(selectionSort(input));	//sort using selection sort
		
		print.printArray(bubbleSort(input));	//sort using bubble sort
		
		print.printArray(insertionSort(input));	//sort using insertionSort
		
		print.printArray(mergeSort(input, input2));	//sort using mergeSort
		
		
	}
	
	public static int[] selectionSort(int[] arr) {
		int n = arr.length;
		for(int i=0; i<n-1; i++) {
			int min= i;
			for(int j =i+1; j<n; j++) {
				if(arr[j] < arr[min]) {
					min = j;
				}
			}
			//swap  arr[i] and arr[min]
			if(i != min) {
				arr[i] = arr[i] + arr[min];
				arr[min] = arr[i] - arr[min];
				arr[i] = arr[i] - arr[min];
			}
			
		}
		return arr;
	}
	
	public static int[] bubbleSort(int[] arr) {
		int n = arr.length;
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n-i-1; j++) {
				//compare and swap
				if(arr[j] > arr[j+1]) {
					arr[j] = arr[j] + arr[j+1];
					arr[j+1] = arr[j] - arr[j+1];
					arr[j] = arr[j] - arr[j+1];
				}
			}
		}
		
		return arr;
	}
	
	public static int[] insertionSort(int[] arr) {
		int n = arr.length;
		for(int i=1; i<n; i++) {
			for(int j = i-1; j>=0; j--) {
				//if unsorted element is smaller than the other element in sorted side, right shift the sorted element ( swapping here)
				if(arr[j+1] < arr[j]){
                    arr[j+1] = arr[j+1] + arr[j];
                    arr[j] = arr[j+1] - arr[j];
                    arr[j+1] = arr[j+1] - arr[j];
                }
			}
		}
		
		return arr;
	}
	
	public static int[] mergeSort(int[] arr1, int[] arr2) {
		
		//Merge two sorted arrays
		//returns merged and sorted array
		
		int n1 = arr1.length;
		int n2 = arr2.length;
		int n3 = n1+n2;
		
		int arr3[] = new int[n3];
		
		int k=0;
		int i=0; 
		int j=0;
		while(k<n3){
			while(j<n2 && i<n1) {
				if(arr2[j] < arr1[i]) {
					arr3[k] = arr2[j];
					j++;
					k++;
				}else if(arr1[i] < arr2[j]) {
					arr3[k] = arr1[i];
					i++;
					k++;
				}else if(arr1[i] == arr2[j]){
					arr3[k] = arr1[i];
					i++;
					k++;
				}
			}
			while(i < n1) {
				arr3[k] = arr1[i];
				k++;
				i++;
			}
            while(j < n2) {
				arr3[k] = arr2[j];
				k++;
				j++;
			}
		}
		
		return arr3;
	}
	
	
}
