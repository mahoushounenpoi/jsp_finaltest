<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>登录界面</title>
</head>
<body>
<form action="user_order_check.jsp" method="post">
手机号：
<input type="text" name="id">
<br>
密码：
<input type="password" name="pwd">
<br>
<input type="submit" value="立即登录" name="submit">
<br>
<input type="button" value="我要注册" Onclick="window.location='signin.jsp'">
</form>
</body>
</html>