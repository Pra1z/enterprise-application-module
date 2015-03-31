package com.pratz.mvc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pratz.common.AbstractController;


@Controller
@RequestMapping("/OTH777777")
public class ConfirmResultController extends AbstractController {
	

	
	@RequestMapping(value = { "/", "/OTH777777/" }, method = RequestMethod.GET)
	public String confirmResult(Model model) {
		logger.debug("ConfirmResult Controller");
		return "confirmResult";
	}
}
