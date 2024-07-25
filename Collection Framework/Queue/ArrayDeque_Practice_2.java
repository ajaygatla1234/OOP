package queue;

import java.util.ArrayDeque;
//import java.util.Deque;

public class ArrayDeque_Practice_2 {
	
	public static void main(String[] args) {
		
		ArrayDeque<String> ad= new ArrayDeque<String>();
		
		
		//Adding
		
		ad.add("Banana");   //calls offer() by default
		ad.offerFirst("Cherry");  //calls addFirst();
		ad.offerLast("Apple");    //calls addLast();
		ad.offerFirst("Kiwi");
		ad.offer("Pear");  //calls offerLast() by default
		ad.offerLast("Mango");
		
//		ad.add(null); gives NullPointerException,  we cannot have Null values
		
		
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
		
	}

	
}
