/**
 * 
 */
package CollectionFramework;

import java.util.Arrays;

/**
 * @author Pankaj Rai
 *	
 *	Arrays class is used to make manipulation on primitive Arrays not on ArraysList 
 *
 */
public class LearnArraysClass {

	public static void main(String[] args) {
		// For binarySearch
		// int[] numbers = {1,2,3,4,5,6,7,8,9,10};
		// int index = Arrays.binarySearch(numbers, 4);
		// System.out.println("index of 4 is : " + index);
		
		// For sorting
		Integer[] numbers = {10,4,24,54,12,5,23,76,1,0};
		
		Arrays.sort(numbers);
		
		// if numbers.length() > 8192 then only parallelSort will get executed
		
		Arrays.fill(numbers, 12);
		
		
		for(int i: numbers) {
			System.out.print(i + " ");
		}
		
		
	}

}
