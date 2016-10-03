package mysource.demo.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Collection;

import org.apache.commons.lang3.ArrayUtils;

public class ProxyDemo {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		
		// 创建Collection接口的动态代理类
		Class<?> clazz = Proxy.getProxyClass(Collection.class.getClassLoader(), Collection.class);
								
		System.out.println("-------- 动态代理类名称 --------");
		System.out.println(clazz.getName());
		System.out.println();
		
		System.out.println("-------- 代理类构造方法 --------");
		// 获取代理类的构造方法
		Constructor<?>[] constructors = clazz.getConstructors();
		for(Constructor<?> constructor : constructors) {
			// 字符串构造器，非线程安全类，在单线程应用中速度更快（区别于StringBuffer）
			StringBuilder build = new StringBuilder();
			build.append(constructor.getName());
			build.append("(");
			
			Class<?>[] parameters = constructor.getParameterTypes();
			for(Class<?> parameter : parameters) {
				build.append(parameter.getName()).append(",");
			}
			
			if(ArrayUtils.isNotEmpty(parameters)) {
				build.deleteCharAt(build.length() - 1);
			}
			
			build.append(")");			
			
			System.out.println(build.toString());
		}
		
		System.out.println();
		
		System.out.println("-------- 代理类方法 --------");
		Method[] methods = clazz.getMethods();
		for(Method method : methods) {
			// 字符串构造器，非线程安全类，在单线程应用中速度更快（区别于StringBuffer）
			StringBuilder build = new StringBuilder();
			build.append(method.getName());
			build.append("(");
			
			Class<?>[] parameters = method.getParameterTypes();
			for(Class<?> parameter : parameters) {
				build.append(parameter.getName()).append(",");
			}						
			
			if(ArrayUtils.isNotEmpty(parameters)) {
				build.deleteCharAt(build.length() - 1);
			}
			
			build.append(")");
			
			System.out.println(build.toString());
		}
	}

}
