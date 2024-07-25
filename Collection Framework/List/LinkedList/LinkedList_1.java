package list;

import java.util.*;

public class LinkedList_1 {

	public static void main(String[] args) {


		//since LinkedList implements Deque, we can also write
		Deque<Integer> lL1=new LinkedList<Integer>();
		Queue<Integer> lL2=new LinkedList<Integer>();

		//Now we are seeing the LinkedList in List point of view
		//but there will be no difference, when we use Queue, other methods will also gets added thats it
		//Check it in Queue Folder

		//LinkedList cannot be created with an initial size since it grows dynamically as needed
		//we have to create either empty(0) or by passing any list
		List<String> lL=new LinkedList<String>();

		//we can see the first & last element, size, prev & next references by debugging
		lL.add("Y1");
		lL.add("Y2");
		lL.add(0,"Y0");   //adding head

		System.out.println(lL);  //Note: The output will be in array form, but it has no relation to arrays. It's just a representation.


		/*Adding Other List Collection to LinkedList*/

		ArrayList<String> al=new ArrayList<String>();
		al.add("2");
		al.add("1");

		lL.addAll(1,al);

		// Removing elements from the LinkedList
		// If elements are of type Integer and you call remove(2), it's interpreted as remove(Object o)
		// This removes the first occurrence of the object 2 from the list.
		lL.remove(1);
		//To explicitly remove the element at index 2, you need to cast the argument to int. 
		lL.remove((int)1);

		System.out.println(lL);

		System.out.println(lL.get(0));

		System.out.println(lL.contains("iy"));

		lL.set(0, "HYR");
		System.out.println(lL);

		//Since LinkedList is not Synchronized, we can make it Synchronized
		Collections.synchronizedList(lL);

		/*Some methods from Deque*/
		Deque<String> lL3=new LinkedList<String>();
		lL3.addFirst("1");
		lL3.addLast("2");
		lL3.add("Daizy");
		lL3.add("Daizy");
		lL3.add("Daizy");
		lL3.add("Daizy");

		System.out.println(lL3.getFirst());
		System.out.println(lL3.getLast());

		lL3.removeFirst();
		lL3.removeLast();
		lL3.removeFirstOccurrence("Daizy");
		lL3.removeLastOccurrence("Daizy");

		System.out.println(lL3);

	}

}
