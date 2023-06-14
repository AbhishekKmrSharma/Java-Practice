<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome <%= session.getAttribute("session_name")%> </h1> 
<h1>Welcome <%= session.getAttribute("password")%> </h1>
<% session.invalidate(); %>
 </body>
</html>