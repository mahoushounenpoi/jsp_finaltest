<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>登录界面</title>
</head>
<body>
<div style="background-color: #61674b;color:#babfa9;width: 1200px;height: 96px">
	<div style="width: 185px;height: 96px;display: inline">
		<img src="F:/学习/jsp/finaltest/WebContent/img/logo.png" height="90" width="185"/>
	</div>
	<div style="margin-left: 300px;width: 400px;height: 24px;display: inline">
		<ul style="display: inline-block;margin:0 auto;text-align:center;vertical-align:middle">
			<li style="font-family:腾祥范笑歌楷书繁;font-size: 24px;display: inline-block;width:120px;height: 96px;margin:0 auto;"><a style="text-decoration: none;color:#babfa9;" href="admin.jsp">首页</a></li>
			<li style="font-family:腾祥范笑歌楷书繁;font-size: 24px;display: inline-block;width:5px;height: 96px;margin:0 auto;text-shadow: black 3px 3px 3px">|</li>
			<li style="font-family:腾祥范笑歌楷书繁;font-size: 24px;display: inline-block;width:120px;height: 96px;margin:0 auto"><a style="text-decoration: none;color:#babfa9;" href="accountadmin.jsp">账户管理</a></li>
			<li style="font-family:腾祥范笑歌楷书繁;font-size: 24px;display: inline-block;width:5px;height: 96px;margin:0 auto;text-shadow: black 3px 3px 3px">|</li>
			<li style="font-family:腾祥范笑歌楷书繁;font-size: 24px;display: inline-block;width:120px;height: 96px;margin:0 auto"><a style="text-decoration: none;color:#babfa9;" href="orderadmin.jsp">订单管理</a></li>
			<li style="font-family:腾祥范笑歌楷书繁;font-size: 24px;display: inline-block;width:5px;height: 96px;margin:0 auto;text-shadow: black 3px 3px 3px">|</li>
			<li style="font-family:腾祥范笑歌楷书繁;font-size: 24px;display: inline-block;width:120px;height: 96px;margin:0 auto"><a style="text-decoration: none;color:#babfa9;" href="messageadmin.jsp">留言管理</a></li>
		</ul>
	</div>
</div>
<div style="background-color: #babfa9;color:#ffffff;position:relative;overflow:hidden;font-family:腾祥范笑歌楷书繁;font-size: 24px;width: 1200px;height: 600px">
	<br>
	<br>
	<br>
	<br>
	<a style="margin-left: 200px;background-color: #babfa9;color:#ffffff;font-family: 'Source Han Sans Heavy';font-size: 40px">欢迎来到后台管理系统 请先登录</a>
	<br>
	<br>
	<br>
	<br>
	<form action="admin_check.jsp" method="post">
		<a style="vertical-align: middle; background-color: #61674b;margin-left: 200px;margin-top: 100px;text-decoration: none;color: #ffffff;font-size: 32px">用户名：</a>
		<input style="vertical-align: middle; font-size: 32px;border:0;" type="text" name="id">
		<br>
		<br>
		<br>
		<a style="vertical-align: middle; background-color: #61674b;margin-left: 200px;margin-top: 100px;text-decoration: none;color: #ffffff;font-size: 32px">密     码：</a>
		<input style="vertical-align: middle; font-size: 32px;border:0;" type="password" name="pwd">
		<br>
		<br>
		<br>
		<input style="font-family: 'Source Han Sans Heavy';font-size: 24px ;width:200px;height: 50px;margin-left: 525px;background-color: #61674b;color: #ffffff;border: 0" type="submit" value="立即登录" name="submit">
	</form>
</div>

</div>
<div style="background-color: #61674b;color:#babfa9;width: 1200px;height: 125px">
	<img src="F:/学习/jsp/finaltest/WebContent/img/logo.png" height="90" width="186" style="margin-left: 502px"/>
	<div style="margin-top: 3px;text-align: center">
		<a style="color: #babfa9;font-size: 18px" >Copyright © 2015 浙江海鸟商业管理有限公司 版权所有</a>
	</div>

</div>
</body>
</body>
</html>