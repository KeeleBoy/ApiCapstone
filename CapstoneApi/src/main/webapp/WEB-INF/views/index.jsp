<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!doctype html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Let's take a trip</title>
<link rel="stylesheet" href="/style.css" />
</head>
<body>
	<div class="bg">
		<div class="center3">
<p>Welcome, ${user.name }</p>
			<form action="/search-results">
				<p>
					<label>Enter Title (Required)</label> <input name="search"
						placeholder="title" required>
				</p>

				<p>
					<label>Enter Type</label> <label>Movie<input type="radio"
						name="type" value="movie"></label> <label>Game<input
						type="radio" name="type" value="game"></label> <label>Series<input
						type="radio" name="type" value="series"></label>
				</p>

				<p>
					<label>Enter Year</label> <input name="year" placeholder="year">
				</p>
				<button type="submit">Search</button>

			</form>



		</div>
	</div>
</body>
</html>