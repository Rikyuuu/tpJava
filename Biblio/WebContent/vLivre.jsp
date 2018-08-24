<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ page import="mesBeans.Livre" import="mesBeans.Client" import="java.util.ArrayList"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<jsp:useBean id="user" class="mesBeans.Client" scope="session"></jsp:useBean>
</head>
<body>
<h1>Ouvrage demandé</h1>
<h2>Bonjour <jsp:getProperty property="user" name="user" /></h2> 

<form action='Controleur2?page=2' method='post'>
	<p>Titre</p>
	<input name='titre' type='text' size='25' />
		<p>Catégorie</p>
		<select name='categorie'>
			<option value="Thriller">Thriller</option>
			<option value="Roman">Roman</option>
			<option value="Bd">Bande dessinee</option>
			<option value="Histoire">Histoire</option>
		</select>
	<input type='submit' name='Valider' />
</form> 
<p>Vos réservations: </p>
<%
ArrayList<Livre> liste = (ArrayList<Livre>)request.getAttribute("listlivres");

if(liste!= null) {
	out.println(" <p>" + liste + "</p>");	
}
%>

<%-- <%
 for (Livre livre : user.getLivres()) {
	out.println("<p>" + livre.toString() + "</p>");
} 

%> --%>

<%-- ${listlivres} --%>

</body>
</html>