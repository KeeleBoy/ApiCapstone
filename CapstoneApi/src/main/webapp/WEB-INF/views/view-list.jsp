<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
<link rel="stylesheet" href="/style.css" />
<meta charset="ISO-8859-1">
<title>View List</title>
</head>
<body>

	<div class="bg">
	<a href="/"> <img src="/images/movie-project-overlay.png" alt="logo and menu overlay" width="100%" /> </a>
		<div class="center2">

	<h1>View List!</h1>

	<table class="table-sm">
		<tr>
			<th>Title</th>
			<th>Type</th>
			<th>Year</th>
			<th>Delete</th>
			<th>Favorite</th>
		</tr>
		<c:forEach var="movie" items="${view}">

			<tr>
				<td><a href="/movie/${movie.imdbID }" name="id">${movie.title }</a></td>
				<td>${movie.type}</td>
				<td>${movie.year}</td>
				<td><form action="/delete">
						<button type="submit" class="btn btn-secondary btn-sm" name="id" value="${movie.imdbID }">Delete</button>
					</form></td>
				<td><form action="/favorite">
						<button name="id" class="btn btn-secondary btn-sm" value="${movie.imdbID }">
							<c:choose>
								<c:when test="${movie.favorite}">
  										Yes
									  </c:when>
								<c:when test="${!movie.favorite}">
									  	No
										</c:when>
							</c:choose>
						</button>
					</form>
			</tr>

		</c:forEach>

	</table>
	<br> <a class="btn btn-primary" href="/" role="button">Show the search page</a>
</div>
</div>

</body>
</html>