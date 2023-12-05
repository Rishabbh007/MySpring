<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

<title>Insert title here</title>

</head>
<body>

	<div class="container mt-5 ">

		<h3 class="text-center">${Header}</h3>
		<p class="text-center">${desc }</p>
		<hr>
		
		<h1>Welcome , "${user.userName }"</h1>
		<h1>Your email is "${user.email }"</h1>

		<h1>Your password is "${user.password }" try to secure the
			password</h1>


	</div>
</body>
</html>