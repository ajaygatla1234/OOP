package com.gl.comparablecomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Customer{

	int id;
	String name;
	String city;
	float purchaseValue;

	public Customer() {
		super();
	}

	public Customer(int id, String name, String city, float purchaseValue) {
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

class CustomerIdSorter implements Comparator<Customer>{

	@Override
	public int compare(Customer customer1, Customer customer2) {

		if(customer1.getId()>customer2.getId()) {
			return 1;
		}
		else if(customer1.getId()<customer2.getId()){
			return -1;
		}
		else {
			return 0;
		}
	}
	// To sort in descending order, either swap the return values (-1 and 1) or swap "customer1" and "customer2" in the comparisons.
}

class CustomerCitySorter implements Comparator<Customer>{

	@Override
	public int compare(Customer o1, Customer o2) {
		if(o1.getCity().compareTo(o2.getCity())>0) {
			return 1;
		}
		else if(o1.getCity().compareTo(o2.getCity())<0){
			return -1;
		}
		else {
			return 0;
		}
	}
	// To sort in descending order, either swap the return values (-1 and 1) or swap "o1" and "o2" in the comparisons.
}

class CustomerPurchaseValueSorter implements Comparator<Customer>{

	@Override
	public int compare(Customer o1, Customer o2) {

		if(o1.getPurchaseValue()>o2.getPurchaseValue()) {
			return 1;
		}
		else if(o1.getPurchaseValue()<o2.getPurchaseValue()) {
			return -1;
		}
		else {
			return 0;
		}
	}
	// To sort in descending order, either swap the return values (-1 and 1) or swap "o1" and "o2" in the comparisons.
}

public class Comparator_Demo {

	public static void main(String[] args) {

		ArrayList<Customer> customers=new ArrayList<Customer>();

		customers.add(new Customer(5, "Subbu", "Hyderabad", 6546));
		customers.add(new Customer(4, "Navin", "Pune", 456));
		customers.add(new Customer(3, "Rakesh", "Banglore", 65456));
		customers.add(new Customer(2, "Jaggu", "Chennai", 45566));
		customers.add(new Customer(1, "Prashanth", "Mumbai", 654653466));

		System.out.println("----------Original Data----------");
		Iterator<Customer> cusItr1=customers.iterator();
		while(cusItr1.hasNext()) {
			System.out.println(cusItr1.next());
		}

		System.out.println("\n----------Sorting based on Id----------");
		Collections.sort(customers, new CustomerIdSorter());
		Iterator<Customer> cusItr2=customers.iterator();
		while(cusItr2.hasNext()) {
			System.out.println(cusItr2.next());
		}

		System.out.println("\n----------Sorting based on City----------");
		Collections.sort(customers, new CustomerCitySorter());
		Iterator<Customer> cusItr3=customers.iterator();
		while(cusItr3.hasNext()) {
			System.out.println(cusItr3.next());
		}

		System.out.println("\n----------Sorting based on Purchase Value----------");
		Collections.sort(customers, new CustomerPurchaseValueSorter());
		Iterator<Customer> cusItr4=customers.iterator();
		while(cusItr4.hasNext()) {
			System.out.println(cusItr4.next());
		}
	}

	// Instead of using separate Comparator classes and overriding compare() methods, we can use Lambda Expressions to simplify the code.
	// They provide a concise(short & clear) way to represent anonymous functions, making the code more readable and reducing boilerplate code.
}
