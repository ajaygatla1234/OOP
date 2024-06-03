package com.gl.threads;

class MyThread {

	
	public /*synchronized*/ void call() {         //synchronized method
		System.out.println("Producing Goods...");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Consuming Goods...");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

public class SynchronizationSample_6 implements Runnable{

	Thread t;
	MyThread mt;
	
	public SynchronizationSample_6(MyThread mt) {
		t=new Thread(this, "Child Thread");
		this.mt=mt;
	}
	
	@Override
	public void run() {
		synchronized (mt) {   //synchronized block
			mt.call();
		}
	}
	
	public static void main(String[] args) {
		
		MyThread mt1=new MyThread();
		
		SynchronizationSample_6 thread1=new SynchronizationSample_6(mt1);
		SynchronizationSample_6 thread2=new SynchronizationSample_6(mt1);
		
		thread1.t.start();
		thread2.t.start();
	}

}
