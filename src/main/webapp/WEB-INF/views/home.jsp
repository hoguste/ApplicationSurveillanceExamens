<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%-- <%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%> --%>
<%-- <%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%> --%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Accueil</title>
	<script src="jquery-3.4.1.min.js"></script>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
        integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
        integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
        crossorigin="anonymous"></script>

</head>
<nav aria-label="breadcrumb">
  <ol class="breadcrumb">
    <li class="breadcrumb-item active" aria-current="page">Accueil</li>
  </ol>
</nav>
<body>
	<h1>
	<center><font face = "comic sans ms" color ="chartreuse" >Gestionnaire des Examens</font></center>
</h1>

<P><center> <font face =" comic sans ms" color ="fuschia">Veuillez Choisir une Catégorie</font></center></P>



	<input type="button" class="btn btn-secondary btn-lg btn-block" value="Page des administrateurs"
		onclick="window.location.href='http://localhost:8070/findAllAdmin'">
		<input type="button"  class="btn btn-secondary btn-lg btn-block" value="Page des enseignants"
		onclick="window.location.href='http://localhost:8070/findAllEnseignant'">
		<input type="button" class="btn btn-secondary btn-lg btn-block" value="Page des grades"
		onclick="window.location.href='http://localhost:8070/findAllGrade'">
		<input type="button" class="btn btn-secondary btn-lg btn-block" value="Page des salles"
		onclick="window.location.href='http://localhost:8070/findAllSalle'">
		<input type="button" class="btn btn-secondary btn-lg btn-block" value="Page des séances"
		onclick="window.location.href='http://localhost:8070/findAllSeance'">
		
		<form action="logout" method="post">
		<p>
		<input type="submit" class="btn btn-outline-danger" value="Deconnexion" name="action"> 
		</p>
		</form>
		
		


</body>
</html>
