package mysource.pattern.base;

public abstract class AbstractSender {

	public void sendMail(MailMsg mailMsg) {
		
		System.out.println("base sendMail method");
	}
	
	public void sendSms(SmsMsg smsMsg) {
		
		System.out.println("base sendSms method");
	}
}
