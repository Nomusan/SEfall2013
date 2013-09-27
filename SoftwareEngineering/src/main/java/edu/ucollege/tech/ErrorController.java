package edu.ucollege.tech;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class ErrorController {

	private static final Logger logger = LoggerFactory.getLogger(ErrorController.class);
	
	@RequestMapping(value = "/error", method = RequestMethod.GET)
	public String error(Model model){	
		logger.info("404 error found");
		return "error";
	}
}
