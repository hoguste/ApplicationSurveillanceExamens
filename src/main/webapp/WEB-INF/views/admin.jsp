<%@ page language="java" contentType="text/html; charset=ISO-8859-1"

	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Administrateurs</title>

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

    <li class="breadcrumb-item active" aria-current="page">Administrateurs</li>

  </ol>

</nav>

<body>



	<form action="ajoutAdmin" method="post">

		<!-- 	'class' pour indiquer le template de style à utiliser, ex : <form class="table table-striped"> -->

		<table class="table table-striped">

			<tr>

				<td>id<input type="text" name="id">

				</td>

				<td>nom<input type="text" name="nom">

				</td>

				<td>prenom<input type="text" name="prenom">

				</td>

				<td>Master

				<select name="master" multiple=no size=2>

				<option value ="true">Oui</option>

				<option value ="false">Non</option>

				</select>

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

				<td>role

				<select name="role" multiple=no size=2>

				<option value ="master">Master</option>

				<option value ="admin">Admin</option>

				</select>

				</td>



				<td><input type="submit" value="ajout" name="action"></td>

			</tr>



		</table>



	</form>





	<form action="supprAdmin" method="post">

		<!-- 	'class' pour indiquer le template de style à utiliser, ex : <form class="table table-striped"> -->

		<table class="table table-striped">



			<tr>

				<td>id<input type="text" name="id">

				</td>



				<td><input type="submit" value="suppr" name="action"></td>

			</tr>

		</table>



	</form>



	<form action="modifAdmin" method="post">

		<!-- 	'class' pour indiquer le template de style à utiliser, ex : <form class="table table-striped"> -->

		<table class="table table-striped">



			<tr>

				<td>id<input type="text" name="id">

				</td>

				<td>nom<input type="text" name="nom">

				</td>

				<td>prenom<input type="text" name="prenom">

				</td>

				<td>Master

				<select name="master" multiple=no size=2>

				<option value ="true">Oui</option>

				<option value ="false">Non</option>

				</select>

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

				<td>role

				<select name="role" multiple=no size=2>

				<option value ="master">Master</option>

				<option value ="admin">Admin</option>

				</select>

				</td>



				<td><input type="submit" value="modif" name="action"></td>

			</tr>



		</table>



	</form>





	<hr color="blue">





	<table class="table table-striped">

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



	<form action="findAdmin" method="get">

	<table class="table table-striped">

	<tr>id<input type="text" name="id">

				</tr>

		<tr><input type="submit" value="find" name="action"></tr>

		</table>

	</form>



	<table class="table table-striped">

		<tr>

			<th>id</th>

			<th>nom</th>

			<th>prenom</th>

			<th>numTel</th>

			<th>mail</th>

			<th>master</th>

			<th>adresse</th>

			<th>username</th>

			<th>password</th>

			<th>role</th>

		</tr>



		<tr>

			<td>${findAdmin.id}</td>

			<td>${findAdmin.nom}</td>

			<td>${findAdmin.prenom}</td>

			<td>${findAdmin.master}</td>

			<td>${findAdmin.numTel}</td>

			<td>${findAdmin.mail}</td>

			<td>${findAdmin.adresse}</td>

			<td>${findAdmin.username}</td>

			<td>${findAdmin.password}</td>

			<td>${findAdmin.role}</td>

		</tr>



	</table>

	

	

</body>

</html>