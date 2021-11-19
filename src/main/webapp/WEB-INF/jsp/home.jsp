<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Parcel Sandbox</title>
    <link rel="preconnect" href="https://fonts.googleapis.com" />
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin />
    <link
            href="https://fonts.googleapis.com/css2?family=Gluten:wght@500&family=Lato:wght@900&display=swap"
            rel="stylesheet"
    />
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <meta charset="UTF-8" />
    <style>
        body {
            font-family: sans-serif;
        }

        #app {
            padding-top: 4px;
            text-align: center;
            align-items: center;
            justify-content: center;
            margin-left: 200px;
            margin-top: 150px;
            height: 250px;
            width: 250px;
            box-shadow: 0 0 3px gray;
        }

        a {
            margin-left: 80px;
            display: block;
            margin-top: 20px;
            text-decoration: none;
            color: palegreen;
            height: 30px;
            width: 100px;
            background-color: gray;
        }

        a:nth-child(1) {
            margin-top: 80px;
        }

        a:hover {
            opacity: 60%;
        }

        #home-header-text {
            color: gray;
            font-family: "Lato sans-serif";
            font-weight: 900px;
            font-size: 25px;
        }

        div p {
            margin-top: 30px;
            margin-left: 125px;
            height: 90px;
            width: 400px;
        }
    </style>
</head>

<body>
<%--<div>--%>
<%--&lt;%&ndash;    <p&ndash;%&gt;--%>
<%--&lt;%&ndash;            id="home-header-text"&ndash;%&gt;--%>
<%--&lt;%&ndash;            style="align-content: center; align-items: center;"&ndash;%&gt;--%>
<%--&lt;%&ndash;    >&ndash;%&gt;--%>
<%--&lt;%&ndash;        Welcome to the Grand Slam app! Hit the Signup button to register or hit&ndash;%&gt;--%>
<%--&lt;%&ndash;        the Login if you are an existing user&ndash;%&gt;--%>
<%--&lt;%&ndash;    </p>&ndash;%&gt;--%>
<%--</div>--%>
<div class="card" style="margin-top:130px;margin-left:700px;height:400px;width: 40rem;text-align: center">
    <div class="card-body" style="margin-right: 20px;">
        <h5 class="card-title">WELCOME TO GRAND SLAM</h5>
        <p class="card-text" style="">Click SIGNUP to register or login if you already have an account</p>
        <a href="login" class="btn btn-primary" style="background-color:green">LOGIN</a>
        <a href="signup" class="btn btn-primary" style="background-color:green">SIGNUP</a>
    </div>
</div>
</body>
</html>
