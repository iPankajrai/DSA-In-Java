/**
 * 
 */
package Recursion;
import java.util.Random;

import Arrays.PrintArray;
/**
 * @author Pankaj Rai
 *
 */
public class Quicksort {
	public static void main(String[] args) {
		Random rand = new Random();
		int[] numbers = new int[1000];
		for(int i=0; i<numbers.length; i++) {
			numbers[i] = rand.nextInt(10000);
		}
		
		System.out.println("Before: ");
		PrintArray print = new PrintArray();
		print.printArray(numbers);
		
		System.out.println("\nAfter: ");
		quicksort(numbers);
		print.printArray(numbers);
	}
	
	public static void quicksort(int[] array) {
		quicksort(array, 0, array.length-1);
	}
	private static void quicksort(int[] array, int lowIndex, int highIndex) {
		if(lowIndex >= highIndex) {
			return;
		}
		
		//select pivot
		// int pivot = array[highIndex];
		int pivotIndex = new Random().nextInt(highIndex - lowIndex) + lowIndex;
		int pivot = array[pivotIndex];
		swap(array, pivotIndex, highIndex);
		
		//partition Start, partitioning such that all the smaller element in the left and larger element in the right of the pivot
		//create two pointer to traverse through the a
		int leftPointer = partition(array, lowIndex, highIndex, pivot);
		
		//Recursive call of quick sort on left of pivot and on right of pivot elements
		quicksort(array, lowIndex, leftPointer-1);
		quicksort(array, leftPointer+1, highIndex);
	}

	private static int partition(int[] array, int lowIndex, int highIndex, int pivot) {
		int leftPointer = lowIndex;	//left most portion of the array 
		int rightPointer = highIndex;	//right most portion of the array (to be partitioned)
		
		// traverse left pointer from left and stop when array[lp] > array[pivot]
		// traverse right pointer from right and stop when array[rp] < array[pivot]
		// swap array[lp] with array[rp]
		while(leftPointer < rightPointer) {
			while(array[leftPointer] <= pivot && leftPointer < rightPointer) {
				leftPointer++;
			}
			while(array[rightPointer] >= pivot && leftPointer < rightPointer) {
				rightPointer--;
			}
			swap(array, leftPointer, rightPointer);
		}
		swap(array, leftPointer, highIndex);
		//Partition End
		return leftPointer;
	}
	private static void swap(int[] array, int index1, int index2) {
		int temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
		return;
	}

}
