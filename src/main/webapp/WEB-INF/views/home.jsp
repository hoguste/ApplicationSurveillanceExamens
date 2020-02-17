<%-- <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> --%>
<%@ page session="false"%>
<html>
<head>
<title>Page d'accueil</title>
</head>
<body>
	<h1>Accueil</h1>



	<input type="button" value="Page des clients"
		onclick="window.location.href='http://localhost:8070/client'">
		<input type="button" value="Page des utilisateurs"
		onclick="window.location.href='http://localhost:8070/users'">
		<input type="button" value="Page des menus"
		onclick="window.location.href='http://localhost:8070/menu'">
		<input type="button" value="Page des plats"
		onclick="window.location.href='http://localhost:8070/plat'">
		<input type="button" value="Page des reservations"
		onclick="window.location.href='http://localhost:8070/reservation'">
		<p>
		<form action="logout" method="post">
		<input type="submit" value="Déconnection" name="action"> 
		</form>
		</p>


</body>
</html>
