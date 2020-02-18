<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Enseignants</title>
</head>
<body>

	<form:form action="ajout" method="post">
		<!-- 	'class' pour indiquer le template de style à utiliser, ex : <form class="table table-striped"> -->
		<table>
			<tr>
				<td>id<input type="text" name="id">
				</td>
				<td>nom<input type="text" name="nom">
				</td>
				<td>prenom<input type="text" name="prenom">
				</td>
				<td>grade<input type="text" name="grade">
				</td>
				<td>matiere<input type="text" name="matiere">
				</td>
				<td>adresse<input type="text" name="adresse">
				</td>
				<td>numTel<input type="text" name="numTel">
				</td>
				<td>mail<input type="text" name="mail">
				</td>
				<td>seances<input type="text" name="seances">
				</td>
				<td>username<input type="text" name="username">
				</td>
				<td>password<input type="text" name="password">
				</td>
				<td>role<input type="text" name="role">
				</td>

				<td><input type="submit" value="ajout" name="action"></td>
			</tr>

		</table>

	</form:form>


	<form:form action="suppr" method="delete">
		<!-- 	'class' pour indiquer le template de style à utiliser, ex : <form class="table table-striped"> -->
		<table>

			<tr>
				<td>id<input type="text" name="id">
				</td>

				<td><input type="submit" value="suppr" name="action"></td>
			</tr>
		</table>

	</form:form>

	<form:form action="modif" method="post">
		<!-- 	'class' pour indiquer le template de style à utiliser, ex : <form class="table table-striped"> -->
		<table>

			<tr>
				<td>id<input type="text" name="id">
				</td>
				<td>nom<input type="text" name="nom">
				</td>
				<td>prenom<input type="text" name="prenom">
				</td>
				<td>grade<input type="text" name="grade">
				</td>
				<td>matiere<input type="text" name="matiere">
				</td>
				<td>adresse<input type="text" name="adresse">
				</td>
				<td>numTel<input type="text" name="numTel">
				</td>
				<td>mail<input type="text" name="mail">
				</td>
				<td>seances<input type="text" name="seances">
				</td>
				<td>username<input type="text" name="username">
				</td>
				<td>password<input type="text" name="password">
				</td>
				<td>role<input type="text" name="role">
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
			<th>prenom</th>
			<th>grade</th>
			<th>matiere</th>
			<th>adresse</th>
			<th>numTel</th>
			<th>mail</th>
			<th>seances</th>
			<th>username</th>
			<th>password</th>
			<th>role</th>
		</tr>

		<c:forEach items="${allEnseignant}" var="ens">
			<tr>
				<td>${ens.id}</td>
				<td>${ens.nom}</td>
				<td>${ens.prenom}</td>
				<td>${ens.grade}</td>
				<td>${ens.matiere}</td>
				<td>${ens.adresse}</td>
				<td>${ens.numTel}</td>
				<td>${ens.mail}</td>
				<td>${ens.seances}</td>
				<td>${ens.nusername}</td>
				<td>${ens.password}</td>
				<td>${ens.role}</td>
			</tr>
		</c:forEach>

	</table>

	<form:form action="find" method="get">
		<td><input type="submit" value="find" name="action"></td>
	</form:form>

	<table>
		<tr>
			<th>id</th>
			<th>nom</th>
			<th>prenom</th>
			<th>grade</th>
			<th>matiere</th>
			<th>adresse</th>
			<th>numTel</th>
			<th>mail</th>
			<th>seances</th>
			<th>username</th>
			<th>password</th>
			<th>role</th>
		</tr>

		<tr>
			<td>${findEnseignant.id}</td>
			<td>${findEnseignant.nom}</td>
			<td>${findEnseignant.prenom}</td>
			<td>${findEnseignant.grade}</td>
			<td>${findEnseignant.matiere}</td>
			<td>${findEnseignant.adresse}</td>
			<td>${findEnseignant.numTel}</td>
			<td>${findEnseignant.mail}</td>
			<td>${findEnseignant.seances}</td>
			<td>${findEnseignant.nusername}</td>
			<td>${findEnseignant.password}</td>
			<td>${findEnseignant.role}</td>
		</tr>

	</table>
</body>
</html>