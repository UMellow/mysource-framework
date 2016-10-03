package mysource.demo.spring_aop_xml;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

/**
 * 切面类，定义对目标方法的增强处理
 * 
 * @author 
 */
//@Component("userServiceAspect")
public class UserServiceAspect {

	public void before() {
		System.out.println("Before Advice");
	}
	
	public void around(ProceedingJoinPoint proceed) throws Throwable {
		System.out.println("Around Advice before");
		proceed.proceed();
		System.out.println("Around Advice after");
	}
	
	public void after() {
		System.out.println("After Advice");
	}
	
	public void afterReturning() {
		System.out.println("AfterReturning Advice");
	}
	
	public void afterThrowing() {
		System.out.println("AfterThrowing Advice");
	}
}
