<%@taglib uri = "http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org"
	  xmlns:sec="https://www.thymeleaf.org/thymeleaf-extras-springsecurity5">
<head>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
<style>
header {
  width: 100%;
  height: 40px;
  margin-bottom: 60px;
  overflow: hidden;
  border-bottom: 1px solid gray;
  padding-left: 20px;
  padding-right: 20px;
}

header ul {
  list-style-type: none;
  display: inline-block;
}


form {
	margin-top:300px;
	border-radius:4px;
	box-shadow: 0 0 4px gray;
	margin-left: 800px;
	height:300px;
	width:400px;

}

form input {
	width:20%;
}

button {
	margin-top:20px;
	margin-left:150px;
}

.footer {
  font-size: small;
	margin-left:600px;
  margin-bottom: 0;
  margin-left: 200px;
  margin-top: 250px;
  list-style-type: none;
}

#logout {
	height:20px;
	width:20px;
	background-color:red;
	color:white;
	border-radius:20px;
}

.container {
	padding-left:80px;
	width:2000px;
	margin-top:300px;
}

</style>
</head>
<body>
<h2>LOGIN</h2>
<form action="login/user" method="POST">
	<p style="color:red">${error}</p>
	<div class="mb-3">
		<label for="exampleInputEmail1" class="form-label">Email Address</label>
		<input type="email" name="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
	</div>
	<div class="mb-3">
		<label for="exampleInputPassword1" class="form-label">Password</label>
		<input type="password" name="password" class="form-control" id="exampleInputPassword1">
	</div>
	<button type="submit" class="btn btn-primary">Log In</button>
</form>
<div class="container">
	<footer class="d-flex flex-wrap justify-content-between align-items-center py-3 my-4 border-top">
		<p class="col-md-4 mb-0 text-muted">&copy; 2021 Company, Inc</p>

		<a href="/" class="col-md-4 d-flex align-items-center justify-content-center mb-3 mb-md-0 me-md-auto link-dark text-decoration-none">
			<svg class="bi me-2" width="40" height="32"><use xlink:href="#bootstrap"/></svg>
		</a>

		<ul class="nav col-md-4 justify-content-end">
			<li class="nav-item"><a href="#" class="nav-link px-2 text-muted">Home</a></li>
			<li class="nav-item"><a href="#" class="nav-link px-2 text-muted">Features</a></li>
			<li class="nav-item"><a href="#" class="nav-link px-2 text-muted">Pricing</a></li>
			<li class="nav-item"><a href="#" class="nav-link px-2 text-muted">FAQs</a></li>
			<li class="nav-item"><a href="#" class="nav-link px-2 text-muted">About</a></li>
		</ul>
	</footer>
</div>
</body>
</html>