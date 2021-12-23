package ArithmaticOps;
import java.util.*;

public class PrimeTillN {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
        int n = s.nextInt();
        for(int i =2; i <= n; i++ ){
        	if(isPrime(i)){
                System.out.println(i);
            } 
        }
        s.close();

	}
	
	static boolean isPrime(int n){
        if(n == 2){
            return true;
        }
        if(n%2 == 0){
            return false;
        }
        int i =3;
        while(i <= (n/2)){
            if((n%i) == 0){
                return false;
            }
            i +=2;
        }
        return true;
    }

}
