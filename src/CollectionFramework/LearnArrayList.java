package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LearnArrayList {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		
		al.add("Pankaj");
		al.add("k");
		System.out.print("Print from ArrayList: ");
		System.out.println(al);
		
		List<Integer> list = new ArrayList<>();
		
		list.add(1);
		list.add(4);
		list.add(-1);
		list.add(0);
		
		// To add element at specific index
		list.add(1,50);
		
		// To add another list inside a list	
		List<Integer> newList = new ArrayList<>();
		newList.add(13);
		newList.add(34);
		list.addAll(newList);
		
		// removing element from a particular index
		list.remove(0);
		
		// removing element of particluar value
		list.remove(Integer.valueOf(34));
		
		// Change value at a index
		list.set(0, -40);
		
		// list.clear();
		
		
		System.out.print("Printing from list: ");
		System.out.println(list);
		
		// To get element from index
		System.out.println(list.get(1));
		
		System.out.println(list.contains(-40));
		
		// To iterate
		for(int i=0; i<list.size(); i++) {
			System.out.println("the element at index "+ i +" is " + list.get(i));
		}
		// using foreach
		for(Integer ele:list) {
			System.out.println("foreach the element at index "+ "__" +" is " + ele);
		}
		//USING ITERATOR
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			System.out.println("Iterator: " + it.next());
		}
		
		

	}

}
