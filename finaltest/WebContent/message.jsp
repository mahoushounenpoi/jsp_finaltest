<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>留言页面</title>
</head>
<body>
<br>
<form action="mescheck.jsp" method="post">
手机号
<input type="text" name="phone">
<br>
姓名：
<input type="text" name="name">
<br>
留言内容：
<input type="text" name="mes">
<br>
<input type="submit" value="留言" name="submit">
<br>
</form>
</body>
</html>