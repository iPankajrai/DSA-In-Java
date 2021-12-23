package Arrays;

public class SortZeroesAndOne {

	public static void main(String[] args) {
		
		int[] input = {0,1,0,0,1,1,1,0};
		sortZeroesAndOne(input);
		
		PrintArray x = new PrintArray();
		x.printArray(input);

	}
	
	public static void sortZeroesAndOne(int[] arr) {
    	//Your code goes here
        // Arrays.sort(arr);
        //two pointer approach: make conditions
        
        int i =0; 
        int j = arr.length-1;
        while(i<j){
            while(arr[i] ==0 && i<j){
                i++;
            }
            while(arr[j] ==1 && i<j){
                j--;
            }
            //arr[i] ==1 && arr[j] ==0
            if(i<j){
                //swap arr[i] and arr[j] then i++ and j--
                arr[i] = arr[i] + arr[j];
                arr[j] = arr[i] - arr[j];
                arr[i] = arr[i] - arr[j];
                i++;
                j--;
                
            }
        }
    }

}
