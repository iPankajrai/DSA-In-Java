/**
 * 
 */
package Recursion;

/**
 * @author Pankaj Rai
 *
 */
public class CheckSorted {

	public static void main(String[] args) {
		int[] input = {6,1,2,3,4};
		
		System.out.println(isSortedArray(input));

	}
	
	public static boolean isSortedArray(int[] arr) {
		if(arr.length <= 1 ) {
			return true;
		}
		
		if(arr[0] > arr[1]) {
			return false;
		}
		
		int[] smallInput = new int[arr.length -1];
		for(int i=0; i< arr.length-1; i++) {
			smallInput[i] = arr[i+1];
		}
		boolean smallAns = isSortedArray(smallInput);
		
		return smallAns;
	}

}
