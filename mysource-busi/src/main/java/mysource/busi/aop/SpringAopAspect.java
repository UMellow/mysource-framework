package mysource.busi.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class SpringAopAspect {

	@Pointcut(value = "execution(* mysource.busi.aop.*.*(..))")
	public void aspectPointcut(){}
	
	@Before(value = "aspectPointcut()")
	public void aspectAdvice() {
		System.out.println("Aspect Weaver!");
	}
}
