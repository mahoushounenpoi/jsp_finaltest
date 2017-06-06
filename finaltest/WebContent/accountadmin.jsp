<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>账户管理系统</title>
</head>
<body>
<jsp:useBean id="getuser" class="bean.User" scope="page"></jsp:useBean>
<jsp:setProperty property="*" name="getuser"/>
<jsp:getProperty property="queryresult" name="getuser"/>
<input type="button" value="添加账户" Onclick="window.location='addaccount.jsp'">
<input type="button" value="删除账户" Onclick="window.location='deleteaccount.jsp'">
</body>
</html>