package com.gl.streams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

class Employee implements Serializable{
	
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
	
}

public class ByteStream_SerializableDemo {

	ObjectOutputStream os;
	List<Employee> employees=new ArrayList<Employee>();
	
	
	public ByteStream_SerializableDemo() {
		employees.add(new Employee(101,"Subbu","Essar Infotech",30000));
		employees.add(new Employee(102,"Navin","Infosys",25000));
		employees.add(new Employee(103,"Jaggu","TCS",20000));
		employees.add(new Employee(104,"Prashanth","Wipro",45000));
	}
	
	public void serializeEmployeeObject() {
		
		try {
			os=new ObjectOutputStream(new FileOutputStream("Employye"));
			os.writeObject(employees);
			os.flush();
			os.close();
			System.out.println("Employye Objects Serialized");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void deSerializeEmployeeObject() {
		
		ArrayList<Employee> employyes1;
		
		try {
			ObjectInputStream oi=new ObjectInputStream(new FileInputStream("Employye"));
			employyes1=(ArrayList<Employee>) oi.readObject();
			System.out.println("Employee Deserialized");
			System.out.println(employyes1);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		
		ByteStream_SerializableDemo obj=new ByteStream_SerializableDemo();
		
		obj.serializeEmployeeObject();
		obj.deSerializeEmployeeObject();
		
	}
}





























