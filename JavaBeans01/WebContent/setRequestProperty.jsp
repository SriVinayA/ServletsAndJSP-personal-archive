<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Set Property</title>
</head>
<body>
<jsp:useBean id="user" class="com.asv.User" scope="request"></jsp:useBean>
<jsp:setProperty property="firstName" name="user" value="Varun"/>
<jsp:setProperty property="lastName" name="user" value="A"/>
Values have been set.

<%
	request.getRequestDispatcher("getRequestProperty.jsp").forward(request, response);
%>

</body>
</html>