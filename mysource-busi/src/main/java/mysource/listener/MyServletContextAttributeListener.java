package mysource.listener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.annotation.WebListener;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

@WebListener
public class MyServletContextAttributeListener implements
		ServletContextAttributeListener {

	Log log = LogFactory.getLog(getClass());
	
	public void attributeAdded(ServletContextAttributeEvent event) {
		
		log.info("Application 作用域内添加了名称为 " + event.getName() + "，值为 " + event.getValue() + "的属性.");
	}

	public void attributeRemoved(ServletContextAttributeEvent event) {
		
		log.info("Application 作用域内删除了名称为 " + event.getName() + "，值为 " + event.getValue() + "的属性.");
	}

	public void attributeReplaced(ServletContextAttributeEvent event) {
		
		log.info("Application 作用域内更新了名称为 " + event.getName() + "，值为 " + event.getValue() + "的属性.");
	}

}
