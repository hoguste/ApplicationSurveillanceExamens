<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Page des grades</title>
</head>
<body>

	<form:form action="ajoutGrade" method="post">
		<!-- 	'class' pour indiquer le template de style à utiliser, ex : <form class="table table-striped"> -->
		<table>
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
		<table>

			<tr>
				<td>id<input type="text" name="id">
				</td>

				<td><input type="submit" value="suppr" name="action"></td>
			</tr>
		</table>

	</form:form>

	<form:form action="modifGrade" method="post">
		<!-- 	'class' pour indiquer le template de style à utiliser, ex : <form class="table table-striped"> -->
		<table>

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


	<table>
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
	<table>
	<tr>id<input type="text" name="id">
				</tr>
		<tr><input type="submit" value="find" name="action"></tr>
		</table>
	</form:form>

	<table>
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
	
	<input type="button" value="Retour accueil"
		onclick="window.location.href='http://localhost:8070/home'">
</body>
</html>