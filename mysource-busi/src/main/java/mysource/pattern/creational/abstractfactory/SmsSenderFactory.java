package mysource.pattern.creational.abstractfactory;

import mysource.pattern.base.SenderI;
import mysource.pattern.base.SmsSender;
import mysource.pattern.creational.singlton.SmsSenderSinglton;

public class SmsSenderFactory implements SenderProvider {

	public SenderI produceSender() {
		
		return new SmsSender();
	}
	
	public SenderI produceSenderSington() {
		
		return SmsSenderSinglton.getInstance();
	}

}
