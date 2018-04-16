package mysource.jcore.thread;

public class PendingInterrupt {

	public static void main(String[] args) {
		if(args.length > 0) {
			Thread.currentThread().interrupt();
		}
		
		long startTime = System.currentTimeMillis();
		
		try {
			System.out.println("in main() - 休眠3秒");
			Thread.sleep(3000);
			System.out.println("in main() - 休眠3秒结束，休眠时未被中断");
		} catch (InterruptedException e) {
			System.out.println("in main() - 线程被中断");
		}
		
		System.out.println("in main() - 执行时间：" + (System.currentTimeMillis() - startTime));
	}
}
