<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>删除账户</title>
</head>
<body>
<jsp:useBean id="getuser" class="bean.User" scope="page"></jsp:useBean>
<jsp:setProperty property="*" name="getuser"/>
请输入要删除的账户的手机号
<br>
<form action="delsucccess.jsp" method="post">
手机号：
<input type="text" name="phone">
<br>
<input type="submit" value="删除" name="submit">
<br>
</form>
</body>
</html>