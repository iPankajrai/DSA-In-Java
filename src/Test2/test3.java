package Test2;

public class test3 {

	public static void main(String[] args) {
		// input "abc"
		//outcome => pnc(abc)
		//return set of strings (array of strings)
		
		String[] out = pnc("123");
		
		for(int i=0; i<out.length; i++ ) {
			if(out[i] != null) {
				System.out.println(out[i]);
			}
			
		}
	}
	
	public static String[] pnc(String inp_str) {
		
		int len = inp_str.length();
		//System.out.println(factorial(len));
		
		String[] str = new String[factorial(len)];
		
		for(int i=0; i< len; i++) {
			// System.out.print(inp_str.charAt(i));
			String s = "";
			for(int j=i; j<len; j++) {
				s = s+ inp_str.charAt(j);
				
			}
			if(s.length() != len) {
				for(int c =0 ; c < i; c++) {
					s = s + inp_str.charAt(c);
				}
				
			}
			
			
			for(int k=0; k<len; k++) {
				if(str[k] != s) {
					str[i] = s;
				}
			}
			
		}
		
		
		return str;
	}
	
	public static int factorial(int n) {
		int fact =1;
		if(n == 1) {
			return 1;
		}else {
			for(int i=2; i<=n; i++) {
				fact *= i;
			}
		}
		
		return fact;
	}
}
