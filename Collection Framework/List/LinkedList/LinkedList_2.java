package list;

import java.util.LinkedList;

public class LinkedList_2 {
	
	public static void main(String[] args) {
		
		LinkedList<String> names=new LinkedList<String>();
		
		names.add("Subbu");
		names.add("Jaggu");
		System.out.println(names);
		
		//we may use indexes for insertion, but internally traversal takes place to get the particular node position
		names.add(0, "Navin");
		System.out.println(names);
		
		LinkedList<String> names1=new LinkedList<String>();
		
		names1.addAll(names);
		System.out.println(names1);
		
		names1.addAll(3, names1);
		System.out.println(names1);
		
//		names1.addAll(34, names1);  //IndexOutOfBoundsException, if we try to add at index which exceed the size
		
		names1.addFirst("Rakesh");
		System.out.println(names1);
		
		names1.addLast("Vineeth");
		System.out.println(names1);
		
		//returns the head object
		System.out.println("\nHead Object : "+names1.element());
		System.out.println("Gets First(Head)Object : "+names1.getFirst());
		System.out.println("Gets First(Head)Object : "+names1.peek());
		System.out.println("Gets First(Head)Object : "+names1.peekFirst());
		System.out.println("Gets Last(Tail)Object : "+names1.getLast());
		System.out.println("Gets Last(Tail)Object : "+names1.peekLast());
		
		System.out.println("Returns object at specific position : "+names1.get(4));
		System.out.println("Give the index(position) of specific object : "+names1.indexOf("Rakesh"));  //gives the first occurrence of object
		System.out.println("Give the index(position) of specific object : "+names1.indexOf("uyu"));
		
		names1.addLast("Rakesh");
		System.out.println("\nRemoves head : "+names1.remove()); 
		System.out.println(names1);
		
		System.out.println("Size : "+names1.size());
		
		System.out.println("Removes particular object : "+names1.remove("Vineeth"));
		System.out.println(names1);
		
		names1.addFirst("Rakesh");
		System.out.println("Removes last Occurance of a given object"+names1.removeLastOccurrence("Rakesh"));
		System.out.println(names1);
		
		//explore more methods
		System.out.println("\nexplore more methods");
		
	}
}