package com.pratz.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pratz.common.AbstractController;

@Controller
public class HomeController extends AbstractController {

	@RequestMapping(value = {"/"}, method = RequestMethod.GET)
	public String home(Model model) {
		logger.info("Home Controller");
		return "home";
	}
	
}
