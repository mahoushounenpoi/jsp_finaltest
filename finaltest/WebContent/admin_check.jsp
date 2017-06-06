<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="bean.User" %>
<%@page import="java.sql.* "%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>登录检查</title>
</head>
<body>
<jsp:useBean id="getuser" class="bean.User" scope="page"></jsp:useBean>
<jsp:setProperty property="*" name="getuser"/>

<%
request.setCharacterEncoding("utf-8");

String name=request.getParameter("id");
String password=request.getParameter("pwd");

if(name.equals("admin")&&password.equals("123"))
{
	out.println("成功登录，3秒钟后进入后台管理主页面");
	response.setHeader("refresh","3;url=admin.jsp");
	
	}else
	{
		out.println("登陆失败,用户名或密码错误，3秒钟后返回上一个页面");
		response.setHeader("refresh","3;url=adminhome.jsp");
	}

%>

</body>
</html>