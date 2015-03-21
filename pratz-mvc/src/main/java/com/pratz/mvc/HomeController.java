package com.pratz.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pratz.common.AbstractController;
import com.pratz.logic.service.IService;
import com.pratz.logic.service.Imethod;

@Controller
@RequestMapping("/Test")
public class HomeController extends AbstractController {

	
	@Autowired
	private Imethod imethod;
	@RequestMapping(value = {"/","/Test/"}, method = RequestMethod.GET)
	public String home(Model model) {
		logger.debug("Home Controller {}",imethod.method1());
		return "home";
	}
	

	@RequestMapping(value = {"/test1","/test1/"}, method = RequestMethod.GET)
	public String home1(Model model) {
		logger.debug("Home Controller {}",imethod.method1());
		return "home";
	}
	
}
