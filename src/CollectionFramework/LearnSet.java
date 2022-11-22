/**
 * 
 */
package CollectionFramework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author Pankaj Rai
 * 
 * Set: It is used when we have to store UNIQUE elements in it
 * 		No order is defined in set
 * 		O(n)
 * 
 * LinkedHashSet : Maintains order
 * 					O(n)
 * 
 * TreeSet : stores set in Sorted Order
 *				It is based on the Binary search Tree implementation
 *				O(LogN)
 */
public class LearnSet {

	public static void main(String[] args) {
		// Set<Integer> set = new HashSet<>();
		
		// Set<Integer> set = new LinkedHashSet<>();
		
		/*
		 * Set<Integer> set = new TreeSet<>();
		 * 
		 * set.add(2); set.add(20); set.add(32); set.add(52); set.add(52);
		 * 
		 * System.out.println(set);
		 * 
		 * set.remove(52);
		 * 
		 * System.out.println(set);
		 * 
		 * System.out.println(set.contains(2));
		 * 
		 * System.out.println(set.isEmpty());
		 * 
		 * System.out.println(set.size());
		 * 
		 * set.clear();
		 */
		
		Set<Student> studSet = new HashSet<>();
		
		studSet.add(new Student("Pankaj", 1));
		
		studSet.add(new Student("Pankaj2", 2));
		
		studSet.add(new Student("Pankaj3", 3));
		
		studSet.add(new Student("Pankaj4", 1));
		
		System.out.println(studSet);
		
		
		
	}

}
