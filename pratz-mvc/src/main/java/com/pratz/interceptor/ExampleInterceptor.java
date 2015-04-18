package com.pratz.interceptor;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class ExampleInterceptor implements HandlerInterceptor {

	@Override
	public void afterCompletion(HttpServletRequest arg0,

	HttpServletResponse arg1, Object arg2, Exception arg3)

	throws Exception {

		System.out.println("After Completion : " + new Date());

	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,

	Object arg2, ModelAndView arg3) throws Exception {

		System.out.println("PostHandle: " + new Date());

	}

	@Override
	public boolean preHandle(HttpServletRequest arg0, HttpServletResponse arg1,

	Object arg2) throws Exception {

		System.out.println("PreHandle: " + new Date());

		return true;

	}

}
