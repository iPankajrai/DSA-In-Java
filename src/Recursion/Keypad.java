/**
 * 
 */
package Recursion;

/**
 * @author Pankaj Rai
 *
 */
public class Keypad {
	public static void main(String[] args) {
		

	}
	
	private static String[] helper(int dig){
		String[] out = {};
		switch(dig){
			case 1:
				out = {""}; 
				break;
			case 2:
				out = {"a", "b", "c"};	
				break;
			case 3:
				out = {"d", "e", "f"};
				break;
			case 4:
				out = {"g", "h", "i"};
				break;
			case 5:
				out = {"j", "k", "l"};
				break;
			case 6:
				out = {"m", "n", "k"};	
				break;
			case 7:
				out = {"o", "p", "q"};
				break;
			case 8:
				out = {"r", "s", "t"};	
				break;
			case 9:
				out = {"u", "v", "w"};
				break;
			case 0:
				out = {"x", "y", "z"};
				break;	
		}
		return out;

	} 
}
