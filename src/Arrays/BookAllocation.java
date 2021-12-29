/**
 * Given Array of pages of books and m students
 * 
 * To find: To allocate pages to m students such that MAXIMUM PAGES ALLOCATED TO A STUDENT SHOULD BE MINIMUM
 * 				also all the pages should be assigned and all the students should also be allocated
 * 
 */
package Arrays;

import java.util.Date;

/**
 * @author Pankaj Rai
 *
 */
public class BookAllocation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long t1 = System. currentTimeMillis();
		
		int[] arr = {12, 34, 67, 90};
		int min_page = allocateBooks(arr, 2);
		System.out.println(min_page);
		
		long t2 = System. currentTimeMillis();
		long t = t2 - t1;	//milliseconds for the progream to execute
		System.out.println("Total Time taken to run this program = " + t + " ms");	
	}
	
	public static int allocateBooks(int[] arr, int students) {
		int s=0;
		int n = arr.length;
		int pageSum =0;
		for(int i=0; i<n; i++) {
			pageSum += arr[i];
		}
		int e = pageSum;
		
		int ans= -1;
		
		int mid = s + (e-s)/2;
		
		while(s<=e) {
			
			if(isPossible(arr,students, mid) == true) {
				ans = mid;
				e = mid -1;
			}else {
				s = mid+1;
			}
			
			mid = s + (e-s)/2;
		}
		return ans;
	}
	
	/*
	 * isPossible function checks if a passed mid value, could be a "maximum number of pages" which can be allocated to a student after allocation to m students
	 */
	public static boolean isPossible(int[] arr, int students, int mid) {
		
		int n = arr.length;
		
		int studentCount =1;	//will start with one student
		int pageSum =0;			//variable for total pages to be allocated to a student
		
		//Now to compare if the pageSum allocated to every student is less than or equal to mid
		for(int i=0; i<n; i++) {
			if(pageSum + arr[i] <= mid) {
				pageSum += arr[i];
			}else {
				studentCount++;	//if pages allocated to a student exceeds mid then allocate to another student
				
				if(studentCount > students || arr[i] > mid) {
					return false;
				}
				pageSum =arr[i];	//allocating to another student then clear the past value in pageSum variable and assign the current page
				
			}
		}
		return true;
	}

}
