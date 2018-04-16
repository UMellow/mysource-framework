package mysource.jcore.thread;

public class SleepInterrupt implements Runnable {

	@Override
	public void run() {
		try {
			System.out.println("in run() - 开始执行线程，休眠20秒");
			Thread.sleep(10000);
			System.out.println("in run() - 线程被唤醒");
		} catch (InterruptedException e) {
			System.out.println("in run() - 线程被中断");
			return;
		}
		System.out.println("in run() - 执行其它处理");
	}
	
	public static void main(String[] args) {
		SleepInterrupt si = new SleepInterrupt();
		Thread t = new Thread(si);
		t.setName("【si】");
		t.start();
		
		try {
			Thread.sleep(2000);			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("in main() - 中断线程si的执行");
		t.interrupt();
		System.out.println("in main() - 执行其它处理");
	}

}
