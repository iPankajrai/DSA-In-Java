package ArithmaticOps;

public class SwapWithoutThirdVariable {

	public static void main(String[] args) {
		int a =1, b =5;
		swap(a,b);
		
		System.out.println(a);
		System.out.println(b);

	}
	
	public static void swap(int a, int b) {
		//swap a= a+b; b = a-b; a = a-b;
		a = a+b;
		b = a-b;
		a = a-b;
	}

}
