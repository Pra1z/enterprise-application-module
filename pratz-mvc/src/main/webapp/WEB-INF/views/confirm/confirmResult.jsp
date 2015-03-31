<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"
	language="java"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@page import="org.slf4j.*" %>
<%@page import="java.util.*" %>

<% 
Logger logger = LoggerFactory.getLogger(getClass());
Enumeration<String> e = request.getParameterNames();
while (e.hasMoreElements()) {
	String key = e.nextElement();
	System.out.println("JSP------------ConfirmResult             "+key + " : " + request.getParameter(key));
	//logger.debug("request{} "+request.getParameterNames());
}
%>