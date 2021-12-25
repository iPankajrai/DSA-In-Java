/**
 * 
 */
package TwoDArrays;

/**
 * @author Pankaj Rai
 * @date 26 Dec 2021
 *
 */
public class SumOfBoundariesAndDiagnols {

	
	public static void main(String[] args) {
		
		int[][] mat = {{1,2,3,4,5,6}, {1,2,3,4,5,6}, {1,2,3,4,5,6}, {1,2,3,4,5,6}, {1,2,3,4,5,6}, {1,2,3,4,5,6}};
		
		int sum = totalSum(mat);
		System.out.println(sum);
	}
	
	/**
	 * @param args n*n matrix
	 * @return total sum of boundaries elements and both diagnol elements and no elements should be added twice
	 */
	
	public static int totalSum(int[][] mat) {
        /*
        	1. Main diagnol (i=j)
            2. Other diagnol (i+j=n-1)
            3. First and last row (i=0 and i = n-1)
            4. First and last column (j=0 and j=n-1)
            5. sum = point1 + point2 + point3 + point4
            6. sum - 2*corner_elements((0,0),(0,n-1),(n-1,0),(n-1,n-1))
            7. if(n%2 !=0){ sum - element_at(i==j and i+j==n-1) }
        
        */
        int sum =0;
        int n = mat.length;	//n*n matrix
        if(n ==0){
            sum = 0;
        }
        else if(n ==1){
            sum =mat[0][0];
        }
        else{
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    if(i == j){					//1
                        sum += mat[i][j];
                    }
                    if(i+j == n-1){				//2
                        sum += mat[i][j];
                    }
                    if( (i==0) || (i==n-1)){	//3
                        sum += mat[i][j];
                    }
                    if( (j==0) || (j==n -1)){	//4
                        sum += mat[i][j];
                    }

                    if(n%2 !=0){
                        if(i==j && i+j == n-1){
                            sum -= mat[i][j];
                        }
                    }

                }
            }
            //remove corner elements from sum (because added thrice)
            sum -= 2*(mat[0][0] + mat[0][n-1] + mat[n-1][n-1] + mat[n-1][0]);
        }
		//System.out.println(sum);
        return sum;
	}


}
