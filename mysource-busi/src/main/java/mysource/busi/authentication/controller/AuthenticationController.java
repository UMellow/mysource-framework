package mysource.busi.authentication.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mysource.busi.authentication.service.AuthenticationServiceI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONArray;

/**
 * 身份认证信息业务控制层实现
 * 
 * @author zhaoyi
 */
@Controller
@RequestMapping({"/authentication"})
public class AuthenticationController {
	
	@Autowired
	private AuthenticationServiceI authenticationService;
	
	@RequestMapping({"/search"})
	@ResponseBody
	public JSONArray forSearchAuthentication(HttpServletRequest req, HttpServletResponse resp) {
		
		System.out.println("into search method...");
		JSONArray jsonArray = authenticationService.searchAuthentication();
		System.out.println(jsonArray.toJSONString());
		
		return jsonArray;
	}
	
	@RequestMapping({"/search2"})
	public String forSearchAuthentication2(HttpServletRequest req, HttpServletResponse resp) {
		
		System.out.println("into search method2...");
		JSONArray jsonArray2 = authenticationService.searchAuthentication();
		System.out.println(jsonArray2.toJSONString());
		
		return "authentication/searchAuthenticationPage";
	}

	@RequestMapping({"/search1"})
	@ResponseBody
	public ModelAndView forSearchAuthentication1(HttpServletRequest req, HttpServletResponse resp) {
		
		System.out.println("into search1 method...");
		JSONArray jsonArray = authenticationService.searchAuthentication();
		System.out.println(jsonArray.toJSONString());
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("jsonArray", jsonArray);
		mv.setViewName("authentication/searchAuthenticationPage");
		
		return mv;
	}
	
	@RequestMapping({"/HelloVelocity"})
	public ModelAndView HelloVelocity(HttpServletRequest req, HttpServletResponse resp) {
		
		System.out.println("into HelloVelocity method...");
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("jsonArray", "hello velocity");
		mv.setViewName("authentication/searchAuthenticationPage");
		
		return mv;
	}
}
