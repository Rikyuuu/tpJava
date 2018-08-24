<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Connexion</title>
</head>
<body>

<h1>Connexion</h1>
<form action='Controleur2?page=1' method='post'>
		<p>Nom</p>
	<input name='nom' type='text' />
		<p>Mot de passe</p>
	<input name='mdp' type='password'>
	<input type='submit' name='Valider' />
</form>


</body>
</html>