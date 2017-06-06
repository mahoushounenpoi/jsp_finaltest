<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>房型3</title>
</head>
<body>
<%
int roomid=3;
session.setAttribute("roomid", roomid);
String phone=(String)session.getAttribute("phone");
out.println("现在是"+phone+"用户登录");
%>
<input type="button" value="立刻预定" Onclick="window.location='order.jsp'">

</body>
</html>