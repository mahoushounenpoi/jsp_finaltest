<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>预订页面</title>
</head>
<body>
<%
int roomid=(Integer)session.getAttribute("roomid");
String phone=(String)session.getAttribute("phone");
out.print("手机号："+phone);
out.print("房间id："+roomid);
%>
请输入相关信息 日期格式请务必按照年-月-日这种格式输入 否则会预定失败 请谅解
<br>
<form action="ordercheck.jsp" method="post">
入住日期：
<input type="text" name="checkin">
<br>
离开日期：
<input type="text" name="checkout">
<br>
入住人数：
<input type="text" name="people">
<br>
<input type="submit" value="预定" name="submit">
<br>
</form>
</body>
</html>