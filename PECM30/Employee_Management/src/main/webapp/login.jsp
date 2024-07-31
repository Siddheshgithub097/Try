<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
	
	String message = (String) request.getAttribute("login");
	
	      if(message!=null){
	%>
	<h1><%=message%></h1>
	<%} %>
<form action="login" method="post">
    Enter the Email:<input type="text" name="email">
   Enter the password:<input type="text" name="password">
   <input type="submit" >
</form>
</body>
</html>