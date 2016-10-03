package mysource.demo.thread;

public class Counter {
	
	private Integer counter = 0;
	
	public void addCounter() {
		counter ++;
	}
	
	public synchronized void addCounter2() {
		counter ++;
	}

}
