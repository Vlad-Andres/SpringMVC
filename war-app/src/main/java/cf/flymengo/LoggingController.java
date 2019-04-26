package cf.flymengo; 

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoggingController {
	
	private Logger logger = Logger.getLogger(LoggingController.class);

	@RequestMapping("/logging")
	public ModelAndView toLog() {
		ModelAndView mv = new ModelAndView("logging");
		
		logger.info("This Is An Info Log Entry ......!");
        logger.error("This Is An Error Log Entry ......!");
		
		mv.addObject("message", "Message fo ya"  );
		mv.addObject("name", "name");
		return mv;
	}
}
