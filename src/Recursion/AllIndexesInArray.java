/**
 * 
 */
package Recursion;

import Arrays.PrintArray;

/**
 * @author Pankaj Rai
 *
 */
public class AllIndexesInArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[] = {2,2,0,3,2,5,2};
		int out[]  = allIndexesInArray(arr, 2);
		
		PrintArray p = new PrintArray();
		p.printArray(out);

	}
	
	public static int[] allIndexesInArray(int input[], int x, int startIndex){
        if(startIndex >= input.length){
            int output[] = new int[0];
            return output;
        }
        
        int smallOutput[] = allIndexesInArray(input, x, startIndex+1);
        
        if(input[startIndex] == x){
            int output[] = new int[smallOutput.length + 1];
            output[0] = startIndex;
            
            for(int i=0; i<smallOutput.length; i++){
                output[i+1] = smallOutput[i];
            }
            
            return output;
        }else{
            return smallOutput;
        }
        
    }
    
    public static int[] allIndexesInArray(int input[], int x){
        return allIndexesInArray(input, x, 0);
    }

}
