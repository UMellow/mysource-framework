package mysource.spring.extension.aware;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component("myApplicationContextAware")
public class MyApplicationContextAware implements ApplicationContextAware {

	private ApplicationContext applicationContext;
	
	@Override
	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		this.applicationContext = applicationContext;
		printBeanNames();
	}
	
	public void printBeanNames(){
		
		String[] beans = applicationContext.getBeanDefinitionNames();
		for(String bean : beans){
			System.out.println(bean);
		}
	}

}
