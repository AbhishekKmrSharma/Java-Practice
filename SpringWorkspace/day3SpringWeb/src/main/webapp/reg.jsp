<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Name : <%= request.getParameter("name") %></h2>
<h2>Age : <%= request.getParameter("age") %></h2>
<h2>Salary : <%= request.getParameter("sal") %></h2>
<h2>Department : <%= request.getParameter("dept") %></h2>
<h2>Nationality : <%= request.getParameter("nation") %></h2>
</body>
</html>