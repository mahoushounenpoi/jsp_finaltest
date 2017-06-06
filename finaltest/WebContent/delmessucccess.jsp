<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="bean.message" %>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>删除成功</title>
<%
request.setCharacterEncoding("utf-8");
%>
</head>
<body>
<jsp:useBean id="getmessage" class="bean.message" scope="page"></jsp:useBean>
<jsp:setProperty property="*" name="getmessage"/>
操作成功 3秒钟跳转留言管理系统查看结果
<%

int id=Integer.valueOf(request.getParameter("id"));
getmessage.deletemessage(id);
response.setHeader("refresh","3;url=messageadmin.jsp");
%>

</body>