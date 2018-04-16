package mysource.classloader;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;

public class ClassLoaderTest {

	public static void main(String[] args) {
		
		DiskClassLoader loader = new DiskClassLoader("D:\\lib");
		
		try {
			Class clazz = loader.loadClass("mysource.classloader.HelloWorld");
			
			if(clazz != null) {
				Object object = clazz.newInstance();
				
				System.out.println(object.getClass().getClassLoader());

				Method method = clazz.getDeclaredMethod("say", null);
				method.invoke(object, null);
			} else {
				System.out.println("加载类失败.");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		/*System.out.println(StringUtils.class.getClassLoader());
		System.out.println(ClassLoaderTest.class.getClassLoader());*/
		
		
		
		/*Properties properties = System.getProperties();*/		
		
		/*properties.list(System.out);*/
		
		/*Set<Entry<Object, Object>> entrys = properties.entrySet();
		Iterator<Entry<Object, Object>> iterator = entrys.iterator();
		while(iterator.hasNext()) {
			Entry<Object, Object> entry = iterator.next();
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}*/
	}
}
