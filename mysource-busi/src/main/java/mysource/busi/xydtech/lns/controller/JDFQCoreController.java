package mysource.busi.xydtech.lns.controller;

import com.alibaba.fastjson.JSON;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mysource.busi.xydtech.lns.service.LoanQueryServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class JDFQCoreController {

	@Autowired
	private LoanQueryServiceI loanQueryService;

	@RequestMapping({ "/sayHello" })
	public ModelAndView handleRequest(HttpServletRequest req,
			HttpServletResponse resp) throws Exception {
		ModelAndView mv = new ModelAndView();

		mv.addObject("message", "Hello World!");

		mv.setViewName("hello");
		return mv;
	}

	@RequestMapping({ "/showLogin" })
	public String showLogin(HttpServletRequest req, HttpServletResponse resp)
			throws Exception {
		System.out.println("I am into showLogin");
		return "systemmanage/login1";
	}

	@RequestMapping({ "/getData1" })
	public String getData1(HttpServletRequest req, HttpServletResponse resp)
			throws Exception {
		System.out.println("I am into getData1");

		List list = new ArrayList();

		Map map1 = new HashMap();
		map1.put("name", "Mr.zhao");
		map1.put("sex", "female");
		map1.put("age", "23");
		list.add(map1);

		Map map2 = new HashMap();
		map2.put("name", "Edward");
		map2.put("sex", "male");
		map2.put("age", "24");
		list.add(map2);

		String jsonStr = JSON.toJSONString(list);

		System.out.println("jsonArr: " + jsonStr);

		PrintWriter out = null;
		try {
			out = resp.getWriter();
		} catch (IOException e) {
			e.printStackTrace();
		}

		out.print(jsonStr);
		out.flush();
		out.close();

		return null;
	}
}
