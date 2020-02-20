<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Enseignants</title>

<script src="jquery-3.4.1.min.js"></script>

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">

<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
	integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
	crossorigin="anonymous"></script>

</head>

<nav aria-label="breadcrumb">

<ol class="breadcrumb">

	<li class="breadcrumb-item"><a href="/">Accueil</a></li>

	<li class="breadcrumb-item active" aria-current="page">Enseignants</li>

</ol>

</nav>

<body>



	<form:form action="ajoutEnseignant" method="post">

		<!-- 	'class' pour indiquer le template de style à utiliser, ex : <form class="table table-striped"> -->

		<table class="table table-striped">

			<tr>

				<td>id<input type="text" name="id">

				</td>

				<td>nom<input type="text" name="nom">

				</td>

				<td>prenom<input type="text" name="prenom">

				</td>



				<td>grade <select name="grade.id" multiple=no size=3>

						<c:forEach items="${allGrade}" var="grd">

							<option value="${grd.id}">${grd.nom}</option>

						</c:forEach>

				</select>

				</td>



				<td>matiere<input type="text" name="matiere">

				</td>

				<td>adresse<input type="text" name="adresse">

				</td>

				<td>numTel<input type="text" name="numTel">

				</td>

				<td>mail<input type="text" name="mail">

				</td>





				<td>username<input type="text" name="username">

				</td>

				<td>password<input type="text" name="password">

				</td>



				<td>role <select name="role" multiple=no size=1>

						<option value="enseignant">enseignant</option>

				</select>

				</td>







				<td><input type="submit" value="ajout" name="action"></td>

			</tr>



		</table>



	</form:form>





	<form:form action="supprEnseignant" method="post">

		<!-- 	'class' pour indiquer le template de style à utiliser, ex : <form class="table table-striped"> -->

		<table class="table table-striped">



			<tr>

				<td>id<input type="text" name="id">

				</td>



				<td><input type="submit" value="suppr" name="action"></td>

			</tr>

		</table>



	</form:form>



	<form:form action="modifEnseignant" method="post">

		<!-- 	'class' pour indiquer le template de style à utiliser, ex : <form class="table table-striped"> -->

		<table class="table table-striped">



			<tr>

				<td>id<input type="text" name="id">

				</td>

				<td>nom<input type="text" name="nom">

				</td>

				<td>prenom<input type="text" name="prenom">

				</td>



				<td>grade <select name="grade.id" multiple=no size=3>

						<c:forEach items="${allGrade}" var="grd">

							<option value="${grd.id}">${grd.nom}</option>

						</c:forEach>

				</select>

				</td>



				<td>matiere<input type="text" name="matiere">

				</td>

				<td>adresse<input type="text" name="adresse">

				</td>

				<td>numTel<input type="text" name="numTel">

				</td>

				<td>mail<input type="text" name="mail">

				</td>





				<td>username<input type="text" name="username">

				</td>

				<td>password<input type="text" name="password">

				</td>



				<td>role <select name="role" multiple=no size=1>

						<option value="enseignant">enseignant</option>

				</select>

				</td>







				<td><input type="submit" value="ajout" name="action"></td>

			</tr>



		</table>



	</form:form>





	<hr color="blue">





	<table class="table table-striped">

		<tr>

			<th>id</th>

			<th>nom</th>

			<th>prenom</th>

			<th>grade</th>

			<th>matiere</th>

			<th>adresse</th>

			<th>numTel</th>

			<th>mail</th>

			<th>seances1</th>

			<th>seances2</th>

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

				<td>${ens.seances1}</td>

				<td>${ens.seances2}</td>

				<td>${ens.username}</td>

				<td>${ens.password}</td>

				<td>${ens.role}</td>

			</tr>

		</c:forEach>



	</table>



	<form:form action="findEnseignant" method="get">

		<table class="table table-striped">

			<tr>
				id
				<input type="text" name="id">

			</tr>

			<tr>
				<input type="submit" value="find" name="action">
			</tr>

		</table>

	</form:form>



	<table class="table table-striped">

		<tr>

			<th>id</th>

			<th>nom</th>

			<th>prenom</th>

			<th>grade</th>

			<th>matiere</th>

			<th>adresse</th>

			<th>numTel</th>

			<th>mail</th>

			<th>seances1</th>

			<th>seances2</th>

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

			<td>${findEnseignant.seances1}</td>

			<td>${findEnseignant.seances2}</td>

			<td>${findEnseignant.username}</td>

			<td>${findEnseignant.password}</td>

			<td>${findEnseignant.role}</td>

		</tr>



	</table>





</body>

</html>