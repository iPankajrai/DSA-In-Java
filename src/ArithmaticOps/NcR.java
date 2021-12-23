package ArithmaticOps;
import java.util.*;

public class NcR {

	public static void main(String[] args) {
		
		/*
		 * nCr = n!/(r!*(n-r)!)
		 */
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int r = s.nextInt();
		
		int ans = (factorial(n)/factorial(r))*(1/factorial(n-r));
		System.out.println(ans);
		
		boolean b = isPrime(n);
		System.out.println(b);
		
		System.out.println(custom_ncr(n,r));
		
	}
	
	public static int custom_ncr(int n, int r) {
		if(n<r) {
			return -1;
		}
		if((n==1 && r ==1) || (n==1 && r ==0) || (n==0 && r==1) || (n ==0 && r==0)) {
			return 1;
		}
		int factn=1, factr=1, factnr = 1;
		for(int i =2; i<=n; i++) {
			factn *= i;
			
			if(i<=r) {
				factr *= i; 
			}
			if(i<=n-r) {
				factnr *= i;
			}
		}
		int ncr = (factn/factr)*(1/(factnr));
		return ncr;
	}
	
	public static boolean isPrime(int n) {
		if(n == 1) {
			return false;
		}
		if(n%2 == 0) {
			return false;
		}
		for(int i =3; i<=n/2; i=i+2) {
			if(n%i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static int factorial(int n) {
		if(n == 0) {
			return 1;
		}
		int fact =1;
		for(int i=1; i<=n; i++) {
			fact *=i;  
		}
		return fact;
	}
	

}
