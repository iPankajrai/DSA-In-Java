package CollectionFramework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LearnPractise {

	public static void main(String[] args) {
		// Write a program to add elements to ArrayList
			ArrayList<Integer> al = new ArrayList<>();
			al.add(13);
			al.add(45);
			al.add(97);
			al.add(23);
			System.out.println(al);
		
		// Write a program to traverse (or iterate) ArrayList?
			for(int e: al) {
				System.out.println("Element from foreach: " + e);
			}
			for(int i=0; i<al.size(); i++) {
				System.out.println("Element from for loop: " + al.get(i));
			}
			
		// Write a program to iterate the HashMap ?
			Map<String, Integer> hm = new HashMap<>();
			hm.put("Pankaj", 25);
			hm.put("Shivam", 27);
			hm.putIfAbsent("Other", 23);
			System.out.println(hm);
			for(Map.Entry<String,Integer> e : hm.entrySet()) {
				System.out.println("hashmap key and Value both: " + e );
			}
			for(String key : hm.keySet()) {
				System.out.println("HashMap key: " + key);
			}
			for(Integer val : hm.values()) {
				System.out.println(val);
			}
			
		// Write a program to get size of HashMap?
			System.out.println(hm.size());
			
		// How to check if HashMap is empty?
			System.out.println(hm.isEmpty());
			hm.clear();
			System.out.println(hm.isEmpty());
			
		// Given an element write a program to check if element(value) exists in ArrayList?
			ArrayList<Integer> alcheck = new ArrayList<>();
			alcheck.add(3);
			alcheck.add(23);
			System.out.println("alcheck: " + alcheck);
			System.out.println(alcheck.contains(3));
			System.out.println(alcheck.contains(013));
			
		// When do you use Set, List, and Map in Java?
			// set : when elements to be stored needs to be unique and order doesn't matter
			// List: when elements can be of duplicate type and order may matter
			// Map : When we need to store elements of key value type
			
		// Core Spring Framework: 
			// @Autowired : ‘injecting beans'(Objects) at runtime by Spring Dependency Injection mechanism 
			// @Bean : 
			// @Component : default id(de capitalized) will be given to component class
		
	}

}
