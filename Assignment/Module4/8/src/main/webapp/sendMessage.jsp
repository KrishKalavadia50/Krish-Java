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
    <input type="hidden" name="action" value="sendMessage">
    From User ID: <input type="text" name="from"><br>
    To User ID: <input type="text" name="to"><br>
    Message: <textarea name="msg"></textarea><br>
    <input type="submit" value="Send Message">
</form>
</body>
</html>