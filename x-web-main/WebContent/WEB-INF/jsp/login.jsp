<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<div id="login_panel">
	<form id="login_form" name="loginForm" method="post" action="<c:url value='/user/login'/>" >
		<label for="user_name">用户名/Email地址：</label>
		<input id="user_name" type="text" name="username"/>
		<label for="user_pwd">密码：</label>
		<input id="user_pwd" type="password" name="password"/>
		<button id="submit" type="submit">登录</button>
	</form>
</div>
