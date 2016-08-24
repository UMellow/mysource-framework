package mysource.pattern.creational.abstractfactory;

import mysource.pattern.base.SenderI;
import mysource.pattern.creational.singlton.SmsSenderSinglton;

public class SmsSenderFactorySinglton implements SenderProvider {

	public SenderI produceSender() {
		
		SmsSenderSinglton singlton = SmsSenderSinglton.getInstance();
		System.out.println(singlton);
		return singlton;
	}

}
