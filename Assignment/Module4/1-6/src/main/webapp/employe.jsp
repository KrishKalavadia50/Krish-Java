<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="employee" method="post">
        First Name: <input type="text" name="fname" required><br><br>
        Last Name: <input type="text" name="lname" required><br><br>
        Mobile: <input type="text" name="mobile" required><br><br>
        Email: <input type="email" name="email" required><br><br>
        Password: <input type="password" name="password" required><br><br>
        <input type="submit" value="Submit">
    </form>
</body>
</html>