<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Grades</title>
<script src="jquery-3.4.1.min.js"></script>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
        integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
        integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
        crossorigin="anonymous"></script>
</head>
<nav aria-label="breadcrumb">
  <ol class="breadcrumb">
    <li class="breadcrumb-item"><a href="/">Accueil</a></li>
    <li class="breadcrumb-item active" aria-current="page">Grades</li>
  </ol>
</nav>
<body>

	<form:form action="ajoutGrade" method="post">
		<!-- 	'class' pour indiquer le template de style à utiliser, ex : <form class="table table-striped"> -->
		<table class="table table-striped">
			<tr>
				<td>id<input type="text" name="id">
				</td>
				<td>nom<input type="text" name="nom">
				</td>
				<td>quotaSeances<input type="text" name="quotaSeances">
				</td>
				<td><input type="submit" value="ajout" name="action"></td>
			</tr>

		</table>

	</form:form>


	<form:form action="supprGrade" method="post">
		<!-- 	'class' pour indiquer le template de style à utiliser, ex : <form class="table table-striped"> -->
		<table class="table table-striped">

			<tr>
				<td>id<input type="text" name="id">
				</td>

				<td><input type="submit" value="suppr" name="action"></td>
			</tr>
		</table>

	</form:form>

	<form:form action="modifGrade" method="post">
		<!-- 	'class' pour indiquer le template de style à utiliser, ex : <form class="table table-striped"> -->
		<table class="table table-striped">

			<tr>
				<td>id<input type="text" name="id">
				</td>
				<td>nom<input type="text" name="nom">
				</td>
				<td>quotaSeances<input type="text" name="quotaSeances">
				</td>

				<td><input type="submit" value="modif" name="action"></td>
			</tr>

		</table>

	</form:form>


	<hr color="blue">


	<table class="table table-striped">
		<tr>
			<th>id</th>
			<th>nom</th>
			<th>quotaSeances</th>
			<th>enseignants</th>
		</tr>

		<c:forEach items="${allGrade}" var="ens">
			<tr>
				<td>${ens.id}</td>
				<td>${ens.nom}</td>
				<td>${ens.quotaSeances}</td>
				<td>${ens.enseignants}</td>
			</tr>
		</c:forEach>

	</table>

	<form:form action="findGrade" method="get">
	<table class="table table-striped">
	<tr>id<input type="text" name="id">
				</tr>
		<tr><input type="submit" value="find" name="action"></tr>
		</table>
	</form:form>

	<table class="table table-striped">
		<tr>
			<th>id</th>
			<th>nom</th>
			<th>quotaSeances</th>
			<th>enseignants</th>
		</tr>

		<tr>
			<td>${findGrade.id}</td>
			<td>${findGrade.nom}</td>
			<td>${findGrade.quotaSeances}</td>
			<td>${findGrade.enseignants}</td>
		</tr>

	</table>
	
	
</body>
</html>