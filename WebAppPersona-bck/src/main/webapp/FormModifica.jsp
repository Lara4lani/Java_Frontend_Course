<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
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