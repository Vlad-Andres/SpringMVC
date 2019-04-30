package cf.flymengo;

import java.security.Principal;
import java.security.Provider.Service;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LogInController {
	
	LogInService Service = new LogInService();
//	
//	@RequestMapping(value="/toLogIn", method=RequestMethod.POST)
//	public String printWelcome(ModelMap modelMap, Principal principal) {
//		System.out.println("**************************CONTROLER");
//		String name =principal.getName();
//		modelMap.addAttribute("username",name);
//		modelMap.addAttribute("message", "Spring Security special generated custom automatization automatizated form created");
//		return "welcome";
//	}
//	
//	@RequestMapping(value="/toLogIn", method = RequestMethod.GET)
//	public String showLoginPage() {
//		return "login";
//	}
//	
	@RequestMapping(value="/login", method = RequestMethod.POST)
	public String handleLoginRequest(@RequestParam String username, @RequestParam String password, ModelMap model){
		if(!Service.validateUser(username, password)) {
			model.put("errorMessage","Invalid username or password");
			return "login";
		}
			model.put("name", username);
			return "welcome";
	}
	
	@RequestMapping("/logind")
	public ModelAndView helloWorld() 
	{
	
		ModelAndView mv = new ModelAndView("login");
		return mv;
	}
	
	

}
