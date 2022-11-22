/**
 * 
 */
package CollectionFramework;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author Pankaj Rai
 * 
 *         HashMap : keys will be unique and Value will be overrided
 *         LinkedhashMap : Sorted based on values
 *         Treemap : Sorted based on Keys
 *
 */
public class LearnMap {

	public static void main(String[] args) {
		// Map<String, Integer> numbers = new HashMap<>();
		// Map<String, Integer> numbers = new LinkedHashMap<>();
		Map<String, Integer> numbers = new TreeMap<>();

		numbers.put("One", 1);
		numbers.put("Two", 2);
		numbers.put("Three", 3);
		numbers.put("Four", 4);
		numbers.put("five", 4);
		
		numbers.remove("Three");
		/*
		 * if(!numbers.containsKey("Two")) { numbers.put("Two", 23); }
		 */

		numbers.putIfAbsent("Two", 23);

		System.out.println(numbers);

		System.out.println(numbers.containsKey("One"));
		System.out.println(numbers.containsValue(1));

		System.out.println(numbers.get("Three"));

		// Foreach loop
		for (Map.Entry<String, Integer> e : numbers.entrySet()) {
			System.out.println("key Value Both: " + e);
  			// System.out.println("Key only: " + e.getKey()); 
  			// System.out.println("value only: " + e.getValue());
		}
		
		// key set
		for(String key : numbers.keySet()) {
			System.out.println("keys only from key set: " + key);
		}
		
		// value set
		for(Integer value : numbers.values()) {
			System.out.println("Values only from value set: " + value);
		}
		
		

		// for (int i = 0; i < numbers.size(); i++) {
		//	System.out.println(numbers.containsValue(i));
		//  System.out.println(numbers.containskey("One"));
		// }
		
		System.out.println(numbers.isEmpty());
		
		numbers.clear();

	}

}
