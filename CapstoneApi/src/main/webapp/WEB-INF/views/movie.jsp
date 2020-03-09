<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>Individual Item Page</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
<link rel="stylesheet" href="/style.css" />
</head>
<body>

	<div class="bg">
	<a href="/"> <img src="/images/movie-project-overlay.png" alt="logo and menu overlay" width="100%" /> </a>
		<div class="center3">

	<h3>${movie.title}</h3>
	<h5>${movie.type}</h5>

<table>
  <tr>
    <th>Release Year</th>
    <th>Genre</th>
    <th>Director</th>
    <th>Main Cast</th>
    <th>Imdb Rating</th>
    
  </tr>
  <tr>
    <td>${movie.year }</td>
    <td>${movie.genre }</td>
    <td>${movie.director }</td>
    <td>${movie.actors }</td>
    <td>${movie.imdbRating }</td>
  </tr>
</table>

<a href="/">Back to Search</a>
	

</div>
</div>

</body>
</html>