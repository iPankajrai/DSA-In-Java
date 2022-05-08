/**
 * 
 */
package Test2;

/**
 * @author Pankaj Rai
 *
 */
public class LeadersInArray {

	/**
	 * @param args
	 */
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {13, 17, 5, 4, 6};
		leaders(arr);
	}


	
	public static void leaders(int[] input) {
		/* Your class should be named Solution 
		 * Don't write main(). 
		 * Don't read input, it is passed as function argument. 
		 * Print output and don't return it. 
		 * Taking input is handled automatically. 
		 */
        
        int n= input.length;
        
        String output = "" ;
        
        boolean flag= false;
        
        for(int i=0; i<n-1; i++){
        	
            for(int j = i+1; j<n; j++){
                if(input[i] < input[j]){
                    flag = false;
                    break;
                }else{
                    flag = true;
                }
                
                
            }
            
            if(flag == true){
            	output += input[i] + " ";   
            }
             
        }
        System.out.println(output + input[n-1]);
		
	}


}
