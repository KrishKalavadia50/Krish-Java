<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Registraion</title>
<link rel="stylesheet" href="index.css">
</head>
<body>
	<div class="container">
        <h2>Registration Form</h2>
        <form id="registrationForm" method="post" action="RegistrionController">
            <!-- Auto-incremented ID will be handled by JavaScript -->
            <input type="hidden" id="userId" name="userid">

            <label for="fname">First Name</label>
            <input type="text" id="fname" name="firstname" placeholder="Enter your first name">

            <label for="lname">Last Name</label>
            <input type="text" id="lname" name="lastname" placeholder="Enter your last name">

            <label for="email">Email</label>
            <input type="email" id="email" name="email"placeholder="Enter your email">

            <label for="mobile">Mobile</label>
            <input type="tel" id="mobile" name="mobile" placeholder="Enter your mobile number">

            <label for="gender">Gender</label>
            <select id="gender" name="gender">
                <option value="">Select Gender</option>
                <option value="male">Male</option>
                <option value="female">Female</option>
                <option value="other">Other</option>
            </select>

            <label for="password" >Password</label>
            <input type="password" id="password" name="password"placeholder="Enter your password">

            <button type="submit">Register</button>
        </form>

        <p id="error-message"></p>

        <div id="userList">
            <h3>Registered Users</h3>
            <ul id="users"></ul>
        </div>
    </div>
</body>
</html>