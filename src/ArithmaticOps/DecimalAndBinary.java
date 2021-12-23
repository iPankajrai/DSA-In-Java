package ArithmaticOps;
import java.util.*;

public class DecimalAndBinary {

	public static void main(String[] args) {
		
		//System.out.println(5.5 + "a" + 5);
		//binaryToDecimal(100);
		//reverseInt(6);
		//hammingWeight(11);
		//digitsOfInt(234);
		//isPrime(13);
		fibonacci(6);
		//postPreIncDec();
		//bitwiseOp();

	}
	
//	power(a,b)
	
//	sqrt(int x) 
	
//	Decimal to binary
	
//	Binary to decimal
	
//	Number Compliment
	
//	Compliment of base 10 integer
	
//	Decimal to Binary
	public static int binaryToDecimal(int n) {
		/*
		 * n(binary number: 101101) is in integer format
		 */
		
		int decimal =0;
		int i =0;
		while(n != 0) {
			int digit = n % 10;
			
			if(digit ==1) {
				decimal = (int) (decimal + Math.pow(2, i));
			}
			n= n/10;
			i++;
		}
		
		System.out.print(decimal);
		return decimal;
	}
	
//	reverse integer or decimal to binary
	public static int reverseInt(int n) {
		/*
		 * Decimal to Binary
		 */
		int ans =0;
		int i=0;	//will be used for same order
		while(n !=0) {
			int bit = (n&1);
			//ans = (int) ((bit * Math.pow(10, i)) + ans);	//for decimal to binary 
			ans = (ans*10) + bit ;		//For reverse
			n = n>>1;
			i++;
		}
		
		System.out.println(ans);
		return ans;
	}
	
	public static int hammingWeight(int n) {
		/*
		 * Returns number of 1 bits in given integer n
		 */
		
		int count =0;
		
		//checking last bit
		while(n != 0) {
			if((n&1) == 1 ? true : false) {
				count++;
			}
			n = n>>1;
		}
		System.out.print(count);
		return count;
	}
	
	public static void digitsOfInt(int n) {
		int prod =1;
		int sum =0;
		
		while(n !=0) {
			int digit = n%10;
			prod = prod*digit;
			sum = sum + digit;
			
			n = n/10;
		}
		
		System.out.println("prod-sum= " + (prod-sum));
	}
	
	public static void isPrime(int n) {
		boolean isPrime = true;
		
		for(int var =2; var<(n/2); var++) {
			if(n%var == 0) {
				isPrime = false;
				break;
			}
		}
		
		if(isPrime) {
			System.out.println(n + " is Prime Number.");
		}else {
			System.out.println(n + " is not a Prime Number.");
		}
		
	}
	
	public static void fibonacci(int n) {
		int num1 =0, num2= 1;
		System.out.print(num1 + " " + num2);
		for (int var = 1; var<=n-2; var++) {
			int nextNumber = num1 + num2;
			num1 = num2;
			num2 = nextNumber;
			System.out.print( " " + nextNumber + " ");
		}
	}
	
	public static void postPreIncDec() {
		int i =5;
		
		System.out.println(i++);
		//print =5, i = 6
		System.out.println(++i);
		//print =7, i = 7
		System.out.println(i--);
		//print =7, i = 6
		System.out.println(--i);
		//print =5, i = 5
	}
	
	public static void bitwiseOp() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter integer a = ");
		int a = scan.nextInt();
		System.out.print("Please enter integer b = ");
		int b = scan.nextInt();
		
		System.out.println("a&b= " + (a&b));
		System.out.println("a|b= " + (a|b));
		System.out.println("a^b= " + (a^b));
		System.out.println("~a= " + (~a));
		
		scan.close();
	}


}
