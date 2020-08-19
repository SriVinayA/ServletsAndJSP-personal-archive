<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Submit</title>
</head>
<style>
div {
  border-radius: 5px;
  background-color: #f2f2f2;
  padding: 20px;
}
</style>
<body>

<div>
First Name: <%= request.getParameter("firstname") %><br>
Last Name: <%= request.getParameter("lastname") %><br>
Country: <%= request.getParameter("country") %><br>
Languages Known: <%
String[] languages = request.getParameterValues("language");
if(languages != null){
	for(int i=0; i<languages.length; i++){
		out.print("<br>");
		out.print(languages[i]);
	}
} else{
	out.print("None Selected");
} 
%><br> 
</div>

</body>
</div>

</html>