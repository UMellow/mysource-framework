package mysource.pattern.creational.singlton;

import mysource.pattern.base.SenderI;

public class SmsSenderSinglton implements SenderI {	
	
	private SmsSenderSinglton() {
		
	}
	
	public static SmsSenderSinglton getInstance() {
		
		return SingltonFactory.instance;
	}
	
	private static class SingltonFactory {
		
		private static SmsSenderSinglton instance = new SmsSenderSinglton();
	}
	
	/**
	 * @see mysource.pattern.base.SenderI#send()
	 */
	public void send() {
		
		System.out.println("send sms with siglton.");
	}

	
}
