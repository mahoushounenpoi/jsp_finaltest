<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="bean.User" %>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>添加成功</title>
<%
request.setCharacterEncoding("utf-8");
%>
</head>
<body>
<jsp:useBean id="getuser" class="bean.User" scope="page"></jsp:useBean>
<jsp:setProperty property="*" name="getuser"/>
操作成功 3秒钟跳转账户管理系统查看结果
<%
String username=request.getParameter("username");
String phone=request.getParameter("phone");
String email=request.getParameter("email");
String password=request.getParameter("pwd");
String name=request.getParameter("name");
String identity=request.getParameter("identity");
getuser.setPhone(phone);
getuser.setPassword(password);
getuser.setUsername(username);
getuser.setEmail(email);
getuser.setName(name);
getuser.setIdentityid(identity);
getuser.adduser();
response.setHeader("refresh","3;url=accountadimin.jsp");
%>

</body>