<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <style>

        body {
            background-color: whitesmoke;
        }

        table {
            margin-top:200px;
            margin-left: 600px;
            width: 40%;
        }

        table {
            border-collapse: collapse;
            font-size: 0.9em;
            font-family: sans-serif;
            min-width: 400px;
            box-shadow: 0 0 20px rgba(0, 0, 0, 0.15);
        }

        table th {
            background-color: #009879;
            color: #ffffff;
            text-align: left;
        }

        table th, td {
            height: 10px;
            padding: 12px 15px;
        }

        table tr:nth-child(even) {
            background-color:rgba(250,250,250,0.8);
        }

        .tableRows {
            color: black;
        }


        section {
            margin-bottom: 20px;
        }

        ul {
            list-style-type: none;
            align-items: center;
        }

        .horizontalDashboard {
            width: 70%;
            margin-left: 50px;
            border-bottom: 2px;
        }

        .tableContainer {
            box-shadow: 0 3px 5px gray;
            background-color: white;
            text-align: center;
            justify-content: center;
            margin-left: 400px;
        }

        h3 {
            color: gray;
        }
        /*#editButton {*/
        /*    text-decoration: none;*/
        /*    background-color:gray;*/
        /*    height:10px;*/
        /*    width:10px;*/
        /*}*/

        /*#deleteButton {*/
        /*    text-decoration: none;*/
        /*    background-color:red;*/
        /*    height:10px;*/
        /*    width:10px;*/
        /*}*/
    </style>
</head>
<body>
<header style="text-align:center;color:white;background-color:black;width:100%;height:90px;"><h2 style="top:20px;display: inline">ADMIN</h2></header>
<table>
    <tr style="background-color:black;text-align:center;color:white"><td>ADMIN</td></tr>
    <tr>
        <td>ID</td>
        <td>First Name</td>
        <td>Last Name</td>
        <td>Email</td>
        <td>Password</td>
    </tr>
    <c:forEach items="${users}" var="user">
        <tr>
            <td>${user.id}</td>
            <td>${user.firstName}</td>
            <td>${user.lastName}</td>
            <td>${user.email}</td>
            <td>${user.password}</td>
            <td id="editButton"><a href="admin/edit/${user.id}">Edit</a></td>
            <td id="deleteButton"><a href="admin/delete/${user.id}">Delete</a></td>
        </tr>
    </c:forEach>
</table>

</body>
</html>