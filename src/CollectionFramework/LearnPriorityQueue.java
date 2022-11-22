/**
 * 
 */
package CollectionFramework;


import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author Pankaj Rai
 * 
 * 	PRIORITY QUEUE using 
 *
 */
public class LearnPriorityQueue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Queue hi yha priorityQueue bhi implement kr rha h
		// By default MIN HEAP hota h
		//Comparator.reverseorder will change it to MAX HEAP
		Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
		
		pq.offer(88);
		pq.offer(10);
		pq.offer(99);
		pq.offer(30);
		pq.offer(40);

		System.out.println("priority Queue: " + pq);
		
		// poll returns the element with most priorty (least number in this case) from queue and delete that element from queue
		System.out.println("Poll element: " + pq.poll());
		System.out.println("priorty Queue: " + pq);
		
		// peek returns the head element from queue and does NOT delete from queue
		System.out.println("peek element: " + pq.peek());
		System.out.println("priority Queue: " + pq);

	}

}
