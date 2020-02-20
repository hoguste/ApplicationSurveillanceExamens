<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Page des salles</title>
</head>
<body>

	<form:form action="ajoutSalle" method="post">
		<!-- 	'class' pour indiquer le template de style à utiliser, ex : <form class="table table-striped"> -->
		<table>
			<tr>
				<td>id<input type="text" name="id">
				</td>
				<td>capacite<input type="text" name="capacite">
				</td>
				<td>batiment<input type="text" name="batiment">
				</td>
				<td>etage<input type="text" name="etage">
				</td>
				<td>TP
				<select name="tp" multiple=no size=2>
				<option value ="true">Oui</option>
				<option value ="false">Non</option>
				</select>
				</td>
				

				<td><input type="submit" value="ajout" name="action"></td>
			</tr>

		</table>

	</form:form>


	<form:form action="supprSalle" method="post">
		<!-- 	'class' pour indiquer le template de style à utiliser, ex : <form class="table table-striped"> -->
		<table>

			<tr>
				<td>id<input type="text" name="id">
				</td>

				<td><input type="submit" value="suppr" name="action"></td>
			</tr>
		</table>

	</form:form>

	<form:form action="modifSalle" method="post">
		<!-- 	'class' pour indiquer le template de style à utiliser, ex : <form class="table table-striped"> -->
		<table>

			<tr>
				<td>id<input type="text" name="id">
				</td>
				<td>capacite<input type="text" name="capacite">
				</td>
				<td>batiment<input type="text" name="batiment">
				</td>
				<td>etage<input type="text" name="etage">
				</td>
				<td>TP
				<select name="tp" multiple=no size=2>
				<option value ="true">Oui</option>
				<option value ="false">Non</option>
				</select>
				</td>
				

				<td><input type="submit" value="modif" name="action"></td>
			</tr>

		</table>

	</form:form>


	<hr color="blue">


	<table>
		<tr>
			<th>id</th>
			<th>capacite</th>
			<th>batiment</th>
			<th>etage</th>
			<th>tp</th>
			<th>seances</th>
		</tr>

		<c:forEach items="${allSalle}" var="ens">
			<tr>
				<td>${ens.id}</td>
				<td>${ens.capacite}</td>
				<td>${ens.batiment}</td>
				<td>${ens.etage}</td>
				<td>${ens.tp}</td>
				<td>${ens.seances}</td>
			</tr>
		</c:forEach>

	</table>

	<form:form action="findSalle" method="get">
	<table>
	<tr>id<input type="text" name="id">
				</tr>
		<tr><input type="submit" value="find" name="action"></tr>
		</table>
	</form:form>

	<table>
		<tr>
			<th>id</th>
			<th>capacite</th>
			<th>batiment</th>
			<th>etage</th>
			<th>tp</th>
			<th>seances</th>
		</tr>

		<tr>
			<td>${findSalle.id}</td>
			<td>${findSalle.capacite}</td>
			<td>${findSalle.batiment}</td>
			<td>${findSalle.etage}</td>
			<td>${findSalle.tp}</td>
			<td>${findSalle.seances}</td>
		</tr>

	</table>
	<input type="button" value="Retour accueil"
		onclick="window.location.href='http://localhost:8070/home'">
</body>
</html>