/**
 * 
 */
package TwoDArrays;

/**
 * @author Pankaj Rai
 * @date 27 Dec 2021
 *
 */
public class PrintWave {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[][] arr = {{1,2,3,4,5,6}, {7,8,9,10,11,12}, {13,24,35,46,57,68}, {10,29,38,47,56,65}, {14,23,32,41,52,65}, {16,27,38,49,50,68}};
		wavePrint(arr);

	}
	
	public static void wavePrint(int mat[][]){
		int n = mat.length;		//row count
        // String wave = "";	//If I'm storing it into string and then returning then getting TLE
        
        if(n == 0){
            // wave ="";
            System.out.print("");
        }else if(n == 1 && mat[0].length == 1){
        	// wave += mat[0][0];
            System.out.println(mat[0][0]);
        }else{
            int m = mat[0].length;	//column count
            for(int i=0; i<m; i++){
                if((i&1) == 0){
                	for(int j=0; j<n; j++){
                    	// wave += mat[j][i] + " ";
                        System.out.print(mat[j][i] + " ");
                	}    
                }else{
                    for(int j=n-1; j>=0; j--){
                    	// wave += mat[j][i] + " ";
                        System.out.print(mat[j][i] + " ");
                	}
                }
            }
        }
        
        // System.out.println(wave);
	}
	
	/*
	 * custom test case

		1  2  3  4 
		5  6  7  8 
		9 10 11 12
		
		Sample Output 1:
		1 5 9 10 6 2 3 7 11 12 8 4
	 
	 */

}
