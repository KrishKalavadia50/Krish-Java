<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Show User</title>
    <link rel="stylesheet" type="text/css" href="show.css">
</head>
<body>
    <div class="container">
        <h2>User Details</h2>
        <div class="user-details">
            <p><strong>First Name:</strong> ${firstname}</p>
            <p><strong>Last Name:</strong> ${lastname}</p>
            <p><strong>Mobile:</strong> ${mobile}</p>
            <p><strong>Email:</strong> ${email}</p>
            <p><strong>Gender:</strong> ${gender}</p>
            <p><strong>Password:</strong> [Hidden for Security]</p>
            <a class="btn" href="ShowController?action=edituser&userid=${id}">Edit User</a>
            <a class="btn btn-danger" href="ShowController?action=deleteuser&userid=${id}">Delete User</a>
        </div>
        <br>
        <form method="post" action="ShowController">
            <table class="form-table">
                <tr>
                    <td><label for="firstname">Firstname:</label></td>
                    <td><input type="text" id="firstname" name="firstname" value="${hmodel.firstname}" required></td>
                </tr>
                <tr>
                    <td><label for="lastname">Lastname:</label></td>
                    <td><input type="text" id="lastname" name="lastname" value="${hmodel.lastname}"></td>
                </tr>
                <tr>
                    <td><label for="email">Email:</label></td>
                    <td><input type="email" id="email" name="email" value="${hmodel.email}"></td>
                </tr>
                <tr>
                    <td><label for="mobile">Mobile:</label></td>
                    <td><input type="text" id="mobile" name="mobile" value="${hmodel.mobile}"></td>
                </tr>
                <tr>
                    <td><label for="gender">Gender:</label></td>
                    <td><input type="text" id="gender" name="gender" value="${hmodel.gender}"></td>
                </tr>
                <tr>
                    <td><label for="password">Password:</label></td>
                    <td><input type="password" id="password" name="password" value="${hmodel.password}"><input type="hidden" name="userid" value="${hmodel.userid}"></td>
                </tr>
                <tr>
                    <td colspan="2"><input type="submit" value="Update" class="btn"></td>
                </tr>
            </table>
        </form>
    </div>
</body>
</html>
