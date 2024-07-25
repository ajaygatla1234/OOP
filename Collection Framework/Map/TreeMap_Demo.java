package com.gl.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap_Demo {

	TreeMap<String, Employee> myTreeMap=new TreeMap<String,Employee>();

	public void populateTreeMap() {
		myTreeMap.put("E004", new Employee(104,"Subbu","Essar Infotech",30000));
		myTreeMap.put("E003", new Employee(103,"Navin","Infosys",25000));
		myTreeMap.put("E002", new Employee(102,"Jaggu","TCS",20000));
		myTreeMap.put("E001", new Employee(101,"Prashanth","Wipro",45000));

		myTreeMap.put("E001", new Employee(101,"Vineeth","Virtusa",28000));

	}

	public void fetchTreeMap() {

		Set<String> myKeys=myTreeMap.keySet();  //The line Set<String> myKeys = empMap.keySet(); retrieves a set of keys from a map called empMap.

		Iterator<String> myKeyIter=myKeys.iterator();

		/*
		 * myKeyIter is the iterator object itself, which allows us to iterate over the elements of a collection. 
		 * myKeyIter.hasNext() is a method of the iterator object that returns true if there are more elements to iterate over, and false otherwise. 
		 * Initially, myKeyIter is positioned before the first element in the collection, and myKeyIter.hasNext() returns true if there is at least one element in the collection, and false if the collection is empty.
		 * 
		 */
		while (myKeyIter.hasNext()) {

			String myKey=myKeyIter.next();
			Employee e=myTreeMap.get(myKey);
			System.out.println("The Employee for the key : "+myKey+" is : "+e);
		}
		System.out.println("\n----------------------Fetched value object from HashMap----------------------");

		/*
		 * empMap.values(): The values() method is called on the empMap object. 
		 * It returns a collection view of all the values (i.e., Employee objects) stored in the map. 
		 * This view is backed by the original map, meaning any changes to the map will be reflected in this collection view.
		 */

		//A Collection is a more general interface that represents a group of objects.
		//There is no defined order for the elements in a Collection.
		Collection<Employee> myColEmp=myTreeMap.values();
		for(Employee e:myColEmp) {
			System.out.println(e);
		}

		//OR (Either approach will work, based on the need choose it)
		System.out.println("\n**************************\n");

		//A List is a specialized type of Collection.
		//It maintains the order of elements (insertion order).
		List<Employee> myEmployeeList = new ArrayList<Employee>(myTreeMap.values());
		for (Employee e : myEmployeeList) {
			System.out.println(e);
		}

	}
	
	public static void main(String[] args) {
		
		TreeMap_Demo obj=new TreeMap_Demo();
		
		obj.populateTreeMap();
		obj.fetchTreeMap();
	}

}
