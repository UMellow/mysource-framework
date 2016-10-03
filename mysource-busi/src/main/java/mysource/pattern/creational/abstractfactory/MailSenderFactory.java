package mysource.pattern.creational.abstractfactory;

import mysource.pattern.base.AbstractSender;
import mysource.pattern.base.MailSender;

/**
 * 
 * @author zhaoyi 
 * @date 2016年8月22日 上午10:55:30
 */
public class MailSenderFactory implements SenderProvider {

	/**
	 * @see mysource.pattern.creational.abstractfactory.SenderProvider#produceSender()
	 */
	public AbstractSender produceSender() {
		
		return new MailSender();
	}

}
