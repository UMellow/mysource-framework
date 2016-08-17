package mysource.busi.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * 切面类，定义对目标方法的增强处理
 * 
 * @author 
 */
@Component
@Aspect
public class UserServiceAspect {

	/**
	 * 定义切入点，此处匹配 UserServiceI 类中的所有方法
	 */
	@Pointcut("execution(* mysource..*.*(..))")
	public void pointcut() {}
	
	@Before("pointcut()")
	public void before() {
		System.out.println("Before Advice");
	}
	
	@Around("pointcut()")
	public void around(ProceedingJoinPoint proceed) throws Throwable {
		System.out.println("Around Advice before");
		// around 通知中，调用 proceed()，才会执行目标方法
		proceed.proceed();
		System.out.println("Around Advice after");
	}
	
	@After("pointcut()")
	public void after() {
		System.out.println("After Advice");
	}
	
	@AfterReturning(pointcut="pointcut()", returning="returning")
	public void afterReturning(Object returning) {
		System.out.println("AfterReturning Advice");
	}
	
	@AfterThrowing(pointcut="pointcut()", throwing="error")
	public void afterThrowing(Throwable error) {
		System.out.println("AfterThrowing Advice");
	}
}
