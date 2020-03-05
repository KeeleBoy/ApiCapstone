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
<title>Index</title>
</head>
<body>

<form action="/search-results">
<p>
<label>Enter Title (Required)</label>
<input name="search" placeholder="title" required>
</p>

<p>
<label>Enter Type</label>
<label>Movie<input type="radio" name="type" value ="movie"></label>
<label>Game<input type="radio" name="type" value ="game"></label>
<label>Series<input type="radio" name="type" value ="series"></label>
</p>

<p><label>Enter Year</label>
<input name="year" placeholder="year">
</p>
<button type="submit">Search</button>

</form>



</body>
</html>