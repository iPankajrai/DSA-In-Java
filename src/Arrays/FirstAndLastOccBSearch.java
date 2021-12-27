/**
 *	Given Sorted Array, and an element 
 *  To find the index of first occurrence and last occurrence of that element
 *  
 *  Total number of occurrence of that element can also be found = (last index - first index + 1 ) 
 *  
 *  Problem is based on Binary Search (O(logn))
 */
package Arrays;

/**
 * @author Pankaj Rai
 *
 */
public class FirstAndLastOccBSearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] arr = {0,0,0,1,1,1,1,2,3,4};
		
		int atfirst = firstOcc(arr,1);
		int atLast = lastOcc(arr,1);
		
		System.out.println("The first occurence of 1 is at index = " + atfirst);
		System.out.println("The last occurence of 1 is at index = " + atLast);
		
		//TOTAL NUMBER OF OCCURENCE OF A NUMBER
		System.out.println("The total number of occurence of 1 is = " + (atLast-atfirst +1));
	}
	
	
	public static int firstOcc(int[] arr, int key) {
		
		int n= arr.length;
		int s=0, e= n-1;
		int mid = s+ (e-s)/2;
		int ans =-1;
		while(s<=e) {
			if(arr[mid] == key) {//ans store krke left me jao
				ans =mid;
				e = mid-1;
			}
			else if(key > arr[mid]) {//right me jao
				s = mid+1;
			}
			else if(key < arr[mid]) {//left me jao
				e = mid-1;
			}
			mid = s+ (e-s)/2;//mid update kro
		}
		
		return ans;
		
	}
	
	
public static int lastOcc(int[] arr, int key) {
		
		int n= arr.length;
		int s=0, e= n-1;
		int mid = s+ (e-s)/2;
		int ans =-1;
		while(s<=e) {
			if(arr[mid] == key) {//ans store krke right me jao
				ans =mid;
				s = mid+1;
			}
			else if(key > arr[mid]) {//right me jao
				s = mid+1;
			}
			else if(key < arr[mid]) {//left me jao
				e = mid-1;
			}
			mid = s+ (e-s)/2;//mid update kro
		}
		
		return ans;
		
	}
	
	
	

}
