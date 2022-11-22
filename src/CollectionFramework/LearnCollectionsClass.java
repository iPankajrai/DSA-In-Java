/**
 * 
 */
package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author Pankaj Rai
 *
 */
public class LearnCollectionsClass {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		list.add(23);
		list.add(24);
		list.add(234);
		list.add(123);
		list.add(203);
		list.add(9);
		list.add(9);
		
		System.out.println(list);
		
		System.out.println("Min element: " + Collections.min(list));
		System.out.println("Max element: " + Collections.max(list));
		System.out.println("frequency of element 9 is: " + Collections.frequency(list,9));
		
		// Collections.sort(list, Comparator.reverseOrder());
		
		/*
		 * Collections.sort(list, new Comparator<Student>() {
		 * 
		 * @Override public int compare(Student o1, Student o2) { return
		 * o1.name.compareTo(o2.name); } });
		 */
		
		System.out.println(list);
		
		
		List<Student> studSet = new ArrayList<>();
		studSet.add(new Student("Pankaj", 1));
		studSet.add(new Student("Pankaj2", 2));
		studSet.add(new Student("Pankaj3", 3));
		studSet.add(new Student("Pankaj4", 1));
		
		System.out.println("Before Sorting: " + studSet);
		Collections.sort(studSet);
		System.out.println("After sorting: " +studSet);

	}

}
