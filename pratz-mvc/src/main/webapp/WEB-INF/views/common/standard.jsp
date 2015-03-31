<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<html>
    <head>
        <title>Home</title>
        <script src="<c:url value='/resources/js/common-dataTables.js' />" type="text/javascript"></script>
        <link href="<c:url value='/resources/js/jqueryui/css/jquery-ui.css' />" type="text/css" rel="stylesheet">
    </head>
    <body>
        <img src="${pageContext.request.contextPath}/resources/img/Test.jpg" />
        <tiles:insertAttribute name="content" />
    </body>
</html>
