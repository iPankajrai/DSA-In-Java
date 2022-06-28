/**
 * 
 */
package ClassAndObjectBasics;

/**
 * @author Pankaj Rai
 * @date: 08 May 2022
 *
 */
public class Polynomial {

	/**
	 * data member: private DynamicArray coefficients
	 * functions: setCoefficient(int degree, int coeff), add(Polynomial p2), subtract(Polynomial p2), multiply(Polynomial p2), getter and setter
	 */
	
	/* This function sets coefficient for a particular degree value, if degree is not there in the polynomial
	 *  then corresponding term(with specified degree and value is added int the polynomial. If the degree
	 *  is already present in the polynomial then previous coefficient is replaced by
	 *  new coefficient value passed as function argument
	*/
    private DynamicArray coefficients;
    
    public Polynomial() {
		// need to initialize polynomial with 0 => coefficients = 0, for all degrees
		coefficients = new DynamicArray();	
	}
    
	public void setCoefficient(int degree, int coeff){
		coefficients.set(degree, coeff);
		
	}
	
	// Prints all the terms(only terms with non zero coefficients are to be printed) in increasing order of degree. 
	public void print(){
        for(int i=0; i<coefficients.size(); i++){
            System.out.print(coefficients.get(i) + "x" + i + " ");
        }
        System.out.println();
	}

	
	// Adds two polynomials and returns a new polynomial which has result
	public Polynomial add(Polynomial p){
		Polynomial newPoly = new Polynomial();
        //find max degree (or max of size of both the polynomials)
        //iterate over length of maxDegree
        //add coeff of same degrees and store into the coeff of newly created polynomial
        //return new polynomial
        for(int i=0; i<(Math.max(p.coefficients.size(),this.coefficients.size())); i++){
            int newCoeffAtDegreeI = this.coefficients.get(i) + p.coefficients.get(i); 
            newPoly.coefficients.set(i, newCoeffAtDegreeI);
        }
        return newPoly;
		
	}
	
	// Subtracts two polynomials and returns a new polynomial which has result
	public Polynomial subtract(Polynomial p){
        Polynomial newPoly = new Polynomial();
        for(int i=0; i<(Math.max(p.coefficients.size(),this.coefficients.size())); i++){
            int newCoeffAtDegreeI = this.coefficients.get(i) - p.coefficients.get(i); 
            newPoly.coefficients.set(i, newCoeffAtDegreeI);
        }
        return newPoly;
	}
	
	// Multiply two polynomials and returns a new polynomial which has result
	public Polynomial multiply(Polynomial p){
		Polynomial newPoly = new Polynomial();
        for(int i=0; i<this.coefficients.size(); i++){
            for(int j=0; j<p.coefficients.size(); j++){
             int newCoeffAtDegreeK = this.coefficients.get(i) * p.coefficients.get(j);
             int newDegK = i+j;
             newPoly.coefficients.set(newDegK, newCoeffAtDegreeK);    
            }
        }
        return newPoly;
	}


}
