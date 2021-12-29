/**
 * Given: Rotated Sorted Array
 * 
 * Return : to find if a element is present or not
 * 
 * Implementation: get pivot and then apply binary search on applicable line
 */
package Arrays;

/**
 * @author Pankaj Rai
 *
 */
public class SearchInSortedRotatedArr {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] arr = {6,7,8,9,1,2,3};
		
		int[] arr2 = {1,2,3,4,5};
		
		int out = searchInRotatedArr(arr, 2);
		
		System.out.println(out);
	}
	
	public static int findPivot(int[] arr){
		int n = arr.length;
		
		int s=0, e = n-1;
		int mid = s + (e-s)/2;
		
		int ans= -1;
		
		while(s<e) {
			
			if(arr[mid] >= arr[0]) {
				s = mid+1;
			}else {
				e =mid;
			}	
				
			mid = s+ (e-s)/2;
				
		}
		ans =e;	//or s	
		
		return ans;
	}
	
	public static int binarySearch(int[] arr, int s, int e, int key) {
		int n = arr.length;
		int mid = s+ (e-s)/2;
		
		while(s<=e) {
			if(arr[mid] == key) {
				return mid;
			}else if(key < arr[mid]) {
				e = mid -1;
			}else if(key > arr[mid]){
				s = mid +1;
			}
			
			mid = s + (e-s)/2;
		}
		
		return -1;
	}
	
	public static int searchInRotatedArr(int[] arr, int key) {
		int n =arr.length;
		int pivot = findPivot(arr);
		
		if(key >= arr[pivot] && (key <= arr[n-1])) {
			return binarySearch(arr, pivot, n-1, key);
		}else {
			return binarySearch(arr, 0, pivot-1, key);
		}
	}
	
}
