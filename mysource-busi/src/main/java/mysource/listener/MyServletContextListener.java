package mysource.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class MyServletContextListener implements ServletContextListener {

	Log log = LogFactory.getLog(getClass());
	
	public void contextInitialized(ServletContextEvent sce) {

		log.info("MyServletContextListener contextInitialized.");
	}

	public void contextDestroyed(ServletContextEvent sce) {
		
		System.out.println("MyServletContextListener contextDestroyed");
	}

}
