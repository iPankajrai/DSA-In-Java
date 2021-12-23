package ArithmaticOps;
import java.util.*;

public class FindCharCase {

	public static void main(String[] args) {
		findCharCase();

	}
	
	public static void findCharCase() {
		Scanner s = new Scanner(System.in);
        
        String str = s.next();
        
        char ch = str.charAt(0);
        
        //ascii of cap alphabet: 65 to 91
        //ascii of small alphabet: 97 to 122
        
//        if((c == 'a') || (c == 'b') || (c == 'c') || (c == 'd') || (c == 'e') || (c == 'f') || (c == 'g') || (c == 'h') || (c == 'i') || (c == 'j') || (c == 'k') || (c == 'l') || (c == 'm') || (c == 'n') || (c == 'o') || (c == 'p') || (c == 'q') || (c == 'r') || (c == 's') || (c == 't') || (c == 'u') || (c == 'v') || (c == 'w') || (c == 'x') || (c == 'y') || (c == 'z')){
//            System.out.println(0);
//        }else if((c == 'A') || (c == 'B') || (c == 'C') || (c == 'D') || (c == 'E') || (c == 'F') || (c == 'G') || (c == 'H') || (c == 'I') || (c == 'J') || (c == 'K') || (c == 'L') || (c == 'M') || (c == 'N') || (c == 'O') || (c == 'P') || (c == 'Q') || (c == 'R') || (c == 'S') || (c == 'T') || (c == 'U') || (c == 'V') || (c == 'W') || (c == 'X') || (c == 'Y') || (c == 'Z')){
//            System.out.println(1);
//        }else{
//            System.out.println(-1);
//        }
        
        if (ch >= 'A' && ch <= 'Z')
            System.out.println("\n" + ch +
                    " is an UpperCase character");
     
        else if (ch >= 'a' && ch <= 'z')
            System.out.println("\n" + ch +
                    " is an LowerCase character" );
     
        else
            System.out.println("\n" + ch +
                    " is not an aplhabetic character" );
        
        s.close();

	}

}
