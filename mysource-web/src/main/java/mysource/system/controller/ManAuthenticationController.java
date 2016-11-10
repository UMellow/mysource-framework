package mysource.system.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/system/auth")
public class ManAuthenticationController {
	
	public ManAuthenticationController() {
		System.out.println("rest 风格的请求，请求参数为 =============================");
	}
	
	private static final Log log = LogFactory.getLog(ManAuthenticationController.class);
	
	@RequestMapping(value = "/detail/{id}")
	public ModelAndView detail(@PathVariable int id){
		
		log.info("rest 风格的请求，请求参数为" + id);
		
		return null;		
	}
}
