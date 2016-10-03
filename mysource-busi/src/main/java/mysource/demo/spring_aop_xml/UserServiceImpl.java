package mysource.demo.spring_aop_xml;

import org.springframework.stereotype.Service;

//@Service("userService")
public class UserServiceImpl implements UserServiceI {

	public void addUser() {
		
		System.out.println("UserServiceImpl.addUser()");
	}

}
