<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Using Java Server Page</title>
</head>
<body bgcolor="#FDF5E6">
<!-- DECLARATION DE VARIABLE AVEC UN !-->
<%! String message; %>
<!-- EN SCRIPTLET -->
<% message="Bonjour";
out.println(message); %>
<!-- OU EN EXPRESSION AVEC UN = -->
<%= message %>
<%= 2+2 %>
<br>

<%@ page import="java.util.*" %>
<%= new Date() %>

</body>
</html>