<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<link rel='stylesheet' type='text/css' media='screen' href='style.css'>
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link
	href="https://fonts.googleapis.com/css2?family=Raleway&display=swap"
	rel="stylesheet">

<title>Insert title here</title>
</head>
<body>

	<div class="form">

		<c:if test="${val==null }">
				<h3>Registrati</h3>
			<form method="POST" action="Inserimento">
		</c:if>
		<c:if test="${val>0}">
				<h3>Modifica i dati</h3>
			<form method="POST" action="Modifica">
		</c:if>

		<input value="${persona.nome}" placeholder="inserisci il nome"
			type="text" name="nome" required="required"> <br> <br>
			<label id="errnome"> </label>
		<input value="${persona.cognome}" placeholder="inserisci il cognome"
			type="text" name="cognome" required="required"> <br> <br>
			<label id="errcognome"> </label>
		<input placeholder="yyyy-MM-dd"value="${persona.datadinascita}" type="date"
			name="datadinascita" required="required"> <br> <br>
			<label id="errdatadinascita"> </label>
		<input value="${persona.cf}"
			placeholder="inserisci il codifce fiscale" type="text" name="cf"
			required="required"> <br> <br>
			<label id="errcf"> </label>
			<br>
			<input value="${persona.cf}" type="hidden" name="cfold">
		<button class="formbtn" type="reset" >Cancella</button>
		<c:if test="${val==null }">
			<button class="formbtn" type="submit"
				>Invia</button>
		</c:if>
		<c:if test="${val>0 }">
			<button class="formbtn" type="submit" onclick="ConfermaModifica.jsp">Modifica</button>
		</c:if>

		</form>
		
	</div>
	
		<a class="back" href="Home.jsp"> Home</a>
		<br>	

	<br>
	<br>
	<br>

	<div class="footer">
		<p>&copy; Lara Misia Forlani</p>
		<a href="https://www.linkedin.com/in/lara-misia-forlani-3b4612234/"
			target="_blank">LinkedIn</a> <a href="https://github.com/la-rika"
			target="_blank">GitHub</a>
	</div>

</body>
</html>