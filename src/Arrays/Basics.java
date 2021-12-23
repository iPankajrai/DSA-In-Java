package Arrays;

import java.util.*;
import java.io.*;

public class Basics {

	public static void main(String[] args) {
		//basics();
		//takeArrayInput();
	}
	
	public static void basics() {
		int[] arr = new int[10];
		arr[0] = 1;
		arr[1] = 3;
		System.out.println(arr[5]);		//prints 0
		System.out.println(arr);		//will print garbage
		System.out.println(Arrays.toString(arr));
		System.out.println(arr[0]);
		
		//char array
		char[] chArray = new char[11];
		chArray[1] = 'a';
		System.out.println(chArray[0]);	//prints null ('')
		System.out.println(chArray[1]);
		
		//double array
		double[] dArray = new double[10];
		dArray[2] = 1.23;
		System.out.println(dArray[0]);	//prints 0.0
		System.out.println(dArray[2]);
	}

	public static int[] takeArrayInput() {
		Scanner s = new Scanner(System.in);
		System.out.print("Please enter size of array");
		int size = s.nextInt();
		int[] intArr = new int[size];
		for(int i =0; i<size; i++) {
			System.out.println("Please enter the integer " + (i+1));
			intArr[i] = s.nextInt();
		}
		return intArr;
	}
	
	public static void printArray(int[] arr) {
		int size = arr.length;
		for(int i=0; i<size; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static void incrementArray(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			arr[i]++;
		}
	}
}
