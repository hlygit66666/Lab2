<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>按作者查询</title>
</head>
<body>
<s:form action="/helloworld/searchbyauthor">
<label>请输入作者</label>
<br/>
<s:textfield name="Name"/>
<s:submit value="确定"/>
</s:form>
</body>
</html>