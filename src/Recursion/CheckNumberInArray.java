package Recursion;

public class CheckNumberInArray {

	public static void main(String[] args) {
		int[] inputArr = {1,2,3,4,5};
		
		System.out.println(checkNumber(inputArr,7));

	}
	
	public static boolean checkNumber(int input[], int x) {
        // we need to check number x in input array
        // we will check the number at index 0 and if found return true else
        // check at index 1 and so on...
        // so base case => 
        if(input.length < 1){
            return false;
        }
        if(input[0] == x){
            return true;
        }
        
        int[] smallInput = new int[input.length -1];
        
        for(int i=1; i<input.length; i++){
            smallInput[i-1] = input[i];
        }
        boolean smallAns = checkNumber(smallInput, x);
        
        return smallAns;
	}

	
	
}
