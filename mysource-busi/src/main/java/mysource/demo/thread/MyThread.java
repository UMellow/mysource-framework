package mysource.demo.thread;

import java.util.concurrent.CountDownLatch;

public class MyThread implements Runnable {

	private Counter counter;
	private CountDownLatch countDown;
	
	public MyThread(Counter counter, CountDownLatch countDown) {
		this.counter = counter;
		this.countDown = countDown;
	}
	
	public void run() {
		
		for(int i=0; i<10000; i++) {
			counter.addCounter();
		}
		countDown.countDown();
	}
	
	public static void main(String[] args) {
		
		Thread myThread = new Thread(new MyThread(new Counter(), new CountDownLatch(1)));
		myThread.start();
	}

}
