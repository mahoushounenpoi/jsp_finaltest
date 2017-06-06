<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="bean.message" %>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>留言成功</title>
<%
request.setCharacterEncoding("utf-8");
%>
</head>
<body>
<jsp:useBean id="getmessage" class="bean.message" scope="page"></jsp:useBean>
<jsp:setProperty property="*" name="getmessage"/>
留言成功，3秒跳转回之前页面
<%
String phone=request.getParameter("phone");
String name=request.getParameter("name");
String message=request.getParameter("mes");
getmessage.setPhone(phone);
getmessage.setName(name);
getmessage.setMessage(message);
getmessage.addmessage();
response.setHeader("refresh","3;url=message.jsp");
%>

</body>
</html>