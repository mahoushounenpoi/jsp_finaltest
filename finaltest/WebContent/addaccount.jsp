<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>添加账户</title>
</head>
<body>
<jsp:useBean id="getuser" class="bean.User" scope="page"></jsp:useBean>
<jsp:setProperty property="*" name="getuser"/>
请输入要添加的账户信息 每项都是必填
<br>
<form action="addsucccess.jsp" method="post">
用户名：
<input type="text" name="username">
<br>
手机号：
<input type="text" name="phone">
<br>
密码：
<input type="password" name="pwd">
<br>
邮箱:
<input type="text" name="email">
<br>
真实姓名:
<input type="text" name="name">
<br>
身份证号:
<input type="text" name="identity">
<br>
<input type="submit" value="添加" name="submit">
<br>
</form>
</body>
</html>