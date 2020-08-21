<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	<form action="<%=request.getContextPath()%>/SiteController" method="post">
		Username: <input type="text" name="username" placeholder="Enter the Username..."><br> 
		Password: <input type="password" name="password" placeholder="Enter the Password..."><br>
		<input type="submit" value="Submit">
	</form>
</body>
</html>