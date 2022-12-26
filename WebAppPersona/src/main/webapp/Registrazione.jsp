<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registrazione</title>
</head>
<body>

<h1>Registrati</h1>

<form method="POST" action="Inserimento">
<input placeholder="inserisci il nome" type="text" name="nome">
<br><br>
<input placeholder="inserisci il cognome" type="text" name="cognome">
<br><br>
<input type="date" name="datadinascita">
<br><br>
<input placeholder="inserisci il codifce fiscale" type="text" name="cf">
<button type="reset">Cancella</button>
<button type="submit">Invia</button>
</form>

</body>
</html>