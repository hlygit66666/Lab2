<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>详细信息</title>
</head>
<body>
详细信息
<br>
书名：
<s:property value="Title"/><br>
ISBN:
<s:property value="ISBN"/><br>
作者：
<s:property value="Name"/><br>
作者编号：
<s:property value="AuthorID"/><br>
出版社：
<s:property value="Publisher"/><br>
出版日期：
<s:property value="PublishDate"/><br>
价格：
<s:property value="price"/><br>
作者年龄：
<s:property value="Age"/><br>
作者国籍：
<s:property value="Country"/><br>
</body>
</html>