package Patterns;

import java.util.*;

public class AllPatterns {

	public static void main(String[] args) {
//		dabangPattern();
//		spaceStarTri();
//		dcdbcdTriangle();
//		abccdetriangle();
//		abcdefTriangle();
//		abbcccTriangle();
//		diamondPattern();
//		halfDiamondNinjaSoln();
//		halfDiamondPattern();
//		oddSquarePattern();
	}
	
	public static void dabangPattern() {
		/*
		 * 1 2 3 4 5 5 4 3 2 1
		 * 1 2 3 4 * * 4 3 2 1
		 * 1 2 3 * * * * 3 2 1
		 * 1 2 * * * * * * 2 1
		 * 1 * * * * * * * * 1
		 * 
		 * scan n =5;
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Please enter n: ");
		int n = scan.nextInt();
		
		//leftmost triangle => 1st
		int row =1;
		while(row<=n) {
			int col = n;
			int val =1;
			while(col>=row) {
				System.out.print(val + " ");
				val++;
				col--;
			}
			
			int col2 = 0;
			while(col2<(2*row-2)) {
				System.out.print("* ");
				col2++;
			}
			
			int col3= n;
			int val2 = n-row+1;
			while(col3>=row) {
				System.out.print(val2 + " ");
				val2--;
				col3--;
			}
			
			System.out.println("");
			row++;
		}
		
		//last triangle => 3rd
		
		
		scan.close();
		
	}
	
	public static void spaceStarTri() {
		/*
		 *       *
		 *     * *
		 *   * * *
		 *   
		 *   
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter n ");
		int n = scan.nextInt();
		
		int row =1;
		while(row<=n) {
			int col = n;
			int col2 =1;
			while(col>=row) {
				System.out.print("  ");
				col--;
			}
			while(col2<=row) {
				System.out.print("* ");
				col2++;
			}
			row++;
			System.out.println("");
		}
		
		scan.close();
	}
	
	public static void dcdbcdTriangle() {
		/*
		 * D
		 * C D
		 * B C D
		 * A B C D
		 * 
		 * ELEMENT VALUE IS DECREASING ROW WISE AND INCREASING COLUMN WISE. HENCE ch = 'A' - row + col + (n-1) 
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.print("please enter n: ");
		
		int n = scan.nextInt();
		int row =1;
		while(row<=n) {
			int col =1;
			while(col<=row) {
				char ch = (char) ('A' - row + col + (n-1));
				System.out.print(ch + " ");
				col++;
			}
			System.out.println("");
			row++;
		}
		
		scan.close();
	}
	
	public static void abccdetriangle() {
		/*
		 * A
		 * B C
		 * C D E
		 * D E F G
		 * 
		 * for each row column will start from 1 and will go max till row count
		 * 
		 * for each element in row, as the elements vary with column and row as well, so definitely we will have row_count and col_count in char expression
		 * 
		 * row =1
		 * row<=n:
		 * 		col=1
		 * 		col<=row
		 * 			ch = 'A' + row + col - 2
		 * 			col++
		 * 		row++
		 * 		newline
		 * 			
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("please enter n: ");
		
		int n = scan.nextInt();
		int row =1;
		
		while(row<=n) {
			int col =1;
			while(col<=row) {
				char ch = (char) ('A' + row + col - 2);
				System.out.print(ch + " ");
				col++;
			}
			System.out.println("");
			row++;
		}
		
		scan.close();
	}
	
	public static void abcdefTriangle() {
		/*
		 * A
		 * B C
		 * D E F
		 */
		 Scanner scan = new Scanner(System.in);
		 
		 System.out.println("Please enter number of row 'n': ");
		 
		 int n = scan.nextInt();
		 int row = 1;
		 int count = 0;
		 while(row<=n) {
			 int col =1;
			 while(col<=row) {
				 char ch = (char) ('A' + count );
				 
				 System.out.print(ch + " ");
				 col++;
				 count++;
			 }
			 System.out.println("");
			 row++;
		 }
		 
		 scan.close();
	}
	
	public static void abbcccTriangle() {
		/*
		 * A
		 * B B
		 * C C C
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please Enter Number of Row 'n' below: ");
		int n = scan.nextInt();
		
		int row =1;
		while(row<=n) {
			int col =1;
			while(col<=row) {
				char ch = (char) ('A' + row - 1);
				System.out.print(ch + " ");
				
				col++;
			}
			System.out.println("");
			row++;
		}
		
		scan.close();
	}
	
	public static void diamondPattern() {
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        //upper pattern rows
        int i=1;
        int n1 = n-n/2;
        int n2 =n/2;
        while(i<=n1){
            int j=1;
            //print spaces
            while(j<=n1-i){
                System.out.print(" ");
                j++;
            }
            
//            //print pattern 2 (inverted triangle)
//			j =1;
//            while(j<=i){
//                System.out.print('*');
//                j++;
//            }
//            
//            //pattern3 (triangle)
//            j=1;
//            while(j<=i-1){
//                System.out.print('*');
//                j++;
//            }
            
            j =1;
            while(j<=(2*i)-1) {
            	System.out.print('*');
            	j++;
            }
            
            System.out.println();
            i++;
        }
        
        //lower pattern rows
    	i =1;
        while(i<=n2){
            //print spaces, columns count = i, print = " "
            int j =1;
            while(j<=i){
                System.out.print(" ");
                j++;
            }
            
            //print pattern 2, columns count in ith row = n-i+1, print = *
            j =1;
            while(j<=n2-i+1){
                System.out.print('*');
                j++;
            }
            
            //print next trianlge, columns count in ith row = n2-i
            j =1;
            while(j<=n2-i){
                System.out.print('*');
                j++;
            }
            System.out.println();
            i++;
            
        }
	}

	public static void halfDiamondNinjaSoln() {
		Scanner s =new Scanner(System.in);
        int n = s.nextInt();
        //int n2 = n-1;
        
        System.out.println('*');
        //first half
        int i =1;
        while(i<=n){
            int j =1;
            System.out.print('*');
            while(j<=i){
                System.out.print(j);
                j++;
            }
            
            j -=2;
            while(j >= 1) {
            	System.out.print(j);
            	j--;
            }
            System.out.println('*');
            i++;
        }
        
        //second half
        i=1;
        while(i<=n-1){
            int j =1;
            System.out.print('*');
            while(j <= n-i){
                System.out.print(j);
                j++;
            }
            
            j = j-2;
            while(j>=1) {
            	System.out.print(j);
            	j--;
            }
            
            System.out.println('*');
            i++;
        }   
        System.out.println('*');
        s.close();
	}

	public static void halfDiamondPattern() {
		Scanner s =new Scanner(System.in);
        int n = s.nextInt();
        int n2 = n-1;
        
        System.out.println('*');
        //first half
        int i =1;
        while(i<=n){
            //print triangle, coulmns count for ith row = 2*i-1, print = if(j<=i) ? j : i-1-counter
            int j =1;
            int x =0;
            System.out.print('*');
            while(j<=(2*i)-1){
                if(j<=i){
                    System.out.print(j);
                }else{
                    System.out.print(i-1-x);
                    x++;
                }
                j++;
            }
            System.out.println('*');
            i++;
        }
        
        i=1;
        while(i<=n2){
            int j =1;
            //coulmn count in ith row = 2*n2 -2*i + 1,  print = (j<=n2-i+1) ? j : n-i -counter
            int count =1;
            System.out.print('*');
            while(j <= ((2*n2) - (2*i) +1)){
                if(j<= (n2-i+1)){
                    System.out.print(j);
                }else{
                    System.out.print(n-i-count);
                    count++;
                }
                j++;
            }
            System.out.println('*');
            i++;
        }
        
        System.out.println('*');

	}

	public static void oddSquarePattern() {
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i =1;
//        while(i<=n){
//            int j =1;
//            int count = 0;
//            while(j<=n-i+1){
//                System.out.print( (2*i -1 + count));
//                j++;
//                count += 2;
//            }
//            j =1;
//            while(j<=i-1){
//                System.out.print(2*j-1);
//                j++;
//            }
//            System.out.println();
//            i++;   
//        }
//        s.close();
        
        //ninja
        while(i<=n) {
        	int valueToPrint = (2*i) -1;
        	int j =1;
        	while(j<=n) {
        		System.out.print(valueToPrint);
        		valueToPrint +=2;
        		
        		if(valueToPrint > (2*n)-1) {
        			valueToPrint =1;
        		}
        		j++;
        	}
        	System.out.println();
        	i++;
        }

	}
	
}
