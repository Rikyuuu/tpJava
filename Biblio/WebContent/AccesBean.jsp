<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ page import="mesBeans.Personne" %>
<jsp:useBean id="maPersonne" class="mesBeans.Personne" scope="request"></jsp:useBean>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Creation du bean Personne</title>
</head>
<body>
	Au premier affichage mon bean se nomme Nom:
	<h3><jsp:getProperty property="nom" name="maPersonne" /></h3>
	<br>
	Prenom:
	<h3><jsp:getProperty property="prenom" name="maPersonne" /></h3>
	<br>
	Modification du prenom en
	<jsp:setProperty property="prenom" value="Corine" name="maPersonne" />
	<h3><jsp:getProperty property="prenom" name="maPersonne" /></h3>
	<br>
	Avec du script(toString):
	<h3><%= maPersonne %></h3>
	<br>
	On recupere uniquement le prenom :<h3><%= maPersonne.getPrenom() %></h3>
</body>
</html>