<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
   

<head>
<meta charset="ISO-8859-1">
 <link rel='stylesheet' type='text/css' media='screen' href='style.css'>
     <link rel="preconnect" href="https://fonts.googleapis.com"><link rel="preconnect" href="https://fonts.gstatic.com" crossorigin><link href="https://fonts.googleapis.com/css2?family=Raleway&display=swap" rel="stylesheet">
 
<title>Home</title>


</head>
<body>
<h5 id="titolo">${msg} ${persona.nome} ${persona.cognome}</h5>
<h1>Gestione Utenti</h1>

<!-- Invio richiesta di tipo GET  -->
<div class="btn">
<a href="Paginazione?offset=0"> Gestisci</a>
</div>


<br>
<div class="btn">
<a href="Registrazione.jsp"> Registrati</a>
</div>


<div class="footer">
<p>&copy;  Lara Misia Forlani</p>
<a href="https://www.linkedin.com/in/lara-misia-forlani-3b4612234/" target="_blank">LinkedIn</a>
<a href="https://github.com/la-rika" target="_blank">GitHub</a>
</div>

</body>
</html>