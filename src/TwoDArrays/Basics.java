/**
 * 
 */
package TwoDArrays;

/**
 * @author Pankaj Rai
 *
 */
import java.util.Scanner;
public class Basics {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int arr2d[][] = new int[3][4];	//declaring 2d array for 3 rows and 4 columns
		
		int array2d[][] = {{1,2},{4,5},{7,9}}; //2 rows and 3 columns. first row = 1,2 and 3
		
		//System.out.println(arr2d.length);
		//System.out.println(arr2d[0].length);
		
		//printArray2d(takeInputForArr2d());
		
		//System.out.println(arr2d);	//arr2d stores reference of 2d array (address of master array) : [[I@6acbcfc0
		//System.out.println(arr2d[0]);	//arr2d[0] stores reference of array at 0 : [I@5f184fc6
		
		//int largeSum_col = largestColSum(array2d);
		//System.out.println("Largest Column sum is = " + largeSum_col);
		
		int arr[][]=new int[4][5];
	    for(int i=0;i<5;i++){	//row should be from 0 to 3 hence it will throw index out of bound exception
	        arr[i][0]=2;
	    }
	    System.out.print(arr[3][0]);
		
	}
	
	public static int[][] takeInputForArr2d() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of Rows ");
		int rows = scan.nextInt();
		System.out.println("Enter number of Columns ");
		int cols = scan.nextInt();
		
		int input[][] = new int[rows][cols];
		
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				System.out.println("Enter element at "+i+" row "+j+" column");
				input[i][j] = scan.nextInt();
			}
		}
		scan.close();
		return input;
	}

	public static void printArray2d(int[][] arr) {
		int rows = arr.length;
		int cols = arr[0].length;
		
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void rowWiseSum(int[][] mat) {
		//input: matrix or 2d array of size N*M
		//Return: Print sum of each row in a single line separated by space
		for(int i=0; i<mat.length; i++){
            int sumOfRow =0;
            for(int j =0; j<mat[0].length; j++){
                sumOfRow += mat[i][j];
            }
            System.out.print(sumOfRow + " ");
        }
	}
	
	public static int largestColSum(int[][] arr) {
		//Input: arr
		//return: largest of sum of columns
		
		int largest = Integer.MIN_VALUE;
		for(int j=0; j<arr[0].length; j++) {
			int sum =0;
			for(int i =0; i<arr.length; i++) {
				sum += arr[i][j]; 
			}
			if(sum>largest) {
				largest = sum;
			}
		}
		return largest;
	}
	
}


