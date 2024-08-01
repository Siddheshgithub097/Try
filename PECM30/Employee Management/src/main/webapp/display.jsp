<%@page import="project.Emp"%>
<%@page import="java.util.List"%>
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
	List <Emp> list = (List) request.getAttribute("login");
	%>
	<table border="2px bolder">
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Phone</th>
			<th>Address</th>
			<th>Email</th>
			<th>Password</th>
		</tr>
		<%for(Emp val:list){%>
		<tr>
		<td><%= val.getId() %></td>
		<td><%= val.getName() %></td>
		<td><%= val.getPhone() %></td>
		<td><%= val.getAddress() %></td>
		<td><%= val.getEmail() %></td>
		<td><%= val.getPassword()%></td>
		<td><a href="delete?id=<%= val.getId()%>"><button>DELETE</button></a></td>
		<td><a href="update?id=<%=val.getId()%>"><button>UPDATE</button></a>
		</tr>
		<%} %>
		
	</table>
	 <button><a href="home.jsp">LOGOUT</a></button>
</body>
</html>