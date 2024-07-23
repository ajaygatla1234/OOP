package vector;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayList_HYR_1 {
	
	public static void main(String[] args) {
		
		
		/* Addition of elements */
		/*----------------------*/
		
		ArrayList<Integer> al1=new ArrayList<Integer>();
		//when we create ArrayList, it gets created with default capacity 0
		//After adding first element, it gets the initial size of 10
		//we can see that by debugging
		
		al1.add(2);
		al1.add(0,1);
		
		System.out.println(al1);
		System.out.println(al1.size());
		//In ArrayList, we don't have method to see capacity, but after adding first element it will become 10, we can see that by debugging
	
		al1.add(3);
		al1.add(4);
		al1.add(5);
		al1.add(6);
		al1.add(7);
		al1.add(8);
		al1.add(9);
		al1.add(10);  //After adding 10th element also, capacity will be 10
		
		al1.add(11);  //After adding 11th element, the capacity will be 15 (due to 50% increase of Array)
		              //If odd number comes, 15/2, then 7 indexes will be added
		
		Integer arr[] = new Integer[] {12,13,14};
		al1.addAll(Arrays.asList(arr));
		
		System.out.println(al1);
		
		
		
		/* Retrieval of elements */
		/*------------------------*/

		System.out.println(al1.get(0));
		
		for(int i=0;i<al1.size();i++) {
			System.out.print(al1.get(i)+" ");
		}
		
		for(Integer o:al1) {
			System.out.print(o+" ");
		}
		
		
		/* Removal of elements */
		/*--------------------*/
		
		al1.remove(0); //using index
//		al1.remove(11); //using direct object
//		al1.removeAll(al1);  //used for removing elements of one collection present in other collection 
//		al1.clear();
		System.out.println("\nEmpty al1 : "+al1);
		
		
		
		/* Searching of elements */
		/*--------------------*/
		
		System.out.println(al1.contains(13));
		//System.out.println(al1.contains(arr));  we cannot pass direct array for searching
		System.out.println(al1.containsAll(Arrays.asList(arr)));   //Array should be converted to list
		
		
		/* Updating elements */
		/*--------------------*/
		al1.set(1,13);
		System.out.println(al1);
		
		
		
		/* Other methods */
		
		System.out.println(al1.indexOf(13));
		System.out.println(al1.lastIndexOf(13));  //if we have duplicate values, it will give the last index of occurrence

		//we don't have firstElement() & lastElement() in ArrayList, so fetch them as
		System.out.println(al1.get(0));
		System.out.println(al1.get(al1.size()-1));
		
		System.out.println(al1.isEmpty());
		
		
		
		/* Synchronizing the ArrayList */
		
		Collections.synchronizedList(al1); //it can be used only for List sub classes
		Collections.synchronizedCollection(al1); //it can be used for whole collection framework like set, queue and Map
	}

}