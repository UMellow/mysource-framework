package mysource.pattern.structural.adapter;

import mysource.pattern.base.AbstractSender;
import mysource.pattern.base.MailMsg;
import mysource.pattern.creational.abstractfactory.MailSenderFactory;
import mysource.pattern.creational.abstractfactory.SenderProvider;

public class MailSenderAdapter {

	SenderProvider provider = new MailSenderFactory();
	private AbstractSender sender = provider.produceSender();
	
	public String[] sendMail() {
		
		sender.sendMail(new MailMsg());		
		return new String[]{};
	}
}
