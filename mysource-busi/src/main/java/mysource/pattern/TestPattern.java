package mysource.pattern;

import mysource.pattern.creational.abstractfactory.MailSenderFactory;
import mysource.pattern.creational.abstractfactory.SenderProvider;
import mysource.pattern.creational.abstractfactory.SmsSenderFactory;
import mysource.pattern.creational.abstractfactory.SmsSenderFactorySinglton;
import mysource.pattern.creational.factory.SenderFactory;

import org.junit.Test;

public class TestPattern {

	@Test
	public void testFactory() {
		
		SenderFactory.produceMailSender().send();
		SenderFactory.produceSMSSender().send();
	}
	
	@Test
	public void testAbstractFactory() {
		
		SenderProvider mailSenderProvider = new MailSenderFactory();
		mailSenderProvider.produceSender().send();
		
		SenderProvider smsSenderProvider = new SmsSenderFactory();
		smsSenderProvider.produceSender().send();
	}
	
	@Test
	public void testSmsSenderSinglton() {
		
		SenderProvider smsSenderProvider = new SmsSenderFactorySinglton();
		SenderProvider smsSenderProvider1 = new SmsSenderFactorySinglton();
		
		smsSenderProvider.produceSender().send();
		smsSenderProvider1.produceSender().send();
	}

}
