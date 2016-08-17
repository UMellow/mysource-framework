package mysource.busi.demo.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mysource.busi.aop.UserServiceI;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping( { "/testController" } )
public class TestController {
	
	@Autowired
	private UserServiceI userService;

	@RequestMapping( { "/test" } )
	@ResponseBody
	public String test() {
	
		userService.addUser();
		return "success";
	}
	
	@RequestMapping( { "/cookieAndSession" } )
	@ResponseBody
	public String cookieAndSession(HttpServletRequest request, HttpServletResponse response) {
	
		Cookie[] cookies = request.getCookies();
		
		if(cookies == null) {
			response.addCookie(new Cookie("username", "zhaoyi@300.cn"));
		} else {
			String username = StringUtils.EMPTY;
			
			for(Cookie cookie : cookies) {
				if(StringUtils.equals("username", cookie.getName())) {
					username = cookie.getValue();
					response.addCookie(new Cookie("username", "zhaoyi_new@300.cn"));
					break;
				}
			}
			
			if(StringUtils.isEmpty(username)) {
				response.addCookie(new Cookie("username", "zhaoyi@300.cn"));
			}
		}		
		
//		response.getHeaders("Set-Cookie");
		
		return "success";
	}
	
	
}
