<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product Management System</title>
</head>
<body>
<h1>Product Management System</h1><hr>
<form action ="enter" method="post">
<h2>Enter New Product Details</h2>
<h3>ProductId : <input type="text" name="pid"><br>
Product Name : <input type="text" name="pname"><br>
No of Units : <input type="text" name="noOfUnits"><br>
Price : <input type="text" name="price"><br><br>
<input type="submit" value="ENTER"><input type="reset" value="RESET">
</h3>
</form>
<hr>

<form action="disp" method="post">
<h2>Display All Products</h2>
<h3><input type="submit" value="DISPLAY"></h3>
</form>

<hr>
<h2>Employe Search</h2>
<form action="search" method="post">
<h3>Id : <input type="text" name="id"><br><br>
<input type="submit" value="SEARCH"><input type="reset" value="RESET">
</h3>
</form><hr>
<form action ="update" method="post">
<h2>Update Details</h2>
<h3>Eid : <input type="text" name="id"><br>
Empname : <input type="text" name="name"><br>
Age : <input type="text" name="age"><br>
Salary : <input type="text" name="salary"><br>
Designation : <input type="text" name="desig"><br><br>
<input type="submit" value="ENTER"><input type="reset" value="RESET">
</h3>
</form>
<hr>
<h2>Delete Employee</h2>
<form action="del" method="post">
<h3>Id : <input type="text" name="id"><br><br>
<input type="submit" value="DELETE"><input type="reset" value="RESET">
</h3>
</form><hr>

<h2>Search Employee By Designation</h2>
<form action="desg" method="post">
<h3>Designation : <input type="text" name="desig"><br><br>
<input type="submit" value="SEARCH"><input type="reset" value="RESET">
</h3>
</form><hr>

<h2>Salary Greater than</h2>
<form action="salary" method="post">
<h3>Salary : <input type="text" name="salary"><br><br>
<input type="submit" value="SEARCH"><input type="reset" value="RESET">
</h3>
</form><hr>

</body>
</html>