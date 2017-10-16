<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>删除书籍</title>
</head>
<body>

<label>点击删除按钮删除对应图书</label>
<br/>
<s:iterator value="books">
	<s:form action="/helloworld/deletebook">
		<input type="text" name = Tit value = <s:property value="Title"/> > 
		<s:submit type="submit" value="删除"/>
	</s:form>
	<br>
	</s:iterator>

</body>
</html>