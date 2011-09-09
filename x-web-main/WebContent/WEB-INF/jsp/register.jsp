<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<div id="register_panel">
	<c:if test="${not empty message}">
		<div id="message" class="${message.type}">${message.text}</div>	
	</c:if>
	
	<form:form id="register_form" modelAttribute="userRegForm" method="post" >
		<fieldset>
			<form:label path="username">用户名：
				<form:errors path="username" cssClass="error"/>
			</form:label>
			<form:input path="username" />
		    <form:label path="email">Email地址：
		    	<form:errors path="email" cssClass="error"/>
		    </form:label>
			<form:input path="email"/>
			<form:label path="password">密码：
				<form:errors path="password" cssClass="error"/>
			</form:label>
			<form:password path="password"/>
			<form:label path="verifyPassword">密码：
				<form:errors path="verifyPassword" cssClass="error" />
			</form:label>
			<form:password path="verifyPassword"/>
		</fieldset>
		<button id="submit" type="submit">注册</button>
	</form:form>
</div>