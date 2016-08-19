package mysource.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

public class MyServletRequestListener implements ServletRequestListener {

	public void requestDestroyed(ServletRequestEvent sre) {
		
		System.out.println("MyServletRequestListener requestDestroyed");
	}

	public void requestInitialized(ServletRequestEvent sre) {
		
		System.out.println("MyServletRequestListener requestInitialized");
	}

}
