<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>全部书单</title>
</head>
<body>
<label>全部书单(点击查看详细信息)</label>
<br/>
<s:iterator value="books">
	<s:a href="information.action?ISBN=%{ISBN}&amp;AuthorID=%{AuthorID}">
	<s:property value="Title"/>
	<br>
	</s:a>
	<br/>
	</s:iterator>
</body>
</html>