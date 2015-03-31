package com.pratz.error;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.pratz.common.AbstractController;

@Controller
@RequestMapping("/error")
public class ErrorController extends AbstractController{

	@RequestMapping("/view")
	public String view(@RequestParam String messageCode, HttpServletRequest request,Model model) {
		
		
		
		model.addAttribute("statusCode", request.getAttribute("javax.servlet.error.status_code"));
		model.addAttribute("message", request.getAttribute("javax.servlet.error.message"));
		model.addAttribute("exception", request.getAttribute("javax.servlet.error.exception"));
		model.addAttribute("requestUri", request.getAttribute("javax.servlet.error.request_uri"));
		
		logger.error("ErrorController : messageCode{} , model {}, request {}",messageCode,model,request);
		return "error";
	}

}