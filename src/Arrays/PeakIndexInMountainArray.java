/**
 * To find the index of peak element in Mountain Array
 * 
 * Given : Sorted rotated Array
 * 
 * Return : index of peak element
 */
package Arrays;

/**
 * @author Pankaj Rai
 *
 */
public class PeakIndexInMountainArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] arr = {3,4,5,1};
		
		int peak = peakIndexInMountainArray(arr);
		System.out.println(peak);
	}
	
	public static int peakIndexInMountainArray(int[] arr) {
		int n = arr.length;
		
		int s=0, e = n-1;
		int mid = s + (e-s)/2;
		int ans = -1;
		
		while(s<e) {
			if(arr[mid] < arr[mid + 1]) {
				s = mid+1;
			}
			else {
				e = mid;
			}
			mid = s + (e-s)/2;
		}
		
		ans =e;	//or s
		
		return ans;
		
	}
}
