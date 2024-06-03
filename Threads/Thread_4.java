package com.gl.threads;

public class Thread_4 implements Runnable{
	
	
	Thread t;
	
	public Thread_4() {
		t=new Thread(this, "Child Thread");
		t.start();
	}
	
	@Override
	public void run() {
		
		System.out.println("Child Thread "+t+" Started");
		
		for(int i=0;i<5;i++) {
			System.out.println("Child Thread Loop : "+i);
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	public static void main(String[] args) {
		
		System.out.println("Main Thread Started");
		System.out.println("About to start the child Thread");
		
		Thread_4 tj=new Thread_4();
		
		for(int i=0;i<5;i++) {
			System.out.println("Main Thread Loop : "+i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Back in Main Method");
		System.out.println("Exiting Child Thread");
	}

	
	/* The main thread starts execution and prints "Main Thread Started" followed by "About to start the child Thread.
	 * When the child thread tj is created, its name is changed using t=new Thread(this, "Child Thread").
	 * Upon calling start() on 't', the child thread t gets started, and now there are two threads: the main thread and the child thread.
	 * These threads are in a race to execute, with the main thread having higher priority than the child thread.
	 * Since the main thread has higher priority, it resumes execution from the for loop and prints "Main Thread Loop : 0".
	 * It then goes into sleep for 1000 milliseconds (1 second).
	 * While the main thread is in sleep, JVM checks for another thread to execute. As the child thread is available, the for loop in its run() method gets executed and prints "Child Thread Loop : 0" and "Child Thread Loop : 1".
	 * The child thread can execute two loops because it sleeps for only 500 milliseconds between each iteration. 
	 * After 1000 milliseconds (1 second), the main thread wakes up and continues its execution, printing "Main Thread Loop : 1" and then going into sleep again.
	 * This process continues until the child thread completes its loops ("Child Thread Loop : 4").Once both threads finish their loops, the main method in the main thread prints "Back in Main Method", "Exiting Child Thread," and then ends.
	 */
}
