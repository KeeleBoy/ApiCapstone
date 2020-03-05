<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>

<%@ include file="partials/header.jsp"%>

<meta charset="UTF-8">
<title>Result</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
<link rel="stylesheet" href="/MyStyle.css" />
</head>
<body>

	<table>
		<tr>
			<th>Title</th>
			<th>Date</th>
			<th>Type</th>
			<th>Id</th>
		</tr>
		<c:forEach items="${movies}" var="movie">
			<tr>
				<td><a href="/movie/${movie.imdbID }" name="id">${movie.title }</a></td>
				<td>${movie.year }</td>
				<td>${movie.genre }</td>
				<td>${movie.imdbID }</td>
			</tr>
		</c:forEach>
	</table>


</body>
</html>