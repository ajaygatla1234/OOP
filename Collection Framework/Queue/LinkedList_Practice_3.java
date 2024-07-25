package queue;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedList_Practice_3 {
	
public static void main(String[] args) {
		
		LinkedList<String> ad= new LinkedList<String>();
		
		
		//Adding
		
		ad.add("Banana");   //calls offer() by default
		ad.offerFirst("Cherry");  //calls addFirst();
		ad.offerLast("Apple");    //calls addLast();
		ad.offerFirst("Kiwi");
		ad.offer("Pear");  //calls offerLast() by default
		ad.offerLast("Mango");
		
		ad.offer(null);
		
		
		System.out.println(ad);
		
		
		
		//Retrieval
		System.out.println(ad.peek()); //calls peekFirst() by default
		System.out.println(ad.peekFirst());
		System.out.println(ad.peekLast());
		
		
		//Removal
		System.out.println(ad.poll());
		System.out.println(ad.pollFirst());
		System.out.println(ad.pollLast());
		System.out.println(ad.remove());
		System.out.println(ad.removeFirst());
		System.out.println(ad.removeLast());
		
		System.out.println(ad);
		
		
		//others//
		
		System.out.println(ad.size());
		
		Collections.synchronizedList(ad);
		
	}

}
