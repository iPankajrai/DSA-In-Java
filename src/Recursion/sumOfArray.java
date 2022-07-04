/**
 * 
 */
package Recursion;

/**
 * @author Pankaj Rai
 *
 */
public class sumOfArray {

	public static void main(String[] args) {
		int[] arr = {1,3,4,5};
		int sol = sum(arr);
		System.out.println(sol);
	}
	
	public static int sum(int input[]) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
		// input[N] = [1,3,4,5]
        // sum ([1,3,4,5]) = 
        
        if(input.length == 1){
            return input[0];
        }
        
        int smallInput[] = new int[input.length - 1];
        for(int i=1; i< input.length; i++){
            smallInput[i-1] = input[i];
        }
        
        int smallAns = sum(smallInput);
        
        return smallAns + input[0];
		
	}

}
