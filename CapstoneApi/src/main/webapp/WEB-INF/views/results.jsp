<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>


<meta charset="UTF-8">
<title>Search Results</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
<link rel="stylesheet" href="/style.css" />
</head>
<body>

	<div class="bg">
	<a href="/"> <img src="/images/movie-project-overlay.png" alt="logo and menu overlay" width="100%" /> </a>
		<div class="center2">

	<p>${result}</p>

	<table class="table-sm">
		<tr>
			<th>Title</th>
			<th>Date</th>
			<th>Type</th>
			<th>Id</th>
			<th>Favorite?</th>
		</tr>
		<c:forEach items="${movies}" var="movie">
			<tr>
				<td><a href="/movie/${movie.imdbID }" name="id">${movie.title }</a></td>
				<td>${movie.year }</td>
				<td>${movie.genre }</td>
				<td>${movie.imdbID }</td>
				<td><form action="/movies">
						<button type="submit" class="btn btn-secondary btn-sm" name="id" value="${movie.imdbID }">Add
							to Viewlist</button>
					</form></td>
			</tr>
		</c:forEach>
	</table>

</div>
</div>
</body>
</html>