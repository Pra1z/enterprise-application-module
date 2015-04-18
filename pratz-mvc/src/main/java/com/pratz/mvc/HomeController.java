package com.pratz.mvc;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.pratz.common.AbstractController;
import com.pratz.form.HomeForm;

@Controller
@RequestMapping("/OTH999999")
public class HomeController extends AbstractController {
	
	
	
	

	
	@RequestMapping( method = RequestMethod.GET)
	public String home(Model model) {
		return "home";
	}

	@RequestMapping(value = { "/process", "/process/" }, method = RequestMethod.POST)
	public String home1(@Valid @ModelAttribute HomeForm homeForm, BindingResult result, Model model,RedirectAttributes ra) {
		
		if(result.hasErrors()){
			model.addAttribute("error", "error");
			logger.error("error");
			return "home";
		}
		logger.debug("no error");
		
		result.rejectValue("homeName","555555");
		
		return "redirect:/OTH777777";
	}

	@ModelAttribute
	public HomeForm HomeForm(HttpServletRequest request, Model model) {
		   for (Method method : this.getClass().getDeclaredMethods()) {
		          for (Annotation a : method.getAnnotations()) {
		        	  System.out.println(method);
		          }
		     }
		Enumeration<String> e = request.getParameterNames();
		while (e.hasMoreElements()) {
			String key = e.nextElement();
			System.out.println(" Pratzzaaaaaaaaaaaaaaaa================="+key + " : " + request.getParameter(key));
			model.addAttribute("key", request.getParameter(key));
		}
		
		HomeForm homeForm  = new HomeForm();
		logger.error("New HomeForm : {}",homeForm);
		return homeForm;
	}
	
	

}
