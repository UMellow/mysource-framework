package mysource.pattern.creational.singlton;

import mysource.pattern.base.AbstractSender;
import mysource.pattern.base.SmsMsg;

public class SmsSenderSinglton extends AbstractSender {	
	
	private SmsSenderSinglton() {
		
	}
	
	public static SmsSenderSinglton getInstance() {
		
		return SingltonFactory.instance;
	}
	
	private static class SingltonFactory {
		
		private static SmsSenderSinglton instance = new SmsSenderSinglton();
	}
	
	@Override
	public void sendSms(SmsMsg smsMsg) {
		
		super.sendSms(smsMsg);
	}

	
}
