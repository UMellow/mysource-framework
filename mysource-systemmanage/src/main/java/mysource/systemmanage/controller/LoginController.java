package mysource.systemmanage.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mysource.core.util.WebUtil;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;

@Controller
@RequestMapping({"/systemmanage"})
public class LoginController {
	
	@RequestMapping( {"/login"} )
	public ModelAndView login(HttpServletRequest req, HttpServletResponse resp){
		
		/*ModelAndView mv = new ModelAndView("systemmanage/login");
		
		String loginname = req.getParameter("loginname");
		System.out.println(loginname);
		
		mv.addObject("msg", "Hi" + loginname);
		
		return mv;*/

		System.out.println("login...");
		return null;
	}
	
	@RequestMapping({"/msg"})
	public String testmsg(HttpServletRequest req, HttpServletResponse resp){
		List<Object> topColl = new ArrayList<Object>();
		List<Object> leftFirstColl = new ArrayList<Object>();
		List<Map<String, String>> leftSecondColl = new ArrayList<Map<String, String>>();
		
		Map<String, String> leftSecondMap = new HashMap<String, String>();
		leftSecondMap.put("menuname", "Order List");
		leftSecondColl.add(leftSecondMap);
		
		Map<String, Object> leftFirstMap = new HashMap<String, Object>();
		leftFirstMap.put("menuname", "Order Manage");
		leftFirstMap.put("submenu", leftSecondColl);
		leftFirstColl.add(leftFirstMap);
		
		Map<String, Object> menuTopMap = new HashMap<String, Object>();
		menuTopMap.put("menuname", "Order Subsys");
		menuTopMap.put("submenu", leftFirstColl);
		topColl.add(menuTopMap);
		
		System.out.println(JSON.toJSONString(topColl));
		WebUtil.writeToWeb(resp, JSON.toJSONString(topColl));
		
		return null;
	}
}
