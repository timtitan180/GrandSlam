<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<title>showPlayers</title>
<head>
    <style>
        body {
            background-image: url("https://wallpaperaccess.com/full/100400.jpg");
            background-repeat: no-repeat;
            background-size: 100%;
            /*box-sizing: border-box;*/
           font-family: sans-serif;
            /*box-sizing: border-box;*/
        }

        table {
            background-color: white;
            color: black;
            /*position: relative;*/
            margin-left:500px;
            margin-bottom: 200px;
        }

        ul {
            float:right;
            margin-top:5px;
            list-style-type: none;
            color: white;
            justify-content: space-between;
            margin-bottom:100px;
        }

        li {
            height: 20px;
            width: 20px;
            display: inline;
            margin-left: 5px;
            font-family: "Lucida Sans", "Lucida Sans Regular", "Lucida Grande",
            "Lucida Sans Unicode", Geneva, Verdana, sans-serif;
            font-weight: bold;
            font-size: 20px;
        }

        li:hover {
            background-color: rgba(0, 0, 0, 0.2);
            color: gold;
        }

        .create-player {
            margin-top:100px;
            border: 1.5px solid black;
            margin-left: 1490px;
            position: absolute;
            height: 50px;
            width: 310px;
            padding-bottom: 10px;
            background-color: white;
        }

        .create-player img {
            opacity: 50%;
            margin-top: 10px;
            margin-left: 5px;
            height: 40px;
            width: 40px;
        }

        .create-player img:hover {
            opacity: 80;
            position: relative;
            color: gold;
            background-color: gold;
        }

        .create-player p {
            margin-left: 90px;
            font-size: bold;
            font-weight: light;
            color: gray;
            display: inline;
            /*position: absolute;*/
            margin-bottom: 80px;
        }

        form {
            text-align: center;
            align-items: center;
            padding-bottom:130px;
            margin-left: 750px;
            position: relative;
            margin-top: 0px;
            border-radius: 20px;
            height: 550px;
            width: 600px;
            margin-bottom:1000px;
            background-color: white;
            justify-content: space-around;
        }

        form input {
            margin-left: 10px;
            margin-top: 20px;
            height:25px;
            padding-top: 5px;
            width: 130px;
        }

        form h5 {
            text-align: center;
        }

        div button {
            margin-top: 20px;
            margin-right:20px;
            margin-left: 20px;
            display: inline;
        }


        table {
            background-color: white;
            color: black;
            /*position: relative;*/
            margin-left:500px;
            margin-bottom: 200px;
            float:left;
            margin-top:100px;
            margin-left: 25px;
            width: 4%;
            border-collapse: collapse;
            font-size: 0.9em;
            font-family: sans-serif;
            min-width: 5px;
            box-shadow: 0 0 20px rgba(0, 0, 0, 0.15);
        }

        table th {
            background-color: #009879;
            color: #ffffff;
            text-align: left;
        }

        table th,td {
            height: 10px;
            padding: 12px 15px;
        }

        table td {
            background-color: white;
            font-weight: bolder;
            color:gray;
        }

        table td:nth-child(even) {
            background-color:rgba(250,250,250,0.8);
        }

        .tableRows {
            color: black;
        }

        input {
            width: 80px;
            height: 25px;
        }

        .button-wrapper {
            margin-left: 150px;
        }

        button {
            outline: none;
            background-color: cadetblue;
            color: white;
            font-weight: bolder;
            border: 0;
            height: 50px;
            width: 200px;
        }

        .header {
            margin-top:20px;
            width:100%;
        }

        .header li a {
            margin-bottom: 200px;
            position: relative;
            margin-top:15px;
            text-decoration: none;
            color:black;
        }

        .header a:hover {
            color:gold;
        }


        .playerTable, .create-player {
            display: inline;
        }

        td a {
            text-decoration: none;
            color:white;
            border-radius:4px;
        }

        #edit-button {
            height:20px;
            width:20px;
            background-color:gray;
        }

        #delete-button {
            height:20px;
            width:20px;
            background-color:red;
           }

        table tr {
            border-bottom: 0.5px solid gray;
        }
    </style>
</head>
<body>
<header class="header"><ul><li><a href="/login">Login</a></li><li><a href="/signup">Signup</a></li><li></li><li><a href="teams/createteam">Teams</a></li><li><a href="contact">Contact Me</a></li></ul></header>
    <div class="table-and-create-player-container">
    <table class="playerTable">
        <th>Name</th><th>AtBats</th><th>Runs</th><th>Hits</th><th>Doubles</th><th>Triples</th><th>Home Runs</th><th>RBIs</th><th>Walks</th><th>Times Struck Out</th><th>Batting Average</th><th>Innings Pitched</th><th>Home Runs Allowed</th><th>Hits Allowed</th><th>Walks Allowed</th><th>Runs Allowed</th><th>Strikeouts</th><th>ERA</th><th></th><th></th></tr>
        <c:forEach items="${players}" var="player">
            <tr>
                <td>${player.name}</td>
                <td>${player.atBats}</td>
                <td>${player.runs}</td>
                <td>${player.hits}</td>
                <td>${player.doubles}</td>
                <td>${player.triples}</td>
                <td>${player.homeRuns}</td>
                <td>${player.runsBattedIn}</td>
                <td>${player.walks}</td>
                <td>${player.timesStruckOut}</td>
                <td>${player.battingAverage}</td>
                <td>${player.inningsPitched}</td>
                <td>${player.walksAllowed}</td>
                <td>${player.homeRunsAllowed}</td>`
                <td>${player.walksAllowed}</td>
                <td>${player.runsAllowed}</td>
                <td>${player.strikeouts}</td>
                <td><%=0%></td>
                <td><a id="edit-button" href="players/edit/${player.statsId}">Edit</a></td>
                <td><a id="delete-button" href="players/delete/${player.statsId}">Delete</a></td>
            </tr>
        </c:forEach>
    </table>
    <div class="create-player">
        <img id="addPlayer"
             src="https://png.pngtree.com/png-vector/20190307/ourlarge/pngtree-vector-add-user-icon-png-image_762930.jpg" />
        <p>Add Player</p>
    </div>
    </div>
<form style="visibility:hidden" action="players/createplayer" method="POST">
    <h5>For Outfielder</h5>
    <div>
        <input id="name" name="name" placeholder="Enter Name" />
        <input id="atBats" name="atBats" placeholder="atBats" />
        <input id="runs" name="runs" placeholder="Runs" />
    </div>
    <div>
        <input id="hits" name="hits" placeholder="Enter Hits" />
        <input id="doubles" placeholder="Enter Doubles" name="doubles" />
        <input id="triples" name="triples" placeholder="Enter Triples" />
    </div>
    <div>
        <input id="homeRuns" name="homeRuns" placeholder="homeRuns" />
        <input id="runsBattedIn" name="runsBattedIn" placeholder="RunsBattedIn" name="runsBattedIn" />
        <input placeholder="Walks" name="walks" />
    </div>
    <div>
        <input id="timesStruckOut" placeholder="Strikeouts" name="timesStruckOut" />
    </div>
    <h5>For Pitcher</h5>
    <div>
        <input id="inningsPitched" placeholder="Innings Pitched" name="inningsPitched" /> <input
            placeholder="Home Runs Allowed" name="homeRunsAllowed" />
    </div>
    <div>
        <input id="hitsAllowed" placeholder="Hits Allowed" name="hitsAllowed" /> <input
            id="walksAllowed" placeholder="Walks Allowed" name="walksAllowed" />
        </input id="strikeouts" placeholder="Strikeouts" name="strikeouts"/>
    </div>
    <div><input placeholder="Enter Teams Name" name="teamName" id="teamName"/></div>
    <h5>Game Details</h5>
    <div>
        <input id="gameLocation" name="gameLocation" placeholder="Enter Game Location"/>
        <input id="gameDate" type="date" id="start" name="gameDate"
               placeholder="Enter Game Date">
    </div>
    <div class="button-wrapper">
        <button id="button"type="submit">Add Player</button>
    </div>
</form>
<script>
    var addPlayerImage = document.querySelector("#addPlayer");
    var form = document.querySelector("form");
    var addPlayerHeader = document.querySelector("#addplayerHeader");
    addPlayerImage.addEventListener("click",function (){
        form.style.visibility = "visible";
        addPlayerHeader.style.visibility = "visible";
    });
</script>
</body>
</html>
<%--        <p style="color:white;margin-left:25px;margin-top:10px;position:absolute;font-weight: bold;font-size: 20px">PLAYERS</p>--%>