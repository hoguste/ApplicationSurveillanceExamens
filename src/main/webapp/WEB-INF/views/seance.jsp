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

	<form:form action="ajoutSeance" method="post">
		<!-- 	'class' pour indiquer le template de style à utiliser, ex : <form class="table table-striped"> -->
		<table>
			<tr>
				<td>id<input type="text" name="id">
				</td>
				
				<td>type
				<select name="type" multiple=no size=3>
				<option >Examen principal</option>
				<option >Contrôle</option>
				<option >Devoir surveillé</option>
				</select>
				</td>
				
				<td>dateDebut<input type="text" name="dateDebut">
				</td>
				
				<td>duree
				<select name="duree" multiple=no size=2>
				<option >120</option>
				<option >90</option>
				</select>
				</td>
				
				<td>Enseignant1
				<select name="enseignant1.id" multiple=no size=3>
				<c:forEach items="${allEnseignant}" var="ens">
				<option value ="${ens.id}">${ens.nom}</option>
				</c:forEach>
				</select>
				</td>
				
				<td>Enseignant2
				<select name="enseignant2.id" multiple=no size=3>
				<c:forEach items="${allEnseignant}" var="ens">
				<option value ="${ens.id}">${ens.nom}</option>
				</c:forEach>
				</select>
				</td>
				
				<td>Salle
				<select name="salle.id" multiple=no size=3>
				<c:forEach items="${allSalle}" var="ens">
				<option value ="${ens.id}">${ens.id}</option>
				</c:forEach>
				</select>
				</td>
				
				<td>matiere<input type="text" name="matiere">
				</td>
				<td>dateFin<input type="text" name="dateFin">
				</td>

				<td><input type="submit" value="ajout" name="action"></td>
			</tr>

		</table>

	</form:form>


	<form:form action="supprSeance" method="post">
		<!-- 	'class' pour indiquer le template de style à utiliser, ex : <form class="table table-striped"> -->
		<table>

			<tr>
				<td>id<input type="text" name="id">
				</td>

				<td><input type="submit" value="suppr" name="action"></td>
			</tr>
		</table>

	</form:form>

	<form:form action="modifSeance" method="post">
		<!-- 	'class' pour indiquer le template de style à utiliser, ex : <form class="table table-striped"> -->
		<table>

			<tr>
				<td>id<input type="text" name="id">
				</td>
				
				<td>type
				<select name="type" multiple=no size=3>
				<option >Examen principal</option>
				<option >Contrôle</option>
				<option >Devoir surveillé</option>
				</select>
				</td>
				
				<td>dateDebut<input type="text" name="dateDebut">
				</td>
				
				<td>duree
				<select name="duree" multiple=no size=2>
				<option >120</option>
				<option >90</option>
				</select>
				</td>
				
				<td>Enseignant1
				<select name="enseignant1.id" multiple=no size=3>
				<c:forEach items="${allEnseignant}" var="ens">
				<option value ="${ens.id}">${ens.nom}</option>
				</c:forEach>
				</select>
				</td>
				
				<td>Enseignant2
				<select name="enseignant2.id" multiple=no size=3>
				<c:forEach items="${allEnseignant}" var="ens">
				<option value ="${ens.id}">${ens.nom}</option>
				</c:forEach>
				</select>
				</td>
				
				<td>Salle
				<select name="salle.id" multiple=no size=3>
				<c:forEach items="${allSalle}" var="ens">
				<option value ="${ens.id}">${ens.id}</option>
				</c:forEach>
				</select>
				</td>
				
				<td>matiere<input type="text" name="matiere">
				</td>
				<td>dateFin<input type="text" name="dateFin">
				</td>

				<td><input type="submit" value="ajout" name="action"></td>
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
			<th>enseignant1</th>
			<th>enseignant2</th>
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
				<td>${ens.enseignant1}</td>
				<td>${ens.enseignant2}</td>
				<td>${ens.salle}</td>
				<td>${ens.matiere}</td>
				<td>${ens.dateFin}</td>
			</tr>
		</c:forEach>

	</table>

	<form:form action="findSeance" method="get">
	<table>
	<tr>id<input type="text" name="id">
				</tr>
		<tr><input type="submit" value="find" name="action"></tr>
		</table>
	</form:form>

		<table>
		<tr>
			<th>id</th>
			<th>type</th>
			<th>dateDebut</th>
			<th>duree</th>
			<th>enseignant1</th>
			<th>enseignant2</th>
			<th>salle</th>
			<th>matiere</th>
			<th>dateFin</th>
		</tr>

		<tr>
			<td>${findSeance.id}</td>
			<td>${findSeance.type}</td>
			<td>${findSeance.dateDebut}</td>
			<td>${findSeance.duree}</td>
			<td>${findSeance.enseignant1}</td>
			<td>${findSeance.enseignant2}</td>
			<td>${findSeance.salle}</td>
			<td>${findSeance.matiere}</td>
			<td>${findSeance.dateFin}</td>
		</tr>

	</table>
	<input type="button" value="Retour accueil"
		onclick="window.location.href='http://localhost:8070/home'">
</body>
</html>