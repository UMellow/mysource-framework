package mysource.demo.reflect;

public class TestProxy {

	public static void main(String[] args) {
		
		UserServiceImpl userServiceImpl = new UserServiceImpl();		
		MyInvocationHandler myInvocationHandler = new MyInvocationHandler(userServiceImpl);
		
		UserService proxy = (UserService) myInvocationHandler.getProxy();
		proxy.add();
	}

}
