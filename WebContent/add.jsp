<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>新增书籍</title>
</head>
<body>
<s:form action="/helloworld/addbook">
<label>请输入新增书籍的详细信息(每项均不为空):</label>
<br>
ISBN<br/><input type="text" name="ISBN"/><br>
书名	<br/><input type="text" name="Title"/><br>
出版社<br/><input type="text" name="Publisher"/><br>
出版日期(请使用标准日期格式，如2017-10-07)<br/><input type="text" name="PublishDate"/><br>
价格(:元)	<br/><input type="text" name="price"/><br>
作者	<br/><input type="text" name="Name"/><br>
作者编号	(整数)<br/><input type="text" name="AuthorID"/><br>
作者年龄	(整数)<br/><input type="text" name="Age"/><br>
作者国籍	<br><input type="text" name="Country"/><br>
<input type="submit"  value="确认"/>
</s:form>
</body>
</html>