<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="bean.User" %>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>修改信息成功</title>
<%
request.setCharacterEncoding("utf-8");
%>
</head>
<body>
<jsp:useBean id="getuser" class="bean.User" scope="page"></jsp:useBean>
<jsp:setProperty property="*" name="getuser"/>
<%
String phone=(String)session.getAttribute("phone");
out.println("现在是"+phone+"用户登录");
%>
<br>
<%
String username=null;
username=request.getParameter("username");
out.println("<br>");
String name=null;
name=request.getParameter("name");
out.println("<br>");
String id=null;
id=request.getParameter("id");
out.println("<br>");
String email=null;
email=request.getParameter("email");
out.println("<br>");
String password=null;
password=request.getParameter("pwd");
out.println("<br>");
if(username!=null&&username!="")
{
	getuser.updateusername(username, phone);
}
if(name!=null&&name!="")
{
	getuser.updatename(name, phone);
}
if(id!=null&&id!="")
{
	getuser.updateidentity(id, phone);
}
if(email!=null&&email!="")
{
	getuser.updateemail(email, phone);
}
if(password!=null&&password!="")
{
	getuser.updatepwd(password, phone);
}

%>
修改成功。
这是当前信息。
<br>
<%
out.println(getuser.getusermes(phone).toString());
%>
</body>
</html>
