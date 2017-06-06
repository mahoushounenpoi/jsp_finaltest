<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="bean.order" %>
<%@page import="java.sql.* "%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>预订成功</title>
</head>
<body>
<jsp:useBean id="getorder" class="bean.order" scope="page"></jsp:useBean>
<jsp:setProperty property="*" name="getorder"/>
预定成功 3秒钟跳转订单页面
<%
request.setCharacterEncoding("utf-8");

String checkin=request.getParameter("checkin");
String checkout=request.getParameter("checkout");
int people=Integer.valueOf(request.getParameter("people"));
int roomid=(Integer)session.getAttribute("roomid");
String phone=(String)session.getAttribute("phone");
out.println("手机号："+phone);
out.println("房间id："+roomid);
out.println("入住时间"+checkin);
out.println("离开时间"+checkout);
out.println("入住人数"+people);

getorder.setPhone(phone);
getorder.setRoomid(roomid);
getorder.setCheckin(checkin);
getorder.setCheckout(checkout);
getorder.setPeople(people);
getorder.addorder();
response.setHeader("refresh","3;url=historyorder.jsp");
%>
</body>
</html>