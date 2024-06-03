package com.gl.threads;

public class RunnableSample_3 implements Runnable {

    Thread t; // Declare a Thread object

    // Constructor
    public RunnableSample_3() {
        // Create a new Thread using this RunnableSample_3 instance as the target and name it "Child Thread"
        t = new Thread(this, "Child Thread");
        System.out.println("Thread State after Thread creation: " + t.getState()); // State: New
        t.start(); // Start the thread
        System.out.println("Thread State after Thread start: " + t.getState()); // State: Runnable
    }

    // Overridden run() method from the Runnable interface
    @Override
    public void run() {
        // Code to be executed by the child thread
        System.out.println("Entering Child Thread : " + t); // Print thread information
        System.out.println("Thread State inside run() method: " + t.getState()); // State: Runnable
        System.out.println("Entering Child Thread");
        System.out.println("Executing Child Thread");
        System.out.println("Exiting Child Thread");
    }
    
    // Main method
    public static void main(String[] args) {
        System.out.println("In the Main Thread"); // Print message indicating main thread start
        System.out.println("Thread State at main start: " + Thread.currentThread().getState()); // State: Runnable
        System.out.println("About to Invoke Child Thread"); // Print message indicating child thread creation
        RunnableSample_3 ts = new RunnableSample_3(); // Create an instance of RunnableSample_3 (un-started state)
        System.out.println("Back in Main Method"); // Print message indicating back to main method
        System.out.println("Exiting Main Thread"); // Print message indicating main thread exit
        System.out.println("Thread State at main exit: " + Thread.currentThread().getState()); // State: Terminated
    }
    
    
    /*
     * when a class extends Thread , we can directly call the start(), but when a class implements Runnable start() cannot ba called directly why...?

		In Java, when a class extends the Thread class, it's essentially creating a thread by itself. Therefore, it can directly call the start() method to begin the execution of the thread it represents. The start() method internally calls the run() method, which is overridden in the subclass.

		However, when a class implements the Runnable interface, it's not a thread by itself; it's just a class that provides a run() method that can be executed by a thread. In this case, you need to create a Thread object and pass the Runnable object to it as a parameter. Then, you call the start() method on the Thread object to start the execution of the run() method.

		Here's why:

		Extending Thread:
		When you extend Thread, your class is a thread itself.
		You override the run() method to define the behavior of the thread.
		You can call start() directly because you're calling it on the instance of the class itself, which is a thread.
		
		Implementing Runnable:
		When you implement Runnable, your class is not a thread; it's just a class with a run() method.
		You need to create a Thread object and pass an instance of your class to it.
		You call start() on the Thread object, not on your class directly, because your class is not a thread.
		In summary, when you implement Runnable, you're separating the task you want to execute into a separate class from the thread that executes it. This provides better separation of concerns and more flexibility in how you manage and use threads.
     * 
     */
}
