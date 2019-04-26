package cf.flymengo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestingContrloer {
	
	@RequestMapping("/testingJAR")
	public ModelAndView helloWorld() {
		String message = "<br><div style='text-align:center;'>"
				+ "<h3>********** Hello World, Spring MVC Tutorial</h3>This message is coming fro JAAAAAAAAAAAAAAR **********</div><br><br>";
		return new ModelAndView("testing", "message", message);
	}
}
