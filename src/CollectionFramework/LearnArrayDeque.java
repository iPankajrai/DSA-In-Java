/**
 * 
 */
package CollectionFramework;

import java.util.ArrayDeque;

/**
 * @author Pankaj rai
 * 
 * Array Dequeue => Double Ended queue
 *
 */
public class LearnArrayDeque {

	public static void main(String[] args) {
		ArrayDeque<Integer> adq = new ArrayDeque<>();
		
		//Offer and OfferLast does the same.
		// Offer comes from queue interface
		adq.offer(12);
		adq.offerFirst(45);
		adq.offerLast(13);
		adq.offer(10);
		
		System.out.println(adq);
			
		// Similarly we can do for peek, peekfirst(), Poll() and pollLast()
		
		System.out.println(adq.peekFirst());
		System.out.println(adq.peekLast());
		System.out.println(adq.peek());
		
		System.out.println(adq);
		
		System.out.println(adq.pollFirst());
		System.out.println(adq.pollLast());
		System.out.println(adq.poll());
		
		System.out.println(adq);
		
		
		
	}

}
