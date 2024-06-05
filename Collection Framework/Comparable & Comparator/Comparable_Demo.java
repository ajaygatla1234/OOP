package com.gl.comparablecomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class Student implements Comparable<Student>{

	int id;
	String name;
	String city;
	float salary;

	public Student() {

	}

	public Student(int id, String name, String city, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.salary = salary;
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

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}



	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + ", salary=" + salary + "]";
	}
	
	//Sorting with respect to id
	@Override
	public int compareTo(Student student) {
	    // Compare based on ID
	    if (this.getId() < student.getId()) {
	        return -1;
	    } else if (this.getId() > student.getId()) {
	        return 1;
	    } else {
	        return 0;
	    }
	}
	// To sort in descending order, either swap the return values (-1 and 1) or swap "this" and "student" in the comparisons.
	//using Functional Programming(lambda Expression) will make easy to override compareTo() in Comparable interface

	
	//Sorting with respect to Name
	@Override
	public int compareTo(Student student) {     //this compareTo(Student o) is from Comparable interface
		if(this.getName().compareTo(student.getName())>0) {  //this compareTo(Student o) is from String class
			return 1;
		}
		else if(this.getName().compareTo(student.getName())<0) {
			return -1;
		}
		else {
			return 0;
		}
	}//using Functional Programming(lambda Expression) will make easy to override compareTo() in Comparable interface

	/*
	 * In the String class in Java, the compareTo() method is used to compare one string to another lexicographically. 
	 * This means it compares strings based on their Unicode values, character by character.
	 */

}

public class Comparable_Demo {

	public static void main(String[] args) {

		ArrayList<Student> students=new ArrayList<Student>();

		students.add(new Student(5,"Subbu","Hyderabad", 25000));
		students.add(new Student(4,"Navin","Coimabtore", 25000));
		students.add(new Student(3,"Jaggu","Pune", 25000));
		students.add(new Student(2,"Rakesh","Mumbai", 25000));
		students.add(new Student(1,"Prashanth","Banglore", 25000));

		System.out.println("Before Sorting");
		Iterator<Student> stuItr=students.iterator();
		while(stuItr.hasNext()) {
			System.out.println(stuItr.next());
		}
		
		/*
		 * When you call Collections.sort(students), the compareTo method of the Student class is invoked multiple times during the sorting process. 
		 * This method compares pairs of Student objects to determine their relative ordering.
		 * The sort method in the Collections class uses a variation of Timsort. 
		 * Timsort is a hybrid sorting algorithm derived from merge sort and insertion sort, and it is designed to perform well on many kinds of real-world data. 
		 */
		Collections.sort(students);  //
		
		System.out.println("\nAfter Sorting");
		Iterator<Student> stuItr1=students.iterator();
		while(stuItr1.hasNext()) {
			
			Student student = stuItr1.next(); // Retrieve the next student
		    // Print the attributes of the student
		    System.out.print(student.getName()+" : ");
		    System.out.print(student.getCity()+" : ");
		    System.out.print(student.getId());
		    System.out.println();
		}
		
	}
}
