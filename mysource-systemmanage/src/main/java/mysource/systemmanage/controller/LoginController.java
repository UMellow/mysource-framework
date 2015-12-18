package mysource.systemmanage.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	
	@RequestMapping( {"/login"} )
	public ModelAndView login(HttpServletRequest req, HttpServletResponse resp){
		
		ModelAndView mv = new ModelAndView("systemmanage/login");
		
		String loginname = req.getParameter("loginname");
		System.out.println(loginname);
		
		mv.addObject("msg", "Hi" + loginname);
		
		return mv;
	}

	private String msg;
	
	@RequestMapping({"/msg"})
	public String testmsg(HttpServletRequest req, HttpServletResponse resp){
		this.msg = "hello";
		
		PrintWriter out = null;
		try {
			out = resp.getWriter();
		} catch (IOException e) {
			e.printStackTrace();
		}

		out.print(msg);
		out.flush();
		out.close();
		
		return null;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
}
