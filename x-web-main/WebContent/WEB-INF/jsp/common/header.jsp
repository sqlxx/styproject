<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
header

	<c:if test="${not empty user}">
		<div id="welcome">欢迎您：${user.username}</div> <a href="<c:url value='/user/logout'/>">登出</a>
	</c:if>