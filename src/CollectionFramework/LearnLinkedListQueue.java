/**
 * 
 */
package CollectionFramework;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Pankaj Rai
 * 
 * QUEUE USING LINKEDLIST
 *
 */
public class LearnLinkedListQueue {

	public static void main(String[] args) {
		// Queue is a interface which is implemented by LinkedList
		Queue<Integer> q = new LinkedList<>();
		
		//To insert element into queue
		q.offer(10);
		q.offer(20);
		q.offer(30);
		q.offer(40);

		System.out.println("Queue: " + q);
		
		// poll returns the head element from queue and delete that element from queue
		System.out.println("Poll element: " + q.poll());
		System.out.println("Queue: " + q);
		
		// peek returns the head element from queue and does NOT delete from queue
		System.out.println("peek element: " + q.peek());
		System.out.println("Queue: " + q);
		
		
		
	}

}
