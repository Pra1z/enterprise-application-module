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
<c:set var="homeForm" value="${homeForm}"></c:set>
<c:set var="error" value="${requestScope['error']}"></c:set>
<% 
Logger logger = LoggerFactory.getLogger(getClass());
Enumeration<String> e = request.getParameterNames();
while (e.hasMoreElements()) {
	String key = e.nextElement();
	System.out.println(getClass()+"JSP---------------Home     "+key + " : " + request.getParameter(key));
	//logger.debug("request{} "+request.getParameterNames());
}
%>
<form:form method="POST" action="${pageContext.request.contextPath}/OTH999999/process/" commandName="homeForm" >
<form:errors path="*"/>
<h1>Home</h1>
<img src="${pageContext.request.contextPath}/resources/img/Test.jpg" />
<div id="messages">
	<c:if test="${not empty error}">
		<p>
			<fmt:message key="${error}" />
			<spring:message ></spring:message>
		</p>
	</c:if>

	<spring:hasBindErrors name="address">
		<h2>Errors</h2>
		<div class="formerror">
			<ul>
				<c:forEach var="error" items="${errors.allErrors}">
					<li>${error.defaultMessage}</li>
				</c:forEach>
			</ul>
		</div>
	</spring:hasBindErrors>
</div>
<form:input path="homeName"/>
<form:errors path="homeName" htmlEscape="true"></form:errors>
<form:input path="homeNumber"/>
<form:button value="submit"></form:button>
<br/>
</form:form>
