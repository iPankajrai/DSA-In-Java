package ArithmaticOps;

public class ISFibonacci {

	public static void main(String[] args) {
		System.out.println(isFibonacciNum(5));

	}
	
	static boolean isPerfectSquare(int x) {
		int s = (int) Math.sqrt(x);
		return (s*s == x);
	}
	
	static boolean isFibonacciNum(int n) {
		return (isPerfectSquare((5*n*n - 4)) || isPerfectSquare((5*n*n + 4)));
	}

}
