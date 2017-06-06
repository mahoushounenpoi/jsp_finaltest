<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="bean.User" %>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>个人中心</title>
<%
request.setCharacterEncoding("utf-8");
%>
</head>
<body>
<%
String phone=(String)session.getAttribute("phone");
out.println("现在是"+phone+"用户登录");
%>
修改和完善个人信息
<br>
手机号是不可修改的
<br>
<form action="updatesuccess.jsp" method="post">
用户名：
<input type="text" name="username">
<br>
真实姓名：
<input type="text" name="name">
<br>
身份证号：
<input type="text" name="id">
<br>
邮箱：
<input type="text" name="email">
<br>
新密码：
<input type="password" name="pwd">
<input type="submit" value="确认修改" name="submit">
</form>


</body>
</html>
