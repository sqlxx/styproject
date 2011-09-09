<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<div id="main_panel">
	<c:if test="${not empty message}">
		<div id="message" class="${message.type}">${message.text}</div>	
	</c:if>

	嘿嘿	
</div>
