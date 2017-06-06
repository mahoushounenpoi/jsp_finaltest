<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>删除订单</title>
</head>
<body>
<jsp:useBean id="getuser" class="bean.User" scope="page"></jsp:useBean>
<jsp:setProperty property="*" name="getuser"/>
请输入要删除订单的id
<br>
<form action="delordersuccess.jsp" method="post">
id：
<input type="text" name="id">
<br>
<input type="submit" value="删除" name="submit">
<br>
</form>
</body>
</html>