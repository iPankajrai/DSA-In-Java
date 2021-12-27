/* For a given two-dimensional integer array/list of size (N x M), print it in a spiral form. 
	 That is, you need to print in the order followed for every iteration:
	 a. First row(left to right)
	 b. Last column(top to bottom)
	 c. Last row(right to left)
	 d. First column(bottom to top)


	sample input1
	 1 2 3 4 
	 5 6 7 8 
	 9 10 11 12 
	 13 14 15 16
	output:
	 1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10 
*/
package TwoDArrays;

/**
 * @author Pankaj Rai
 * @date 28 Dec 2021
 *
 */
public class SpiralPrint {

	public static void main(String[] args) {
		int[][] mat = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
		
		spiralPrint(mat);

	}
	
	
	/**
	 * @param matrix (2d array)
	 * @return print elements in spiral pattern
	 */
	public static void spiralPrint(int matrix[][]){
		int rowCount = matrix.length;
	   
	   if((rowCount == 0)){
	       System.out.print("");
	   }else if((rowCount !=0 && (matrix[0].length ==0))){
	       System.out.print("");
	   }else{
	       int colCount = matrix[0].length;
	       int totalElements = rowCount*colCount;	//n*m  elements
	   
	       int count=0;
	
	       int cs = 0, ce = colCount - 1;	//column start(cs) and column end (ce)
	       int rs = 0, re = rowCount - 1;	//row start (rs) and row end (re)
	
	       while(count < totalElements){
	
	           //printFromLeftToRight();	//ce--
	           for(int i=cs; i<=ce; i++){
	               System.out.print(matrix[cs][i] + " ");
	           }
	           rs++;
	
	           //printFromUpToDown();	//re--
	           for(int j=rs; j<=re; j++){
	               System.out.print(matrix[j][ce] + " ");
	           }
	           ce--;
	
	           //printFromRightTOLeft();	//cs++
	           for(int k=ce; k>=cs; k--){
	               System.out.print(matrix[re][k] + " ");
	           }
	           re--;
	
	           //printFromDownTOUp();	//rs++
	           for(int l=re; l>=rs; l--){
	               System.out.print(matrix[l][cs] + " ");
	           }
	           cs++;
	
	           count++;
	           
	       }	//while end
	   }	//else end
	}	//function end

}
