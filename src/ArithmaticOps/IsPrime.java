package ArithmaticOps;

import java.util.*;

public class IsPrime {

	public static void main(String[] args) {
//		isPrime();
//		isPrime2();

	}
	
	public static void isPrime() {
		Scanner s =new Scanner(System.in);
		
		int n = s.nextInt();
		
		int d =2;
		
		while(d <= (n/2)) {
			if(n%d ==0) {
				System.out.println(n + " is Not Prime");
				return;		//return MATLAB main khatm
			}
			d++;
		}
		System.out.println(n + " is Prime");
		s.close();
	}
	
	public static void isPrime2() {
		Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    boolean isprime=true;
	    
	    if(n !=2 && n%2==0)
	        isprime=false;
	    int i=3;
	    while(isprime&&i<=n/2){
	        isprime=!(n%i==0);
	        i+=2;
	    }
	    if(isprime){
	        System.out.println("Prime");
	    }
	    else{
	        System.out.println("Composite");
	    }
	    
	    s.close();
	}
	
}
