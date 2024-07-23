package com.gl.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class Employee implements Comparable<Employee>{
	
	int empId;
	String name;
	String address;
	double salary;
	
	public Employee() {
		super();
	}

	public Employee(int empId, String name, String address, double salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", address=" + address + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Employee o) {
		return Integer.compare(this.empId, o.empId);

	}
	
}

public class ArrayList_EmployeeOperations_4 {
	
	ArrayList<Employee> employees = new ArrayList<Employee>();
	
	public void populateArrayList() {
		employees.add(new Employee(104,"Subbu","Essar Infotech",30000));
		employees.add(new Employee(103,"Navin","Infosys",25000));
		employees.add(new Employee(102,"Jaggu","TCS",20000));
		employees.add(new Employee(101,"Prashanth","Wipro",45000));
		employees.add(new Employee(101,"Prashanth","Wipro",45000));  //it can add duplicates
	}
	
	public void fetchArrayList() {
		System.out.println("Fetching directly");
		System.out.println(employees);
		
		System.out.println("\n---------Using Iterator---------");
		Iterator<Employee> empItr=employees.iterator();
		while(empItr.hasNext()) {       //When you first start iterating with empItr, it points to the position before the first element in the collection. This is why you typically call empItr.hasNext() before calling empItr.next(), to ensure that there is at least one element in the collection to process.
			Employee e=empItr.next();
			System.out.println(e);
		}
		
		System.out.println("\n---------Using For Each---------");
		for(Employee e:employees) {
			System.out.println(e);
		}
		
		System.out.println("\n---------Other Functions---------");
		Employee empThree=employees.get(3);
		System.out.println("4th Index : "+empThree);
		
		employees.remove(2);
		System.out.println("\nDisplaying after removing index 2");
		for(Employee e:employees) {
			System.out.println(e);
		}
	}
	
	public void sortArrayList() {
		Collections.sort(employees);
		System.out.println("\nAfter Sorting");
		for(Employee e:employees) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
	
		ArrayList_EmployeeOperations_4 obj=new ArrayList_EmployeeOperations_4();
		
		obj.populateArrayList();
		obj.fetchArrayList();
		obj.sortArrayList();
		
		//for Sorting follow this
		//1.Comparable Interface: The Employee class implements the Comparable interface and overrides the compareTo method to define the natural ordering based on empId.
		//2.sortArrayList Method: This method sorts the employees list using Collections.sort(employees) and prints the sorted list.
	}

}
