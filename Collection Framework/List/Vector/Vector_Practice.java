package vector;

import java.util.Arrays;
import java.util.Vector;

public class Vector_Practice {

	public static void main(String[] args) {

		/*
		 * To verify that a Vector uses an array internally:
		 * 
		 * 1. Set a breakpoint at the line where you create the Vector, e.g., `Vector v1 = new Vector();`.
		 * 2. Run the application in debug mode.
		 * 3. When execution pauses at the breakpoint, press F6 to step over to the next line.
		 * 4. Hover your cursor over the `v1` variable to view its details.
		 * 5. Click on `elementData=Object[10](id=34)` to inspect the internal array.
		 * 
		 * The `Vector` initializes an internal array of size 10. Initially, the array contains `null` values, 
		 * indicating that it is empty before any elements are inserted.
		 * 
		 * This demonstrates that `Vector` uses a dynamic array for storing its elements.
		 */


		/* Addition of elements */
		/*----------------------*/

		Vector v1 = new Vector();
		v1.add("Subbu");
		v1.add("Srinu");
		v1.add(0,"Rajesh"); // Before executing this line, the output is: [Subbu, Srinu]
		// After executing this line, the output becomes: [Rajesh, Subbu, Srinu]


		v1.add(4);
		v1.add(5);
		v1.add(6);
		v1.add(7);
		v1.add(8);
		v1.add(9);
		v1.add(10);  // Adding the 10th element does not increase the internal array size,
		// because the current array can still accommodate more elements.

		// The internal array size will only increase when adding a new element 
		// that exceeds the current array's capacity.
		// After adding the 11th element, the internal array is resized:
		// From elementData=Object[10](id=34) to elementData=Object[20](id=34)
		v1.add(11);
		
		v1.add(null);
		v1.add(null);


		System.out.println(v1);

		// Print the number of elements currently stored in the Vector.
		System.out.println("Size: " + v1.size());  // The number of objects inserted into the Vector.

		// Print the current capacity of the internal array.
		// This is the maximum number of elements that the array can accommodate before resizing.
		System.out.println("Capacity: " + v1.capacity());


		Vector<String> v2 = new Vector<>();
		v2.add("Ramesh");
		v2.add("Suresh");




		/* Adding all elements from v2 into v1 */
		/*--------------------------------------*/

		// Using a for loop to add elements from v2 to v1:
		// This approach is not recommended because it requires additional code and can impact performance.
		// For better performance and simplicity, prefer using built-in methods.
		for (int i = 0; i < v2.size(); i++) {
			v1.add(v2.get(i));
		}

		// Using the built-in addAll() method to add all elements from v2 to v1.
		// This is more efficient and concise.
		v1.addAll(v2);

		// Adding all elements from v2 to v1 at a specific index (13 in this case).
		// Note that the index must be within the current size of v1 to avoid an IndexOutOfBoundsException.
		v1.addAll(13, v2);

		// Attempting to add all elements from v2 to v1 at an index (16 in this case) that is beyond the current size of v1.
		// This will result in an IndexOutOfBoundsException because the index is out of range.
		v1.addAll(16, v2);  // Not possible, as the index is out of bounds


		System.out.println(v1);
		System.out.println("Size: " + v1.size());
		System.out.println("Capacity: " + v1.capacity());



		/* Retrieval of elements */
		/*------------------------*/

		System.out.println(v1.get(13));
		
		for(int i=0;i<v1.size();i++) {
			System.out.print(v1.get(i)+" ");
		}
		
		for(Object o:v1) {
			System.out.print(o);
		}



		/* Removal of elements */
		/*--------------------*/

		// Remove the element at index 0 from the vector v1.
		// This operation will remove the element located at the specified index.
		v1.remove(0);

		// Remove the first occurrence of the element "Subbu" from v1.
		// Note: String comparisons in Java are case-sensitive, so "subbu" is different from "Subbu".
		// Ensure the exact case of the string when removing.
		v1.remove("Subbu");

		// Print the contents of v1 after removal operations.
		System.out.println(v1);

		// Remove all elements in vector v2 from vector v1.
		// This will remove any elements from v1 that are also present in v2.
		v1.removeAll(v2);

		// Print the contents of v1 after removing all elements found in v2.
		System.out.println(v1);

		// Clear all elements from v1.
		// This will remove all elements, leaving v1 empty.
//		v1.clear();

		// Print the contents of v1 after clearing all elements.
		System.out.println(v1);



		/* Searching of elements */
		/*--------------------*/

		// Check if the vector v1 contains the single element "Srinu".
		// This returns true if "Srinu" is present in v1, otherwise false.
		System.out.println(v1.contains("Srinu"));  

		// Check if v1 contains all elements from the collection v2.
		// This will return true if every element in v2 is present in v1, regardless of the order.
		// It does not check the order of elements, only their presence.
		System.out.println(v1.containsAll(v2));    


		/* Updating elements */
		/*--------------------*/
		v1.set(0, "Sai");
		System.out.println(v1);

		

		/* Other methods */
		
		/* 
		 * Find the index of the first occurrence of "Suresh" in v1.
		 * If "Suresh" is present multiple times, this will return the index of its first occurrence.
		 */
		System.out.println(v1.indexOf("Suresh")); 

		/* 
		 * Add another "Suresh" to v1 (creating a duplicate entry).
		 * The indexOf method will still return the index of the first occurrence of "Suresh".
		 */
		v1.add("Suresh"); 
		System.out.println(v1.indexOf("Suresh"));  // Output: Index of the first occurrence of "Suresh" remains the same

		/* 
		 * Find the index of the last occurrence of "Suresh" in v1.
		 * This will return the index of the last occurrence, which will be updated due to the addition of the duplicate.
		 */
		System.out.println(v1.lastIndexOf("Suresh"));

		/* 
		 * Attempting to find the index of the sublist v2 in v1 using indexOf.
		 * This will not work because indexOf expects a single element, not a collection.
		 */
		System.out.println("Index of v2 in v1: " + v1.indexOf(v2));  // Output: -1

		/* 
		 * Retrieve and print the first element of v1.
		 */
		System.out.println(v1.firstElement());

		/* 
		 * Retrieve and print the last element of v1.
		 */
		System.out.println(v1.lastElement());
		
		System.out.println(v1.size()-1);  //To find the last element index position

		/* 
		 * Convert v1 to an array of Objects and print it.
		 * This shows the contents of the Vector in array format.
		 */
		Object[] arr = v1.toArray();
		System.out.println(Arrays.toString(arr));

		
		
		/* Arrays to List */

		Object[] arr1 = new Object[] {1, 2, 3, 4, 5, 6, 7, 8};

		/* 
		 * Create a Vector from the array arr1. 
		 * The Vector is initialized with elements from the array.
		 * This approach initializes the Vector with the exact size needed to accommodate the elements in arr1.
		 */
		Vector<Object> v3 = new Vector<>(Arrays.asList(arr1));

		/* 
		 * If created with no arguments like this: Vector v3 = new Vector();
		 * A default capacity of 10 is used initially. The size will grow as elements are added.
		 * 
		 * Alternatively, we can specify the initial capacity: Vector v3 = new Vector(20);
		 * This creates a Vector with an initial capacity of 20, which may be useful for optimizing performance 
		 * if the expected number of elements is known in advance.
		 */

		// Display the size of the Vector (number of elements)
		System.out.println("Size of v3: " + v3.size()); 

		// Display the capacity of the Vector (size of the internal array)
		System.out.println("Capacity of v3: " + v3.capacity());

		
		/*Use of Generic*/

		Vector<Integer> obj = new Vector<Integer>();  //<> : angle brackets,
		
//		Vector<int> obj = new Vector<int>();  
		//In Java, Classes or Interfaces does not support primitive types like int directly because we cannot create objects for primitive types.
		//It works with objects, so if you want to use a Vector with integer values, you should use the wrapper class Integer instead of the primitive type int.
	}


}
