package vector;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayList_HYR_1 {
    
    public static void main(String[] args) {
        
        /* Addition of elements */
        /*----------------------*/
        
        // Creating an empty ArrayList with default capacity
        ArrayList<Integer> al1 = new ArrayList<Integer>();
        // When we create an ArrayList, it is initially created with a default capacity of 0.
        // After adding the first element, the capacity increases to 10.
        // This can be observed by debugging.

        al1.add(2);  // Adding element at the end of the list
        al1.add(0, 1);  // Adding element at a specific index
        
        // Printing the list and its size
        System.out.println(al1);  // Output: [1, 2]
        System.out.println("Size: " + al1.size());  // Output: Size: 2
        // In ArrayList, there is no method to directly see the capacity,
        // but after adding the first element, it becomes 10. This can be verified by debugging.

        // Adding more elements
        al1.add(3);
        al1.add(4);
        al1.add(5);
        al1.add(6);
        al1.add(7);
        al1.add(8);
        al1.add(9);
        al1.add(10);  // After adding the 10th element, capacity remains 10

        al1.add(11);  // After adding the 11th element, capacity increases to 15 (50% increase)
                      // If the increase results in an odd number, 7 additional slots are added

        // Adding multiple elements using an array
        Integer arr[] = new Integer[] {12, 13, 14};
        al1.addAll(Arrays.asList(arr));
        
        // Printing the updated list
        System.out.println(al1);
        
        /* Retrieval of elements */
        /*------------------------*/

        // Retrieving the first element
        System.out.println("First element: " + al1.get(0));  // Output: First element: 1
        
        // Printing elements using a for loop
        for (int i = 0; i < al1.size(); i++) {
            System.out.print(al1.get(i) + " ");
        }
        System.out.println();

        // Printing elements using an enhanced for loop
        for (Integer o : al1) {
            System.out.print(o + " ");
        }
        System.out.println();
        
        /* Removal of elements */
        /*--------------------*/
        
        // Removing elements from the list
        al1.remove(0);  // Remove element by index
//        al1.remove(11);  // Remove element by value (uncomment to use)
//        al1.removeAll(al1);  // Remove all elements (uncomment to use)
//        al1.clear();  // Clear the list (uncomment to use)
        
        // Printing the list after removal
        System.out.println("After removal: " + al1);
        
        /* Searching for elements */
        /*------------------------*/
        
        // Checking if the list contains a specific element
        System.out.println("Contains 13: " + al1.contains(13));  // Output: true
        // System.out.println(al1.contains(arr));  // Cannot pass an array directly for searching

        // Checking if the list contains all elements of an array (converted to list)
        System.out.println("Contains all 12, 13, 14: " + al1.containsAll(Arrays.asList(arr)));  // Output: true
        
        /* Updating elements */
        /*-------------------*/
        
        // Updating an element at a specific index
        al1.set(1, 13);
        System.out.println("After update: " + al1);
        
        /* Other methods */
        /*--------------*/
        
        // Finding the index of a specific element
        System.out.println("Index of 13: " + al1.indexOf(13));  // Output: 1
        System.out.println("Last index of 13: " + al1.lastIndexOf(13));  // Output: 1 (if duplicate values are present, it returns the last index of occurrence)

        // Retrieving the first and last elements (no direct method for this in ArrayList)
        System.out.println("First element: " + al1.get(0));  // Output: First element: 1
        System.out.println("Last element: " + al1.get(al1.size() - 1));  // Output: Last element: 14
        
        // Checking if the list is empty
        System.out.println("Is empty: " + al1.isEmpty());  // Output: false
        
        /* Synchronizing the ArrayList */
        /*-----------------------------*/
        
        // Synchronizing the ArrayList for thread safety
        Collections.synchronizedList(al1);  // This can be used only for List subclasses
        Collections.synchronizedCollection(al1);  // This can be used for the entire Collection framework (Set, Queue, Map, etc.)

        // Final state of the list after all operations
        System.out.println("Final list: " + al1);
    }
}
