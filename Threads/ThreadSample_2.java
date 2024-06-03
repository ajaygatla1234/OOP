package com.gl.threads;

//If we use "extends Thread", the class itself becomes a thread.
public class ThreadSample_2 extends Thread{

	public ThreadSample_2() {
		System.out.println("Child Thread : "+this);  //displays the current thread, similar to Thread t=new Thread().currentThread();
		start(); //calls the run() by default
	}

	@Override
	public void run() {  //Runnable
		System.out.println("Entering Child Thread");
		System.out.println("Executing Child Thread");
		System.out.println("Exiting Child Thread");
	}

	public static void main(String[] args) {

		System.out.println("In the Main Thread");
		System.out.println("About to Invoke Child Thread");
		ThreadSample_2 t=new ThreadSample_2();  //Un-started state
		System.out.println("Back in Main Method");
		System.out.println("Exiting Main Thread");
	}

	/* The main thread begins execution and prints "In the Main Thread" followed by "About to Invoke Child Thread." 
	 * When the child thread t is created, it prints "Child Thread :" along with its details. 
	 * Upon calling start() on t, t Thread gets started, and now there are two threads: the main thread and the child thread. 
	 * These threads are in a race to execute, with the main thread having higher priority than the child thread. (JVM checks the Priority)
	 * Since the main thread has higher priority, it resumes execution and prints "Back in Main Method" and "Exiting Main Thread." 
	 * After the main thread completes its execution, the child thread, which was initially in the waiting state, gets its turn to execute. 
	 * It then calls the run() method and executes its logic, printing "Entering Child Thread," "Executing Child Thread," and "Exiting Child Thread."
	 * This sequence illustrates the concurrency aspect of multiple threads and how the execution order can be influenced by thread priorities.
	 * 
	 */
}
