<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>My App</title>
</head>
<body>
<h1>Response Recieved</h1><br>
<center><h1>Course Name : ${course.getCourseName()}</h1></center><br>
<center><h1>Course ID : ${course.getCourseId()}</h1></center><br>
<center><h1>Course Cost : ${course.getCourseCost()}</h1></center><br>
</body>
</html>