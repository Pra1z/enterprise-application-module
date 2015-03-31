package com.pratz.error;

import javax.servlet.http.HttpServletRequest;

import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

import com.pratz.common.AbstractController;

@ControllerAdvice
public class GlobalExceptionHandlerController extends AbstractController {
	
	
	private static final String DEFAULT_ERROR_VIEW	= "/error/view";

	  @ExceptionHandler(value = Exception.class)
	    public ModelAndView defaultErrorHandler(HttpServletRequest request, Exception e,Model model) throws Exception {
		  logger.error("GlobalExceptionHandlerController : Exception{} , model {}, request {}",e,model,request); 
		  if (AnnotationUtils.findAnnotation(e.getClass(), ResponseStatus.class) != null)
	            throw e;
	        
	        ModelAndView mav = new ModelAndView();
	        model.addAttribute("messageCode", request.getAttribute("javax.servlet.error.status_code"));
			model.addAttribute("message", request.getAttribute("javax.servlet.error.message"));
			model.addAttribute("exception", request.getAttribute("javax.servlet.error.exception"));
			model.addAttribute("requestUri", request.getAttribute("javax.servlet.error.request_uri"));
	        mav.setViewName(DEFAULT_ERROR_VIEW);
	        logger.error("GlobalExceptionHandlerController---> default error view  : Exception{} , model {}, request {}",e,model,request);
	        return mav;
	  }
}
