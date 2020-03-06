<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<%@ include file="partials/header.jsp"%>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
<link rel="stylesheet" href="/style.css" />
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	<main>
		<section class="container">

			<div class="card text-center"></div>
			<div class="card-header">
				<h4>${message}</h4>
			</div>

			<h2>Login</h2>
			<div class="card-body">

				<form action="/login" method="post">
					<label>Name</label> <input name="name" type="text" required>
					<label>Password</label> <input name="password" type="password"
						required>
					<button type="submit">Login!</button>

				</form>

			</div>

		</section>

	</main>

</body>
</html>