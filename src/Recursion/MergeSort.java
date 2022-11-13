/**
 * 
 */
package Recursion;

import Arrays.PrintArray;

/**
 * @author Pankaj Rai
 *
 */
public class MergeSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] input = {50,1,6,8,2,4,9,11,3,35};
		mergeSort(input);
		PrintArray print = new PrintArray();
		print.printArray(input);

	}
	
	public static void mergeSort(int[] input){
		mergeSortHelper(input, 0, input.length-1);
        
	}
    
    public static void mergeSortHelper(int[] input, int si, int ei){
        if(si >= ei){
            return;
        }
        int mid = (si+ei)/2;
        // part1: left side of mid
        mergeSortHelper(input, si, mid);
        //part2: right side of mid
        mergeSortHelper(input, mid+1, ei);
        // merge on returned array
        merge(input, si, ei);
    }
    
    private static void merge(int[] input, int si, int ei){
        int mid = (si+ei)/2;
        // int len1 = mid-si;
        // int len2 = ei-mid;
        int len3 = ei-si+1;
        
        int[] mergedArr = new int[len3];
        
        int i=si;
        int j=mid+1;
        int k=0;
        
        while(k<len3){
            // insert elements into merged array
            while(i<=mid && j<=ei){
                //To insert elements from array 1 and array 2 on sorting order
                if(input[i]<input[j]){
                    mergedArr[k] = input[i];
                    i++;
                    k++;
                }else {
                    mergedArr[k] = input[j];
                    j++;
                    k++;
                }
            }
            while(i<=mid){
                //To insert rest of the element of array 1
                mergedArr[k] = input[i];
                k++;
                i++;
            }
            while(j<=ei){
                //To insert rest of the element of array 2
                mergedArr[k] = input[j];
                k++;
                j++;
            }
        }
        
        for(int index=0; index<len3; index++){
            input[si+index] = mergedArr[index];
        }
        
    }


}
