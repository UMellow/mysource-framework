package mysource.pattern.creational.factory;

import mysource.pattern.base.MailSender;
import mysource.pattern.base.SenderI;
import mysource.pattern.base.SmsSender;

/**
 * 使用设计的模式，可以使代码易于扩展，增强其可维护性；
 * 工厂方法模式的缺点：当增加新的创建类型时，需修改工厂类，破坏了设计原则中的“开闭原则”。
 * 
 * @author zhaoyi 
 * @date 2016年8月22日 上午10:30:20
 */
public class SenderFactory {

	public static SenderI produceMailSender() {
		
		return new MailSender();
	}
	
	public static SenderI produceSMSSender() {
		
		return new SmsSender();
	}
}
