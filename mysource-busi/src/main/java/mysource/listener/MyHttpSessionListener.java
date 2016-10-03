package mysource.listener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class MyHttpSessionListener implements HttpSessionListener {

	public void sessionCreated(HttpSessionEvent se) {
		
		System.out.println("MyHttpSessionListener sessionCreated");
	}

	public void sessionDestroyed(HttpSessionEvent se) {
		
		System.out.println("MyHttpSessionListener sessionDestroyed");
	}

}
