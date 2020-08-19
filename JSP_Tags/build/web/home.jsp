<%-- 
    Document   : home
    Created on : 03-Aug-2020, 6:20:55 pm
    Author     : srivi
--%>

<%@page import="java.util.Scanner"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <%!
            int coef = 3;
        %>
        
        <h1>Hello World!</h1>
        <%
            out.println(7 + 5);
        %>
        
        My Fav Number is <%= coef%>
    </body>
</html>
