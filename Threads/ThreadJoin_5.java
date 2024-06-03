package com.gl.threads;

public class ThreadJoin_5 implements Runnable{

	Thread t;

	public ThreadJoin_5() {
		t=new Thread(this, "Child Thread");
		t.start();
	}

	@Override
	public void run() {

		System.out.println("Child Thread "+t+" Started");

		for(int i=0;i<5;i++) {
			System.out.println("Child Thread Loop : "+i);  //check whether a thread is still running or has finished its execution

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

		ThreadJoin_5 tj=new ThreadJoin_5();
		System.out.println("Is Child Thread Alive : "+tj.t.isAlive());

		try {
			tj.t.join();   // Wait for the child thread to complete
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println("Is Child Thread Still Alive : "+tj.t.isAlive());
		
		for(int i=0;i<5;i++) {
			System.out.println("Main Thread Loop : "+i);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Is Child Thread Still Alive : "+tj.t.isAlive());
		System.out.println("Back in Main Method");
		System.out.println("Exiting Child Thread");
	}
	
	/*
	 * In simple terms, the join() method in Java is used to wait for a thread to finish its execution before continuing with the execution of the current thread. When you call join() on a thread object, the thread that invokes join() will pause its execution and wait for the specified thread to complete its execution.

		For example, if you have a main thread and a child thread, and you call join() on the child thread from the main thread, the main thread will pause until the child thread finishes its execution. Once the child thread completes, the main thread will resume its execution.

		In essence, join() allows threads to synchronize their execution, ensuring that certain actions occur in a specific order or sequence.
	 */
}
