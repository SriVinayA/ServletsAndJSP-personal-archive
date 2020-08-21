<%@ page import="com.example.web.model.Alien" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <title>Title</title>
</head>

<body bgcolor="#00ffff">
    <%
        Alien a1 = (Alien) request.getAttribute("alien");

        out.println(a1);
    %>
</body>

</html>