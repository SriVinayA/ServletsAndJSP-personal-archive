<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
It's Home Page<br><br>

<a href="<%=request.getContextPath()%>/Controller?page=login">Login</a><br><br>
<a href="<%=request.getContextPath()%>/Controller?page=signup">Sign Up</a><br><br>
<a href="<%=request.getContextPath()%>/Controller?page=about">About</a><br><br>

</body>
</html>