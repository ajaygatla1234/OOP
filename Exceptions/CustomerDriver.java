package com.gl.exceptions;

class Customer{
	
	int cusId;
	String name;
	
	public void display() {
		System.out.println("Customer details displayed");
	}
}

class GoldCustomer extends Customer{
	
	@Override
	public void display() {
		System.out.println("Displaying Gold Customer");
	}
}

public class CustomerDriver {
	
	public void callCustomer() {
		System.out.println("Dealing with Customers");
		Customer customer = new Customer();
		customer.display();
	}

	public static void main(String[] args) {
		
		CustomerDriver c1=new CustomerDriver();
		c1.callCustomer();

		Customer c2=new Customer();
		c2.display();
		
		//c1 & c2 gives same o/p but approach is different
		
		GoldCustomer gc=new GoldCustomer();
		gc.display();
	}

}
