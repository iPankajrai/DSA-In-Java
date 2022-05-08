/**
 * 
 */
package ClassAndObjectBasics;

/**
 * @author Pankaj Rai
 *
 */
public class Fraction {
	
	private int numerator;
	private int denominator;
	
	//constructor
	public Fraction(int num, int den) {
		this.numerator = num;
		if(den == 0) {
			//TODO error out
			
		}
		
		this.denominator = den;
		this.simplify();
		
	}
	
	//getter for numerator and denominator
	public int getDenominator() {
		return denominator;
	}
	public int getNumerator() {
		return numerator;
	}
	
	//setter for numerator and denominator
	public void setNumerator(int n) {
		this.numerator = n;
		this.simplify();
	}
	public void setDenominator(int d) {
		if(d == 0) {
			//TODO error out
			return;
		}
		this.denominator = d;
		this.simplify();
	}
	
	public void print() {
		if(this.denominator == 1) {
			System.out.println(this.numerator);
		}else {
			System.out.println(this.numerator + "/" + this.denominator);
		}
	}
	
	private void simplify() {
		int gcd =1;
		
		int smaller = Math.min(this.numerator, this.denominator);
		
		for(int i=2; i< smaller; i++) {
			if((this.numerator%i == 0) && (this.denominator%i == 0)) {
				gcd = i;
			}
		}
		
		this.numerator /=gcd;
		this.denominator /= gcd;
	}
	
	public void add(Fraction f2) {
		this.numerator = this.numerator*f2.denominator + this.denominator*f2.numerator;
		this.denominator = this.denominator*f2.denominator;
		simplify();
	}
	
	public void multiply(Fraction f2) {
		this.numerator = this.numerator*f2.numerator;
		this.denominator = this.denominator*f2.denominator;
		simplify();
	}
	
	public static Fraction add(Fraction f1, Fraction f2) {
		
		int newNum = f1.numerator*f2.denominator + f1.denominator*f2.numerator;
		int newDen = f1.denominator*f2.denominator;
		
		Fraction f = new Fraction(newNum, newDen);
		return f;
	}	

}
