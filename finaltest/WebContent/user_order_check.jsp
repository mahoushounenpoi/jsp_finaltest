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

String phone=request.getParameter("id");
String password=request.getParameter("pwd");

String correctpwd=null;

correctpwd=getuser.pwdcheck(phone).toString();

if(getuser.usercheck(phone)!=null)
{
	session.setAttribute("phone", phone);
	if(correctpwd.equals(password))
   {
	out.println("成功登录，3秒钟后进入房型页面");
	response.setHeader("refresh","3;url=room0.html");
	
	}else
	{
		out.println("登陆失败,用户名或密码错误，3秒钟后返回登录页面");
		response.setHeader("refresh","3;url=order_login.jsp");
	}
}
else
{
	out.println("手机号为空，3秒钟后返回登录页面");
	response.setHeader("refresh","3;url=order_login.jsp");
}


%>

</body>
</html>