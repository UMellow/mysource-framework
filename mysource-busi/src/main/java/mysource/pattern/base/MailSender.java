package mysource.pattern.base;

public class MailSender extends AbstractSender {

	@Override
	public void sendMail(MailMsg mailMsg) {
		
		System.out.println("customer process for sendMail");
		super.sendMail(mailMsg);
	}
}
