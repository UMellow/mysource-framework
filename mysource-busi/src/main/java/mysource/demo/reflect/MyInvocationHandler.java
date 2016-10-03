package mysource.demo.reflect;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 自定义InvocationHandler类;
 * public作用域的构造方法，用于注册委托对象；
 * invoke()方法，实现自InvocationHandler接口，用于执行目标对象的方法；
 * getProxy()方法，用于获取委托类的代理对象；
 */
public class MyInvocationHandler implements InvocationHandler {
	
	/** 委托对象 */
	private Object target;
	
	public MyInvocationHandler(Object target) {
		super();
		this.target = target;
	}

	/**
	 * 执行目标对象的方法
	 * 
	 * @param proxy
	 * 			代理对象
	 * @param method
	 * 			委托对象方法
	 * @param args
	 * 			参数
	 */
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		
		System.out.println("-------- Invoke Before --------");
		return method.invoke(target, args);		
	}
	
	/**
	 * 获取委托类的代理对象
	 * 
	 * @return 代理对象
	 */
	public Object getProxy() {
		
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
	}

}
