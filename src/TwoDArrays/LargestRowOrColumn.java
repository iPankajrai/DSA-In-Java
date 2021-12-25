/**
 * 
 */
package TwoDArrays;

/**
 * @author Pankaj Rai
 *
 */
public class LargestRowOrColumn {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[][] matrix = {{1,2,3},{4,5,6}};
		int largestOfMatrix = findLargest(matrix);
		System.out.println(largestOfMatrix);
	}
	
	public static int findLargest(int mat[][]){
		//Input: matrix
        //return: max of sumCol or sumRow
		 int largest = Integer.MIN_VALUE;
        if(mat.length == 0){
            System.out.println("row " + 0 + " "+ Integer.MIN_VALUE);
            largest = Integer.MIN_VALUE;
        }else{
            int rows = mat.length;
            int cols = mat[0].length;
            // int maxcol =Integer.MIN_VALUE, maxrow =Integer.MIN_VALUE;
            int index =0;
            boolean isRow = true;
            
            for(int i=0; i< rows; i++){
                int sumrow =0;
                for(int j =0; j<cols; j++){
                    sumrow += mat[i][j];
                }
                if(sumrow > largest){
                    largest = sumrow;
                    index = i;
                }
            }
            
            //to check for columns
            for(int i=0; i<cols; i++){
                int sumcol=0;
                for(int j=0; j<rows; j++){
                    sumcol += mat[j][i];
                }
                if(sumcol > largest){
                    largest = sumcol;
                    isRow = false;
                    index = i;
                }
            }

            if(isRow){
                System.out.println("row " + index + " "+ largest);
            }else{
                System.out.println("column " + index + " " + largest);
            }
        }
        return largest;
	}

}
