package mysource.pattern;

import mysource.pattern.base.MailMsg;
import mysource.pattern.base.SmsMsg;
import mysource.pattern.creational.abstractfactory.MailSenderFactory;
import mysource.pattern.creational.abstractfactory.SenderProvider;
import mysource.pattern.creational.abstractfactory.SmsSenderFactory;
import mysource.pattern.creational.abstractfactory.SmsSenderFactorySinglton;
import mysource.pattern.creational.factory.SenderFactory;

import org.junit.Test;

public class TestPattern {

	@Test
	public void testFactory() {
		
		SenderFactory.produceMailSender().sendMail(new MailMsg());
		SenderFactory.produceSMSSender().sendSms(new SmsMsg());
	}
	
	@Test
	public void testAbstractFactory() {
		
		SenderProvider mailSenderProvider = new MailSenderFactory();
		mailSenderProvider.produceSender().sendMail(new MailMsg());
		
		SenderProvider smsSenderProvider = new SmsSenderFactory();
		smsSenderProvider.produceSender().sendSms(new SmsMsg());
	}
	
	@Test
	public void testSmsSenderSinglton() {
		
		SenderProvider smsSenderProvider = new SmsSenderFactorySinglton();
		SenderProvider smsSenderProvider1 = new SmsSenderFactorySinglton();
		
		smsSenderProvider.produceSender().sendSms(new SmsMsg());
		smsSenderProvider1.produceSender().sendSms(new SmsMsg());
	}

}
