<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="UserController" method="post">
    <input type="hidden" name="action" value="register">
    First Name: <input type="text" name="fname"><br>
    Last Name: <input type="text" name="lname"><br>
    Email: <input type="text" name="email"><br>
    Mobile: <input type="text" name="mobile"><br>
    <input type="submit" value="Register">
</form>
</body>
</html>