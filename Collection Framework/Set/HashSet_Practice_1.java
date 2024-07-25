package set;

import java.util.HashSet;

public class HashSet_Practice_1 {
	
	public static void main(String[] args) {
		
		HashSet<Integer> hs = new HashSet<Integer>();
		//HashSet internal Implementation is HashMap -> Array of nodes(key,value)
		//Insertion order is not maintained
		hs.add(10);
		hs.add(2);
		hs.add(85);
		hs.add(65);
		hs.add(5);
		hs.add(null);
		
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
		
		
		//There will be no updating
		
	}

}
