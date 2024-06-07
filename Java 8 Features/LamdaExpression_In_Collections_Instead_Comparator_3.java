package com.gl.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class Customer1{

	int id;
	String name;
	String city;
	float purchaseValue;

	public Customer1() {
		super();
	}

	public Customer1(int id, String name, String city, float purchaseValue) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.purchaseValue = purchaseValue;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public float getPurchaseValue() {
		return purchaseValue;
	}

	public void setPurchaseValue(float purchaseValue) {
		this.purchaseValue = purchaseValue;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", city=" + city + ", purchaseValue=" + purchaseValue + "]";
	}
}

public class LamdaExpression_In_Collections_Instead_Comparator_3 {

	public static void main(String[] args) {

		ArrayList<Customer1> customers=new ArrayList<Customer1>();

		customers.add(new Customer1(5, "Subbu", "Hyderabad", 6546));
		customers.add(new Customer1(4, "Navin", "Pune", 456));
		customers.add(new Customer1(3, "Rakesh", "Banglore", 65456));
		customers.add(new Customer1(2, "Jaggu", "Chennai", 45566));
		customers.add(new Customer1(1, "Prashanth", "Mumbai", 654653466));

		System.out.println("----------Original Data----------");
		customers.forEach(item->System.out.println(item));  // Using lambda expression with forEach to print each element

		System.out.println("\n----------Sorting based on Id----------");
		Collections.sort(customers, (c1,c2) -> {return (Integer.compare(c1.id, c2.id));});  
		customers.forEach(item->System.out.println(item));  // Using lambda expression with forEach to print each element
		//to get the Descending order swap c1 & c2
		//either Collections.sort(customers, (c2,c1) -> {return (Integer.compare(c1.id, c2.id));});
		//or Collections.sort(customers, (c1,c2) -> {return (Integer.compare(c2.id, c1.id));});

		System.out.println("\n----------Sorting based on City----------");
		Collections.sort(customers, (c1,c2) -> {return c1.city.compareTo(c2.city);});
		customers.forEach(item->System.out.println(item));  // Using lambda expression with forEach to print each element
		//to get the Descending order swap c1 & c2
		//either Collections.sort(customers, (c2,c1) -> {return c1.city.compareTo(c2.city);});
		//or Collections.sort(customers, (c1,c2) -> {return c2.city.compareTo(c1.city);});

		System.out.println("\n----------Sorting based on Purchase Value----------");
		Collections.sort(customers, (c1,c2) -> {return (Float.compare(c1.purchaseValue, c2.purchaseValue));});
		customers.forEach(item->System.out.println(item));  // Using lambda expression with forEach to print each element
	}

	/* In this code, I've replaced the lambda expressions with method references using Comparator.comparing and Comparator.comparingDouble for sorting based on fields. 
	 * The forEach method is used to print the sorted list directly, eliminating the need for explicit iterators.

	    System.out.println("\n----------Sorting based on Id----------");
        customers.sort(Comparator.comparingInt(Customer1::getId)); // Sort by ID
        customers.forEach(System.out::println);

        System.out.println("\n----------Sorting based on City----------");
        customers.sort(Comparator.comparing(Customer1::getCity)); // Sort by City
        customers.forEach(System.out::println);

        System.out.println("\n----------Sorting based on Purchase Value----------");
        customers.sort(Comparator.comparingDouble(Customer1::getPurchaseValue)); // Sort by Purchase Value
        customers.forEach(System.out::println);
	 * 
	 */

}
