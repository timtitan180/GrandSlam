<%@ page language="java" contentType="Text/html;charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<title></title>
<body>

	<h1>TEST PAGE</h1>
	<form action="/index/{name}" method="post">
		<input name="name" placeholder="Enter Name"></input> <input
			name="password" placeholder="Enter password"></input>
		<button>Submit</button>
	</form>
	parameter name = ${name};

</body>
</html>