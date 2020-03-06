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
<title>View List</title>
</head>
<body>
	<h1>View list!</h1>


	<table>
		<tr>
			<th>Title</th>
			<th>Type</th>
			<th>Year</th>
		</tr>
		<c:forEach var="movie" items="${view}">

			<tr>
				<td>${movie.title}</td>
				<td>${movie.type}</td>
				<td>${movie.year}</td>
				<td><form action="/delete">
						<button type="submit" name="id" value="${movie.imdbID }">Delete</button>
					</form></td>
				<td><form action="/favorite">
						<button name="id" value="${movie.imdbID }">
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


</body>
</html>