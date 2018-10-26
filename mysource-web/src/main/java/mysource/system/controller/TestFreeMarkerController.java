package mysource.system.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import mysource.system.entity.Menu;

@Controller
@RequestMapping(value = "/freemarker")
public class TestFreeMarkerController {

	@RequestMapping(value = "/test")
	public String test(Model model, HttpServletRequest request){
		
		model.addAttribute("menuname1", "独立菜单");
		model.addAttribute("booval", Boolean.FALSE);
		
		List<Menu> menus = getMenus();
		model.addAttribute("treemenus", menus);
		
		String res = request.getParameter("p");
		if (StringUtils.isNotBlank(res)) {
			request.getSession().setAttribute("res", res);
		}
		String cur = request.getParameter("t");
		if (StringUtils.isNotBlank(cur)) {
			request.getSession().setAttribute("cur", cur);
		}		
				
		return "index1";		
	}
	
	private List<Menu> getMenus() {
		
		List<Menu> menus = new ArrayList<>();
		
		Menu menu1 = new Menu();
		menu1.setName("MySQL监控11");
		
		Menu menu2 = new Menu();
		menu2.setName("Redis");
		
		Menu menu3 = new Menu();
		menu3.setName("Kafka");
		
		Menu child3_1 = new Menu();
		child3_1.setName("topic");
		
		Menu child3_2 = new Menu();
		child3_2.setName("Consumer Group");
		
		List<Menu> childs3 = new ArrayList<>();
		childs3.add(child3_1);
		childs3.add(child3_2);
		menu3.setChilds(childs3);
		
		menus.add(menu1);
		menus.add(menu2);
		menus.add(menu3);
		return menus;
	}
}
