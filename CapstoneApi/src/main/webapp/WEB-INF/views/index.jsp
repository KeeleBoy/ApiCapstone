<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!doctype html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Flickbuster Movies</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
<link rel="stylesheet" href="/style.css" />
</head>
<body>
	<div class="bg">
	<a href="/"> <img src="/images/movie-project-overlay.png" alt="logo and menu overlay" width="100%"> </a>
		<div class="center3">

			<form action="/search-results">
				<p>
					<label>Enter Title (Required)</label> <input name="search"
						placeholder="title" required>
				</p>

				<p>
					Choose Type &nbsp; &nbsp;
					<label>Movie<input type="radio" name="type" value="movie"></label>
					<label>Game<input type="radio" name="type" value="game"></label>
					<label>Series<input type="radio" name="type" value="series"></label>
				</p>

				<p>
					<label>Enter Year</label> <input name="year" placeholder="year">
				</p>
				<button type="submit" class="btn btn-danger">Search</button>
				

			</form>

<br> <a class="btn btn-primary" href="viewlist" role="button">Show the view list page</a>

		</div>
	</div>
</body>
</html>