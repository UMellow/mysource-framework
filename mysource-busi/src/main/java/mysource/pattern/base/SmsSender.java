package mysource.pattern.base;

public class SmsSender extends AbstractSender {

	@Override
	public void sendSms(SmsMsg smsMsg) {
		
		System.out.println("customer process for sendSms");
		super.sendSms(smsMsg);
	}

}
