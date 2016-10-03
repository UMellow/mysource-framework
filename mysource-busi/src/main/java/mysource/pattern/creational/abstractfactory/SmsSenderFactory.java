package mysource.pattern.creational.abstractfactory;

import mysource.pattern.base.AbstractSender;
import mysource.pattern.base.SmsSender;
import mysource.pattern.creational.singlton.SmsSenderSinglton;

public class SmsSenderFactory implements SenderProvider {

	public AbstractSender produceSender() {
		
		return new SmsSender();
	}
	
	public AbstractSender produceSenderSington() {
		
		return SmsSenderSinglton.getInstance();
	}

}
