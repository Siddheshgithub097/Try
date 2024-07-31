<%@page import="project.Emp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   <% Emp emp=(Emp)request.getAttribute("emp"); %>
 <form action="edit" method="get">
  Id:<input type="hidden" name="id" value=<%= emp.getId()%> readonly="true">
  Name:<input type="text" name="name" value=<%=emp.getName() %>>
  Phone:<input type="tel" name="phone" value=<%=emp.getPhone() %>>
  Address:<input type="text" name="address" value=<%=emp.getAddress() %>>
  Email:<input type="text" name="email" value= <%=emp.getEmail() %>>
  Password:<input type="text" name="password" value=<%=emp.getPassword() %>>
  <input type="submit" name="submit" value="EDIT">
 </form>
</body>
</html>