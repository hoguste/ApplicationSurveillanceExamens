<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Page des administrateurs</title>
</head>
<body>

	<form action="ajout" method="post">
		<!-- 	'class' pour indiquer le template de style à utiliser, ex : <form class="table table-striped"> -->
		<table>
			<tr>
				<td>id<input type="text" name="id">
				</td>
				<td>nom<input type="text" name="nom">
				</td>
				<td>prenom<input type="text" name="prenom">
				</td>
				<td>master<input type="text" name="master">
				</td>
				<td>numTel<input type="text" name="numTel">
				</td>
				<td>mail<input type="text" name="mail">
				</td>
				<td>adresse<input type="text" name="adresse">
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

	</form>


	<form action="suppr" method="delete">
		<!-- 	'class' pour indiquer le template de style à utiliser, ex : <form class="table table-striped"> -->
		<table>

			<tr>
				<td>id<input type="text" name="id">
				</td>

				<td><input type="submit" value="suppr" name="action"></td>
			</tr>
		</table>

	</form>

	<form action="modif" method="post">
		<!-- 	'class' pour indiquer le template de style à utiliser, ex : <form class="table table-striped"> -->
		<table>

			<tr>
				<td>id<input type="text" name="id">
				</td>
				<td>nom<input type="text" name="nom">
				</td>
				<td>prenom<input type="text" name="prenom">
				</td>
				<td>master<input type="text" name="master">
				</td>
				<td>numTel<input type="text" name="numTel">
				</td>
				<td>mail<input type="text" name="mail">
				</td>
				<td>adresse<input type="text" name="adresse">
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

	</form>


	<hr color="blue">


	<table>
		<tr>
			<th>id</th>
			<th>nom</th>
			<th>prenom</th>
			<th>master</th>
			<th>numTel</th>
			<th>mail</th>
			<th>adresse</th>
			<th>username</th>
			<th>password</th>
			<th>role</th>
		</tr>

		<c:forEach items="${allAdmin}" var="ens">
			<tr>
				<td>${ens.id}</td>
				<td>${ens.nom}</td>
				<td>${ens.prenom}</td>
				<td>${ens.master}</td>
				<td>${ens.numTel}</td>
				<td>${ens.mail}</td>
				<td>${ens.adresse}</td>
				<td>${ens.username}</td>
				<td>${ens.password}</td>
				<td>${ens.role}</td>
			</tr>
		</c:forEach>

	</table>

	<form action="find" method="get">
		<p><input type="submit" value="find" name="action"></p>
	</form>

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
			<td>${findAdmin.id}</td>
			<td>${findAdmin.nom}</td>
			<td>${findAdmin.prenom}</td>
			<td>${findAdmin.grade}</td>
			<td>${findAdmin.matiere}</td>
			<td>${findAdmin.adresse}</td>
			<td>${findAdmin.numTel}</td>
			<td>${findAdmin.mail}</td>
			<td>${findAdmin.seances}</td>
			<td>${findAdmin.nusername}</td>
			<td>${findAdmin.password}</td>
			<td>${findAdmin.role}</td>
		</tr>

	</table>
	
	<input type="button" value="Retour accueil"
		onclick="window.location.href='http://localhost:8070/home'">
</body>
</html>