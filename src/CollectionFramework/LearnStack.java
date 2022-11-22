/**
 * 
 */
package CollectionFramework;

import java.util.Stack;

/**
 * @author Pankaj Rai
 * 
 * Stack is basically LIFO type of data structure
 *
 */
public class LearnStack {

	public static void main(String[] args) {
		Stack<String> animals = new Stack<>();
		
		animals.push("dog");
		animals.push("cat");
		animals.push("lion");
		
		System.out.println("Animals Stack" + animals);
		
		//peek
		System.out.println("topmost element: " + animals.peek());
		
		//to remove from stack
		animals.pop();
		
		System.out.println("Updated animals stack: " + animals);
		System.out.println("topmost element: " + animals.peek());
	}

}
