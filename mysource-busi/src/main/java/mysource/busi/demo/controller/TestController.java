package mysource.busi.demo.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
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
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	@RequestMapping( { "/cache" } )
	public ResponseEntity<String> cache(
			HttpServletRequest request, 
			// 为了测试方便，此处传入文档最后修改时间
			@RequestParam("millis") long lastModifiedMillis,
			// 使用该参数验证文档的最后修改时间
			@RequestHeader(value = "If-Modified-Since", required = false) Date ifModifiedSince) {
		
		long now = System.currentTimeMillis();	
		long maxAge = 20;
		
		if(ifModifiedSince != null && lastModifiedMillis == ifModifiedSince.getTime()) {
			return new ResponseEntity<String>(HttpStatus.NOT_MODIFIED);
		}
		
		DateFormat gmtFormatter = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss 'GMT'", Locale.US);
		
		MultiValueMap<String, String> headers = new HttpHeaders();
		// 系统当前时间
		headers.add(HttpHeaders.DATE, gmtFormatter.format(new Date(now)));
		// 文档修改时间
		headers.add(HttpHeaders.LAST_MODIFIED, gmtFormatter.format(new Date(now)));
		// 文档过期时间（秒），http1.0支持
		headers.add(HttpHeaders.EXPIRES, gmtFormatter.format(new Date(now + maxAge)));
		// 文档缓存时间（秒），http1.1支持
		headers.add(HttpHeaders.CACHE_CONTROL, "max-age=" + maxAge);
				
		String body = "<a href=''>点击这个链接</a>";
		return new ResponseEntity<String>(body, headers, HttpStatus.OK);
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
