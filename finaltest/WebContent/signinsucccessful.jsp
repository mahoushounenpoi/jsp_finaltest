<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="bean.User" %>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>注册成功</title>
<%
request.setCharacterEncoding("utf-8");
%>
</head>
<body>
<jsp:useBean id="getuser" class="bean.User" scope="page"></jsp:useBean>
<jsp:setProperty property="*" name="getuser"/>
注册成功 3秒钟跳转个人中心页面继续完善信息。
<%
String username=request.getParameter("username");
String phone=request.getParameter("phone");
String email=request.getParameter("email");
String password=request.getParameter("pwd");
session.setAttribute("phone", phone);
getuser.setPhone(phone);
getuser.setPassword(password);
getuser.setUsername(username);
getuser.setEmail(email);
getuser.signin();
response.setHeader("refresh","3;url=person_center.jsp");
%>

</body>
</html>