package com.gl.collections;

import java.util.Collection;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;

public class HashTable_Demo {

	Hashtable<String, Employee> myTable = new Hashtable<String, Employee>();

	public void populateHashTable() {
		myTable.put("E004", new Employee(104,"Subbu","Essar Infotech",30000));
		myTable.put("E003", new Employee(103,"Navin","Infosys",25000));
		myTable.put("E002", new Employee(102,"Jaggu","TCS",20000));
		myTable.put("E001", new Employee(101,"Prashanth","Wipro",45000));

		myTable.put("E001", new Employee(101,"Vineeth","Virtusa",28000));
		//it cannot take two objects under same key, instead it updates or overrides the object with recent values
	}
	
	public void fetchUsingEnumerator() {
		
		Enumeration<String> myKeys=myTable.keys();
		
		while (myKeys.hasMoreElements()) {
			String myKey = myKeys.nextElement();
			System.out.println("The value object for the key "+myKey+" is "+myTable.get(myKey));
			
		}
	}
	
	public void fetchUsingValues() {
		
		Collection<Employee> employees=myTable.values();
		
		Iterator<Employee> empItr = employees.iterator();
		
		while(empItr.hasNext()) {
			System.out.println("The value object is "+empItr.next());
		}
	}

	public static void main(String[] args) {
		
		HashTable_Demo obj = new HashTable_Demo();
		
		obj.populateHashTable();
		obj.fetchUsingEnumerator();
		System.out.println("\nvalue object");
		obj.fetchUsingEnumerator();
	}

}
