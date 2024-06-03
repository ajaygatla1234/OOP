package com.gl.threads;

public class MainThread_1 {

	public static void main(String[] args) {

		Thread t=new Thread().currentThread();
		System.out.println("Current Thread : "+t);

		System.out.println("main : name of the thread");
		System.out.println("5 : Priority of the thread");
		System.out.println("main : Who Invoked the thread(main itself)");
		
		/*Priority:
		 * Please remember the following text: "The range is from 1 to 10, using integer constants."
		 * 
		 * static int final MAX_PRIORITY=10
		 * static int final NORM_PRIORITY=5
		 * static int final MIN_PRIORITY=1
		 * 
		 * main will have the priority 5, even though it is the highest priority, equal to 10
		 * For user-defined threads, priority works according to the integer constants mentioned above.
		 * Remember: the default behavior is completely different for the main thread.
		 */
		
		t.setName("New Main Thread");
		System.out.println("\nCurrent Thread after name change : "+t);
		//For the current process, we can change the name, but the name of the thread that invoked it cannot be changed.
	}

	

}
