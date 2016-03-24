<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>添加用户</title>
    
	<script type="text/javascript">
	function addUser(){
		var form = document.forms[0];
		form.action = "<%=basePath%>user/addCusUser";
		form.method="post";
		form.submit();
	}
</script>

  </head>
  
  <body>
    <h1>添加用户</h1>
	<form action="" name="userForm">
		ID：<input type="text" name="id">
		姓名：<input type="text" name="name"><br>
		标书号：<input type="text" name="bsid">
		密码：<input type="text" name="password"><br>
		<input type="button" value="添加" onclick="addUser()">
	</form>
  </body>
</html>
