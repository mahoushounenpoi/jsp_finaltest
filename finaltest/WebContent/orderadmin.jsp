<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>订单管理系统</title>
</head>
<body>
<jsp:useBean id="getorder" class="bean.order" scope="page"></jsp:useBean>
<jsp:setProperty property="*" name="getorder"/>
<jsp:getProperty property="queryresult" name="getorder"/>
<input type="button" value="删除" Onclick="window.location='deleteorder.jsp'">
</body>
</html>