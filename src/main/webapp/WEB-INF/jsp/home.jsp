<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Home Page</title>
    <meta charset="UTF-8"/>
    <style>
        body {
            background-color: rgba(250, 250, 250, 0.2);
            font-family: sans-serif;
        }

        .container {
            margin-top: 150px;
            margin-left: 200px;
            align-content: center;
            justify-content: center;
            text-align: center;
            box-shadow: 2px 5px 6px gray;
            color: white;
            height: 200px;
            width: 200px;
            border: 1px solid gray;
        }

        .link-container {
            margin-left: 25%;
            padding-top: 10px;
            width: 50%;
            margin-top: 50px;
            background-color: teal;
            color: white;
            text-decoration: none;
        }

        .link-container a {
            text-decoration: none;
            color: white;
        }

    </style>
</head>

<body>
<h2>WELCOME TO THE GRAND SLAM APP</h2>
<h3>Click SignUp TO Register or Login if you are an existing User</h3>
    <div class="container">
    <div class="link-container"><a href="/signup">SIGNUP</a></div>
    <div class="link-container"><a href="/login">LOGIN</a></div>
    </div>
    </body>
    </html>
