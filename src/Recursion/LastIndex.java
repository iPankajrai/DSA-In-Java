package Recursion;

public class LastIndex {

	public static void main(String[] args) {
		
		int[] input = {1,2,3,5,6,7,3,8,0};
		System.out.println(lastIndex(input,3));

	}
	
	public static int lastIndex(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
        return helperLastIndex_2(input, x, 0);
	}
    
    private static int helperLastIndex(int input[], int x, int startIndex){
        if(startIndex >= input.length){
            return -1;
        }
        int lastIndex = input.length-startIndex-1;
        if(input[lastIndex] == x){
             return lastIndex;
        }
        
        
        return helperLastIndex(input,x,startIndex+1);
    }
    
    private static int helperLastIndex_2(int input[], int x, int startIndex){
       if(startIndex >= input.length){
            return -1;
        }
        int smallAns = helperLastIndex_2(input, x, startIndex+1);
        
        if(smallAns != -1){
            return smallAns;
        }
        if(input[startIndex] == x){
            return startIndex;
        }else{
            return -1;
        }
    }

}
