<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>IEliminazione completa</title>
</head>
<body>
	<form method="POST" action="Elimina">
<input  type="text" name="nome"  value="${nome }">
<br><br>
<input  type="text" name="cognome" value="${cognome }">
<br><br>
<input type="date" name="datadinascita" value="${datadinascita }">
<br><br>
<input  type="text" name="cf" value="${cf	 }">
<h2>Confermi di voler eliminare questa persona dall'elenco?</h2>
<button type="reset">no</button>
<button type="submit" ><a href="ConfermaElimina.jsp]">si</a> </button>
</form>

</body>
</html>