package set;

import java.util.TreeSet;

public class TreeSet_Practice_3 {

	public static void main(String[] args) {

		TreeSet<Integer> hs = new TreeSet<Integer>();
		//TreeSet internal implementation is TreeMap -> Binary Tree
		//Sorted order is Maintained
		hs.add(10);
		hs.add(2);
		hs.add(85);
		hs.add(65);
		hs.add(5);
//		hs.add(null);   //NullPointerException

		hs.add(5);  //it doesn't show compiler error, instead it will not add

		//since Hashing has both key,value pair, but here we are giving only keys but not values.
		//So what happens is, it will create some dummy object in place of value like : new Object();


		System.out.println(hs);

		//Retrieval//
		//we don't have index for Retrieving
		//use for each or iterator()

		for(Integer element:hs) {
			System.out.print(element+",");
		}

		System.out.println();


		//Removal//
		//we have to pass data not the index
		System.out.println(hs.remove(10)); //will give true & removes the data

		System.out.println(hs);

		//if we pass data that is not present
		System.out.println(hs.remove(67)); //it will give false


		//Search//

		System.out.println(hs.contains(5));


		//There will be no updating//
		
		//Additional Operations in TreeSet//
		
		System.out.println(hs.first());
		System.out.println(hs.last());
		System.out.println(hs.pollFirst());
		System.out.println(hs.pollLast());
		
		//Creating Sub sets
		
		//prints all the elements between the given Range
		//it is just a virtual set
		System.out.println(hs.subSet(4, 45));
		
		//if we perform any operation in Subsets, it will also reflect in Original set
		System.out.println(hs.subSet(4, 45).remove(5));
		System.out.println(hs);
		
		//reverse the order
		hs.add(56);
		hs.add(87);
		hs.add(8908);
		System.out.println(hs);
		System.out.println(hs.descendingSet());
		
	}

}
