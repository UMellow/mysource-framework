package mysource.listener;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;

public class MyServletRequestAttributeListener implements ServletRequestAttributeListener {

	public void attributeAdded(ServletRequestAttributeEvent srae) {
		
		System.out.println("MyServletRequestAttributeListener attributeAdded");
	}

	public void attributeRemoved(ServletRequestAttributeEvent srae) {
		
		System.out.println("MyServletRequestAttributeListener attributeRemoved");
	}

	public void attributeReplaced(ServletRequestAttributeEvent srae) {
		
		System.out.println("MyServletRequestAttributeListener attributeReplaced");
	}

}
