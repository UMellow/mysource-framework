package mysource.pattern.creational.abstractfactory;

import mysource.pattern.base.AbstractSender;
import mysource.pattern.creational.singlton.SmsSenderSinglton;

public class SmsSenderFactorySinglton implements SenderProvider {

	public AbstractSender produceSender() {
		
		SmsSenderSinglton singlton = SmsSenderSinglton.getInstance();
		System.out.println(singlton);
		return singlton;
	}

}
