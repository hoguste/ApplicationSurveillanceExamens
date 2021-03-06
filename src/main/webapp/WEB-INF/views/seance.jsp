<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Page des seances</title>
</head>
<body>

	<form:form action="ajout" method="post">
		<!-- 	'class' pour indiquer le template de style � utiliser, ex : <form class="table table-striped"> -->
		<table>
			<tr>
				<td>id<input type="text" name="id">
				</td>
				<td>type<input type="text" name="type">
				</td>
				<td>dateDebut<input type="text" name="dateDebut">
				</td>
				<td>duree<input type="text" name="duree">
				</td>
				<td>enseignants<input type="text" name="enseignants">
				</td>
				<td>salle<input type="text" name="salle">
				</td>
				<td>matiere<input type="text" name="matiere">
				</td>
				<td>dateFin<input type="text" name="dateFin">
				</td>

				<td><input type="submit" value="ajout" name="action"></td>
			</tr>

		</table>

	</form:form>


	<form:form action="suppr" method="delete">
		<!-- 	'class' pour indiquer le template de style � utiliser, ex : <form class="table table-striped"> -->
		<table>

			<tr>
				<td>id<input type="text" name="id">
				</td>

				<td><input type="submit" value="suppr" name="action"></td>
			</tr>
		</table>

	</form:form>

	<form:form action="modif" method="post">
		<!-- 	'class' pour indiquer le template de style � utiliser, ex : <form class="table table-striped"> -->
		<table>

			<tr>
				<td>id<input type="text" name="id">
				</td>
				<td>type<input type="text" name="type">
				</td>
				<td>dateDebut<input type="text" name="dateDebut">
				</td>
				<td>duree<input type="text" name="duree">
				</td>
				<td>enseignants<input type="text" name="enseignants">
				</td>
				<td>salle<input type="text" name="salle">
				</td>
				<td>matiere<input type="text" name="matiere">
				</td>
				<td>dateFin<input type="text" name="dateFin">
				</td>

				<td><input type="submit" value="modif" name="action"></td>
			</tr>

		</table>

	</form:form>


	<hr color="blue">


	<table>
		<tr>
			<th>id</th>
			<th>type</th>
			<th>dateDebut</th>
			<th>duree</th>
			<th>enseignants</th>
			<th>salle</th>
			<th>matiere</th>
			<th>dateFin</th>
		</tr>

		<c:forEach items="${allSeance}" var="ens">
			<tr>
				<td>${ens.id}</td>
				<td>${ens.type}</td>
				<td>${ens.dateDebut}</td>
				<td>${ens.duree}</td>
				<td>${ens.enseignants}</td>
				<td>${ens.salle}</td>
				<td>${ens.matiere}</td>
				<td>${ens.dateFin}</td>
			</tr>
		</c:forEach>

	</table>

	<form:form action="find" method="get">
		<td><input type="submit" value="find" name="action"></td>
	</form:form>

	<table>
		<tr>
			<th>id</th>
			<th>type</th>
			<th>dateDebut</th>
			<th>duree</th>
			<th>enseignants</th>
			<th>salle</th>
			<th>matiere</th>
			<th>dateFin</th>
		</tr>

		<tr>
			<td>${findSeance.id}</td>
			<td>${findSeance.type}</td>
			<td>${findSeance.dateDebut}</td>
			<td>${findSeance.duree}</td>
			<td>${findSeance.enseignants}</td>
			<td>${findSeance.salle}</td>
			<td>${findSeance.matiere}</td>
			<td>${findSeance.dateFin}</td>
		</tr>

	</table>
	<input type="button" value="Retour accueil"
		onclick="window.location.href='http://localhost:8070/home'">
</body>
</html>