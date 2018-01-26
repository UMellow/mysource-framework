package mysource.system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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
}
