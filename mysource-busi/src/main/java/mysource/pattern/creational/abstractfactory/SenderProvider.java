package mysource.pattern.creational.abstractfactory;

import mysource.pattern.base.AbstractSender;

public interface SenderProvider {

	public AbstractSender produceSender();
}
