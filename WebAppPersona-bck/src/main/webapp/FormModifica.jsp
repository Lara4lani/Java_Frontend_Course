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

	    <div class="form">
        <h3>MODIFICA I DATI</h3>
        <form method="POST" action="Modifica">
            <input  value="${nome}" type="text" name="nome" required="required">
            <br><br>
            <input value="${cognome}" type="text" name="cognome" required="required">
            <br><br>
            <input   value="${datadinascita}" type="date" name="datadinascita" required="required">
            <br><br>
            <input value="${cf}" type="text" name="cf" required="required">
            <br><br>
            <button class="formbtn" type="reset">Cancella</button>
            <button class="formbtn" type="submit" onclick="Gestione">Invia</button>
         
        </form>

<div class="footer">
<p>&copy;  Lara Misia Forlani</p>
<a href="https://www.linkedin.com/in/lara-misia-forlani-3b4612234/" target="_blank">LinkedIn</a>
<a href="https://github.com/la-rika" target="_blank">GitHub</a>
</div>
</body>
</html>