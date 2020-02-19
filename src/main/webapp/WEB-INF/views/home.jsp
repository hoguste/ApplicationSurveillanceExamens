<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%-- <%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%> --%>
<%-- <%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%> --%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Page d'accueil</title>
</head>
<body>
	<h1>Accueil</h1>



	<input type="button" value="Page des administrateurs"
		onclick="window.location.href='http://localhost:8070/admin'">
		<input type="button" value="Page des enseignants"
		onclick="window.location.href='http://localhost:8070/enseignant'">
		<input type="button" value="Page des grades"
		onclick="window.location.href='http://localhost:8070/grade'">
		<input type="button" value="Page des salles"
		onclick="window.location.href='http://localhost:8070/salle'">
		<input type="button" value="Page des séances"
		onclick="window.location.href='http://localhost:8070/seance'">
		
		<form action="logout" method="post">
		<p>
		<input type="submit" value="Déconnection" name="action"> 
		</p>
		</form>
		
		


</body>
</html>
