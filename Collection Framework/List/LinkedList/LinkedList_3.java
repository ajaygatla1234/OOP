package list;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList_3 {
	
	static LinkedList<Employee> llist = new LinkedList<Employee>();
	
	public static void populateLinkedList() {
		llist.add(new Employee(104,"Subbu","Essar Infotech",30000));
		llist.add(new Employee(103,"Navin","Infosys",25000));
		llist.add(new Employee(102,"Jaggu","TCS",20000));
		llist.add(new Employee(101,"Prashanth","Wipro",45000));
		
		llist.addFirst(new Employee(100,"Rakesh","BJP Party",100000));
		llist.addLast(new Employee(105,"Srinu","IBM",34000));
	}
	
	public static void fetchLinkedList() {
		System.out.println("Fetching directly");
		System.out.println(llist);
		
		System.out.println("\n---------Using Iterator---------");
		Iterator<Employee> empItr=llist.iterator();
		while(empItr.hasNext()) {      //When you first start iterating with empItr, it points to the position before the first element in the collection. This is why you typically call empItr.hasNext() before calling empItr.next(), to ensure that there is at least one element in the collection to process.
			Employee e=empItr.next();
			System.out.println(e);
		}
		
		System.out.println("\n---------Using For Each---------");
		for(Employee e:llist) {
			System.out.println(e);
		}
		
		System.out.println("\n---------Other Functions---------");
		Employee empThree=llist.get(3);
		System.out.println("4th Index : "+empThree);
		
		llist.remove(2);
		System.out.println("\nDisplaying after removing index 2");
		for(Employee e:llist) {
			System.out.println(e);
		}
	}
	
	public static void sort() {
		Collections.sort(llist);
		System.out.println("\nAfter Sorting");
		for(Employee e:llist) {
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		
		populateLinkedList();
		fetchLinkedList();
		sort();
	}

}

class Employee implements Comparable<Employee> {
    private int id;
    private String name;
    private String company;
    private double salary;

    public Employee(int id, String name, String company, double salary) {
        this.id = id;
        this.name = name;
        this.company = company;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "', company='" + company + "', salary=" + salary + '}';
    }

    @Override
    public int compareTo(Employee other) {
        return Integer.compare(this.id, other.id);
    }
}