package mysource.thread;

public class ThreadDemo {

	public static void main(String[] args) {
		
		
//		new MyThread1().start();
//		new MyThread1().start();
//		new MyThread1().start();
		
		MyThread1 thread1 = new MyThread1();
		new Thread(thread1).start();
		new Thread(thread1).start();
		new Thread(thread1).start();
		
//		MyThread2 thread2 = new MyThread2();
//		new Thread(thread2).start();
//		new Thread(thread2).start();
//		new Thread(thread2).start();
	}

}

class MyThread1 extends Thread {
	
	private int ticket = 5;
	
	public synchronized void run() {
		
		for(int i=0; i<10; i++) {
			if(ticket > 0) {
				System.out.println("ticket: " + ticket--);
			}
		}
	}
	
}

class MyThread2 implements Runnable {

	private int ticket = 5;
	
	public synchronized void run() {
		
		for(int i=0; i<10; i++) {
			if(ticket > 0) {
				System.out.println("ticket: " + ticket--);
			}
		}
	}
	
}
