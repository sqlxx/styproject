<!DOCTYPE HTML> 
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/> 
    <link href='<c:url value="/static/style/xweb.css" />' rel="stylesheet" type="text/css"/>
	<title><tiles:getAsString name="title"></tiles:getAsString></title>
</head>
<body>
<div id="main">
	<div id="header">
	<tiles:insertAttribute name="header"/>
	</div>
	<div id="content">
		<div id="menu">
		<tiles:insertAttribute name="menu"/>
		</div>
		<div id="body">
		<tiles:insertAttribute name="body"/>
		</div>
	</div>
	<div id="footer">
	<tiles:insertAttribute name="footer"/>
	</div>
</div>
</body>
</html>