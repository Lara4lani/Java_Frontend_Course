<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Persone inserite</title>
<style>
table {
	border-spacing: 20px;
	border: 2px solid black;
}
</style>
</head>

<body>

	<h1>Persone inserite:</h1>
	<table>
		<tr>
			<td><b>NOME</b></td>
			<td><b>COGNOME</b></td>
			<td><b>DATA DI NASCITA</b></td>
			<td><b>CF</b></td>
		</tr>

		<c:forEach var="list" items="${listapersone}">
			<tr>
				<td>${list.nome}</td>
				<td>${list.cognome}</td>
				<td>${list.datadinascita}</td>
				<td>${list.cf}</td>
	

				<td><a href="Modifica?nome=${list.nome}&&cognome=${list.cognome}&&datadinascita=${list.datadinascita}&&cf=${list.cf}"><b>modifica</b></a></td>
				<td><a href="Elimina?nome=${list.nome}&&cognome=${list.cognome}&&datadinascita=${list.datadinascita}&&cf=${list.cf}"><b>elimina</b> </a></td>
			</tr>

		</c:forEach>
	</table>


</body>
</html>