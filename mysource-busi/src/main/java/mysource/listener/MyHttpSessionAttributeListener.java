package mysource.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

@WebListener
public class MyHttpSessionAttributeListener implements
		HttpSessionAttributeListener {

	Log log = LogFactory.getLog(getClass());
	
	public void attributeAdded(HttpSessionBindingEvent event) {
		
		HttpSession session = event.getSession();
		String sessionid = session.getId();
		log.info("Session 作用域内添加了名称为 " + event.getName() + "，值为 " + event.getValue() + "的属性. SessionID: " + sessionid);
	}

	public void attributeRemoved(HttpSessionBindingEvent event) {
		
		HttpSession session = event.getSession();
		String sessionid = session.getId();
		log.info("Session 作用域内删除了名称为 " + event.getName() + "，值为 " + event.getValue() + "的属性. SessionID: " + sessionid);
	}

	public void attributeReplaced(HttpSessionBindingEvent event) {
		
		HttpSession session = event.getSession();
		String sessionid = session.getId();
		log.info("Session 作用域内替换了名称为 " + event.getName() + "，值为 " + event.getValue() + "的属性. SessionID: " + sessionid);
	}

}
