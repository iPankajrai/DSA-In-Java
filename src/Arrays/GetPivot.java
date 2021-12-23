package Arrays;

public class GetPivot {

	public static void main(String[] args) {
		int[] arr = {5,6,1,2,3,4};	//array passed to getPivot function should be rotated sorted array
		int indexOfPivot = getPivot(arr);
		System.out.println("indexOfPivot =  " + indexOfPivot);

	}
	
	public static int getPivot(int[] arr){
		//takes input as rotated sorted array
		//return index of sorted array
		
    	int n = arr.length;
        int s=0;
        int e = n-1;
        int mid = s + (e-s)/2;
        while(s < e){
            if(arr[mid] >= arr[0]){
                s = mid+1;
            }else{
                e = mid;
            }
            mid = s + (e-s)/2;
        }
        return s;
    }

}
