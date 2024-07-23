package com.gl.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList_Employee_CRUD_Operations_5 {


	ArrayList<Employee> employees=new ArrayList<Employee>();


	public void addEmployee(Employee employee) {
		employees.add(employee);
	}

	public List<Employee> getAllEmployees(){
		return employees;
	}

	public Employee getEmployeeById(int id) {
		return employees.get(id);    //get method works by taking index value of ArrayList, so what we pass becomes index.
	}

	public Employee getEmployeeByOrininalId(int id) {
		Iterator<Employee> empItr=employees.iterator();
		while(empItr.hasNext()) {
			Employee empl=empItr.next();
			if(empl.getEmpId()==id) {
				return empl;
			}
		}
		return null;
	}

	public void deleteById(int id) {
		//employees.remove(id); we can do it directly, but use Iterator because we may get ConcurrentModificationException.

		Iterator<Employee> empIter=employees.iterator();



		while(empIter.hasNext()) {

			Employee employee=empIter.next();
			if(employee.getEmpId()==id) {
				empIter.remove();
				System.out.println(id+" Employee is removed");
				break;
			}
		}

		/*
		 * The ConcurrentModificationException in Java is a runtime exception that occurs when there is a concurrent modification of a collection while it is being iterated or operated upon by another thread or part of the program.
		 * The ConcurrentModificationException is a runtime exception that is thrown in Java when an operation is performed on a collection (e.g. a list, set, or map) while another operation is being performed on the same collection. This can lead to unexpected behavior and can be difficult to debug.
		 * For example, if one thread is iterating over a list using an iterator, and another thread modifies the list (adds, removes, or changes elements), it can lead to inconsistencies and unexpected behavior.
		 * Java provides mechanisms to detect such concurrent modifications. When an operation is detected that violates the expected behavior of the collection during iteration or other operations, Java throws a ConcurrentModificationException.
		 * This exception serves as a warning that the collection is being modified in an unsafe manner while it is being used elsewhere.
		 * ConcurrentModificationExceptions often occur when using iterators on collections. For example, modifying a list directly while iterating over it with an iterator can trigger this exception.
		 * When iterating over collections, use appropriate iterator methods for modification (remove() method of iterators) instead of directly modifying the collection.
		 * More info in Notes.
		 */

	}

	public void update(int id, Employee employee) {

		Iterator<Employee> empIter=employees.iterator();

		int counter=-1;   //because index starts from 0

		while(empIter.hasNext()) {
			counter++;
			Employee emp=empIter.next();
			if(emp.getEmpId()==id) {

				employees.set(counter, employee);
			}
		}
	}

	public void display() {
		for(Employee e:employees) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {

		ArrayList_Employee_CRUD_Operations_5 obj=new ArrayList_Employee_CRUD_Operations_5();

		obj.addEmployee(new Employee(104,"Subbu","Essar Infotech",30000));
		obj.addEmployee(new Employee(103,"Navin","Infosys",25000));
		obj.addEmployee(new Employee(102,"Jaggu","TCS",20000));
		obj.addEmployee(new Employee(101,"Prashanth","Wipro",45000));
		obj.display();

		System.out.println("\nAll Employees : "+obj.getAllEmployees());

		System.out.println("\nEmployee of index 0 : "+obj.getEmployeeById(0));  //get method works by taking index value of ArrayList, so what we pass becomes index.

		System.out.println("\nEmployee By Original id : "+obj.getEmployeeByOrininalId(104)+"\n");

		obj.deleteById(104);

		System.out.println("\n");
		obj.display();

		System.out.println("\n");
		Employee eu= new Employee(103,"Navin","Tech Mahindra",50000);
		obj.update(103, eu);
		obj.display();
	}

}

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
