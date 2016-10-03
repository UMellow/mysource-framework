package mysource.demo.reflect;

/**
 * Java 数据类型相关的面试考点记录
 * 
 * @author zhaoyi
 */
public class DataTypesDemo {

	public void method1() {
		
		byte a = 127;
		byte b = 127;
				
		System.out.println(b += a);
	}
	
	public static void main(String[] args) {
		
		DataTypesDemo demo = new DataTypesDemo();
		demo.method1();
	}

}
