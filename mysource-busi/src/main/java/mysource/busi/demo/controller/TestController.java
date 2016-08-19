package mysource.busi.demo.controller;

import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import mysource.busi.aop.UserServiceI;
import mysource.core.util.WebUtil;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping( { "/testController" } )
public class TestController {
	
	Log log = LogFactory.getLog(getClass());
	
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
	
	@RequestMapping( { "/getHttpHeads" } )
	@ResponseBody
	public Map<String, String> getHttpHeads(HttpServletRequest request) {
		
		return WebUtil.getHttpHeads(request);
	}
	
	@RequestMapping( { "/mylistener" } )
	@ResponseBody
	public String myListener(HttpServletRequest request, HttpServletResponse response) {
		
		ServletContext context = request.getServletContext();
		
		/*context.setAttribute("flag", "add flag");
		context.setAttribute("flag", "add flag");
		context.removeAttribute("flag");*/
		
		HttpSession session = request.getSession();
		log.info(session.getId());
		
//		Cookie cookie = new Cookie();
		
		Cookie[] cookies = request.getCookies();
		for(Cookie cookie : cookies) {
			log.info("Cookie name: " + cookie.getName() + ", Cookie Value: " + cookie.getValue() + ", Domain: " + cookie.getDomain());
		}		
		
		session.setAttribute("flag", "session flag");
		
		return "success";
	}
	
}
