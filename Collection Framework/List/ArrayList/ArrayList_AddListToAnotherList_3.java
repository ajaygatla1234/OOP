package com.gl.arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ArrayList_AddListToAnotherList_3 {
	
	public static void main(String[] args) {
		
		Collection<String> names=new ArrayList<String>();
		
		names.add("Navin");
		names.add("Prashanth");
		
		//we can also add, predefined list to the new array
		ArrayList<String> names1=new ArrayList<String>(names); 
		
		System.out.println(names1); //gives output instead of reference, because String class toString() is overridden.
		
		//otherwise use, for loop or iterator
		System.out.println("\nFor Loop");
		for(String s:names1) {
			System.out.println(s);
		}
	
		System.out.println("\nIterator");
		Iterator<String> namesIter=names.iterator();
		while(namesIter.hasNext()) {
			System.out.println(namesIter.next());
		}
		
		//we can also add the new list to existing list
		ArrayList<String> names2=new ArrayList<String>();
		names2.add("Subbu");
		names2.add("Jaggu");
		
		System.out.println("\nBefore adding");
		System.out.println(names2);
		
		//adding names1 to names2
		System.out.println("\nAfter adding");
		names2.addAll(names1);
		System.out.println(names2);
		
		System.out.println("\nAdding at specific index");
		names2.add(0, "Rakesh");
		names2.add(2, "Rakesh");  //we can also add duplicate values
		System.out.println(names2);
		
		//we can also add new list from the specific index
		names2.addAll(2, names1);
		System.out.println(names2);
		
		//we can also add same list to the same existing list
		names2.addAll(2, names2);
		System.out.println(names2);
		System.out.println(names2.size());
		
		//for the above arrays size is not defined, and it can be increased automatically without any limit.
		//but we can also specify the size
		//So, while you specified an initial capacity of 2, it doesn't restrict you from adding more than two elements. 
		//It simply optimizes memory allocation to start with space for 2 elements, but the ArrayList can grow beyond that initial capacity as needed.
		
		/* use of declaring size:
		 * generally ArrayList follows dynamic arrays implementation.
		 * If the size reaches capacity, it will double the capacity.
		 * so if we give size limit, it will not divide until it reaches the given size.
		 * this helps in performance and memory optimization. if you could provide the required size.
		 */
		ArrayList<String> names3=new ArrayList<String>(2);
		names3.add("Subbu");
		names3.add("Jaggu");
		names3.add("Subbu");
		names3.add("Jaggu");
		System.out.println(names3);
		
		System.out.println("\nList cleared");
		names2.clear();
		System.out.println(names2);
		
		System.out.println("\nGetting the index of the object");
		System.out.println("Subbu : "+names3.indexOf("Subbu"));
		System.out.println("iuyuy : "+names3.indexOf("iuyuy")); //gives -1, if not present in the list
		
		System.out.println("Last indexi of Subbu : "+names3.lastIndexOf("Subbu"));//since it will have duplicates, we can get last index
		
		
		System.out.println("is names2 list Empty : "+names2.isEmpty());  //false because we already cleared it.
		System.out.println("is names3 list Empty : "+names3.isEmpty());  
		
		System.out.println("\nRemoving Subbu");
		names3.remove("Subbu");  //only first occurrence will gets deleted, To delete all the duplicate values, the we need to use HashSet. or else we can use Set to avoid duplicates
		System.out.println(names3);  
		
		System.out.println("\nUpdating values of Subbu to Subramanyam ");
		System.out.println(names3.set(1, "Subramanyam")); //it can return the old value
		System.out.println(names3);
		
		//explore more methods
		System.out.println("\nexplore more methods");


		ArrayList<int[]> al1 = new ArrayList<>();
       		int[] arr = {1, 2, 3};
         	al1.add(arr);

         	int[] searchArr = {1, 2, 3};

         	// Since contains() compares only references, it compares the searchArr address
	        // with addresses of elements present in the collection. Since both references are different, it gives false
	        System.out.println(al1.contains(searchArr)); // false
	
	        // This will print true because al1 contains the exact same reference as arr
	        System.out.println(al1.contains(arr)); // true
	}

}