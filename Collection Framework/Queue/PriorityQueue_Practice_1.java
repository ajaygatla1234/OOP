package queue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueue_Practice_1 {

	public static void main(String[] args) {

		///*Priority Queue*///

		Queue<Integer> pq = new PriorityQueue<Integer>();
		//It creates array with size 11

		//Adding Elements
		pq.offer(8);  //or pq.add(1); - Internally add() calls offer() method. 
		pq.add(2);
		pq.offer(5);
		pq.add(7);
		pq.add(1);
//		pq.add(null); gives NullPointerException,  we cannot have Null values

		System.out.println(pq);
		System.out.println(pq.size());

		/*
		 * 
		 * 
		 Note: The printed output reflects the heap's internal arrangement rather than the priority order.
		 By default PriorityQueue follows Ascending Order by making lowest integer has Highest Priority.

		 After adding 8: [8]
		 After adding 2: [2, 8]
		 After adding 5: [2, 8, 5]  
		 After adding 7: [2, 7, 5, 8]        (Since 7 is less than 8, it swaps positions with 8 to maintain the heap property.)
		 After adding 1: [1, 2, 5, 8, 7]
		 Final PriorityQueue: [1, 2, 5, 8, 7]

		 (since it follows the binary heap, the display will be based on the Tree display. Refer the tree diagram below)

		 After adding 5:
		      2
		     / \
		    8   5


		 After adding 7:
		      2
			 / \
		    7   5
	       /
		  8


		 After adding 1:
		      1
             / \
            2   5
           / \
          8   7

		System.out.println(pq); -> [1, 2, 5, 8, 7]
		The output does not reflect any traversal but the internal arrangement of the heap.

		 */


		/*Retrieval*/
		//Note : we can Retrieve only head element
		System.out.println(pq.peek());  //returns only head element

		//we should not use for each loop in PriorityQueue, because it will display the o/p in internal arrangement of the heap but not in Priority order.
		//So avoid it, instead use while loop to get the output in priority order.
		System.out.print("for loop : ");
		for (Integer integer : pq) {
			System.out.print(integer+" ");
		}

		// Priority Order Output
		// The PriorityQueue only allows access to the head or root element, which is the highest-priority
		// element in the queue. There is no direct method to access or retrieve elements other than the
		// head element in priority order.
		//
		// Using the `poll()` method retrieves and removes the highest-priority element from the queue.
		// After removing the head, the next highest-priority element is repositioned at the head.

		//Disadvantage is that we will loose the Original Queue
		//So, you can create a copy of the PriorityQueue and then use a while loop to iterate through this copy. This way, the original queue remains unchanged.
		PriorityQueue<Integer> copyQueue = new PriorityQueue<>(pq);
		System.out.print("\nWhile loop : ");
		while(!copyQueue.isEmpty()) {
			System.out.print(copyQueue.poll()+" ");
		}

		System.out.println();

		/*Removal*/
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		pq.remove(7);
		System.out.println(pq);
		//pq.clear();


		/*Searching*/
		System.out.println(pq.contains(3));
		
		
		//Reversing the Priority Order//
		
		Queue<Integer> pq1 = new PriorityQueue<Integer>(Comparator.reverseOrder());
		//Default Array or Empty Array will have Ascending Order by Default
		
		
		pq1.offer(8);  
		pq1.add(2);
		pq1.offer(5);
		pq1.add(7);
		pq1.add(1);
		
		System.out.print("\nWhile loop : ");
		while(!pq1.isEmpty()) {
			System.out.print(pq1.poll()+" ");
		}
		System.out.println();
		
		
		/*Others*/

		//Using String Generic
		Queue<String> ps = new PriorityQueue<String>();
		
		ps.offer("Apple");
		ps.offer("Banana");
		ps.offer("Cherry");
		ps.offer("Aaabbb");
		
		//Here priority is based on the lexicographical (alphabetical) order of the entire string, not just the first letter. 
		
		System.out.println(ps);
		
		while (!ps.isEmpty()) {
			System.out.print(ps.poll()+" ");
		}
		
		
		
	}

}
