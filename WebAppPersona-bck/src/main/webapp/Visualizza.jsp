<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
 <link rel='stylesheet' type='text/css' media='screen' href='style.css'>
     <link rel="preconnect" href="https://fonts.googleapis.com"><link rel="preconnect" href="https://fonts.gstatic.com" crossorigin><link href="https://fonts.googleapis.com/css2?family=Raleway&display=swap" rel="stylesheet">
 
<title>Persone inserite</title>

</head>

<body>


	<table>
		<tr>
			<th><b>NOME</b></th>
			<th><b>COGNOME</b></th>
			<th><b>DATA DI NASCITA</b></th>
			<th><b>CF</b></th>
			<th></th>
			<th></th>
		</tr>

		<c:forEach var="list" items="${listapersone}">
			<tr>
				<td>${list.nome}</td>
				<td>${list.cognome}</td>
				<td>${list.datadinascita}</td>
				<td>${list.cf}</td>
	

				<td><a href="Modifica?nome=${list.nome}&&cognome=${list.cognome}&&datadinascita=${list.datadinascita}&&cf=${list.cf}"><b>modifica</b></a></td>
				<td><a class="del" href="Elimina?nome=${list.nome}&&cognome=${list.cognome}&&datadinascita=${list.datadinascita}&&cf=${list.cf}"><b>elimina</b> </a></td>
			</tr>

		</c:forEach>
	</table>


<div class="footer">
<p>&copy;  Lara Misia Forlani</p>
<a href="https://www.linkedin.com/in/lara-misia-forlani-3b4612234/" target="_blank">LinkedIn</a>
<a href="https://github.com/la-rika" target="_blank">GitHub</a>
</div>
</body>
</html>