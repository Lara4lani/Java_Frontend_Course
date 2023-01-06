<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
 <link rel='stylesheet' type='text/css' media='screen' href='style.css'>
     <link rel="preconnect" href="https://fonts.googleapis.com"><link rel="preconnect" href="https://fonts.gstatic.com" crossorigin><link href="https://fonts.googleapis.com/css2?family=Raleway&display=swap" rel="stylesheet">
 
<title>Modifica</title>
</head>
<body>

	
	<form action="Modifica" method="post">
		<label>NOME</label>
		<input  value="${nome}" type="text" name="nome"><br>
		<label>COGNOME</label>
		<input value="${cognome}" type="text" name="cognome"><br>
		<label>DATA DI NASCITA</label>
		<input value="${datadinascita}" type="date" name="datadinascita"><br>
		<label>CODICE FISCALE</label>
		<input value="${cf}" type="text" name="cf"><br>
		<button type="reset">Cancella</button>
		<button type="submit" onclick="Gestione">Invia</button>
	</form>

</body>
</html>