<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>留言管理系统</title>
</head>
<body>
<jsp:useBean id="getmessage" class="bean.message" scope="page"></jsp:useBean>
<jsp:setProperty property="*" name="getmessage"/>
<jsp:getProperty property="queryresult" name="getmessage"/>
<input type="button" value="删除留言" Onclick="window.location='deletemessage.jsp'">
</body>
</html>