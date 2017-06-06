<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="bean.order" %>
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
查看历史订单情况    如需取消订单 请联系酒店 联系电话如下
<br>
<jsp:useBean id="getorder" class="bean.order" scope="page"></jsp:useBean>
<jsp:setProperty property="*" name="getorder"/>
<br>
<%
out.print(getorder.getuserorders(phone).toString());
%>
</body>
</html>