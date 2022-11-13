/**
 * 
 */
package Recursion;

/**
 * @author Pankaj Rai
 *
 */
public class GeometricSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println(findGeometricSum(3));

	}
	
	public static double findGeometricSum(int k){
		if(k <= 0){
            return 1;
        }
        
        double smallAns = findGeometricSum(k-1);
        
        double ans = smallAns + (1/Math.pow(2, k));
        
        return ans;
	}

}
