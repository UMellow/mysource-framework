package mysource.system.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import mysource.system.entity.Menu;

@Controller
@RequestMapping(value = "/freemarker")
public class TestFreeMarkerController {

	@RequestMapping(value = "/test")
	public ModelAndView test(){

		ModelAndView mv = new ModelAndView();
		mv.addObject("username", "Mrz");
		mv.addObject("booval", Boolean.FALSE);
		mv.setViewName("test");
				
		return mv;		
	}
	
	private List<Menu> getMenus() {
		
		List<Menu> menus = new ArrayList<Menu>();
		
		Menu menu1 = new Menu();
//		menu1.setId(1);
		
		return menus;
	}
}
