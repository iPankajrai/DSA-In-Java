package ArithmaticOps;

import java.util.*;
public class ReverseInt {

	public static void main(String[] args) {
		System.out.print(reverseint(910002333));

	}
	
	public static int reverseint(int n) {
		if((Integer.toString(n)).length() == 1) {
			return n;
		}
		int rev =0 ;
		if((n > (Integer.MAX_VALUE)/10) || (n < (Integer.MIN_VALUE)/10)) {
			return 0;
		}
		while(n!=0) {
			int digit = n%10;
			rev = rev*10 + digit;
			n = n/10;
		}
		
		return rev;
	}

}
