<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
		 pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<!DOCTYPE html>
<html>
<head>
<title>CreatePlayer</title>
<meta charset="UTF-8" />
<style>
body {
	opacity: 100%;
	background-image: url("https://wallpaperaccess.com/full/100400.jpg");
	background-repeat: no-repeat;
	background-size: 100%;
	scroll-behavior: smooth;
	font-family: sans-serif;
}


table {
	margin-top:300px;
	margin-left: 100px;
	width: 20%;
}

table {
	border-collapse: collapse;
	font-size: 0.9em;
	font-family: sans-serif;
	min-width: 200px;
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

ul {
	float: right;
	list-style-type: none;
	color: white;
	justify-content: space-between;
}

li {
	height: 20px;
	width: 20px;
	display: inline;
	margin-right: 10px;
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
	border: 1.5px solid black;
	margin-left: 750px;
	margin-top: 200px;
	position: absolute;
	height: 60px;
	width: 400px;
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
	position: absolute;
	margin-bottom: 60px;
}

form {
	text-align: center;
	margin-left: 750px;
	position: absolute;
	margin-top: 200px;
	border-radius: 20px;
	height: 700px;
	width: 600px;
	background-color: white;
	justify-content: space-around;
}

form input {
	margin-left: 10px;
	margin-top: 20px;
	width: 90px;
}

form h5 {
	text-align: center;
}

div button {
	margin-top: 20px;
	margin-left: 60px;
	display: inline;
}

table {
	margin-left:300px;
	width: 20%; }
table {
	border-collapse: collapse;
	font-size: 0.9em;
	font-family: sans-serif;
	min-width: 200px;
	box-shadow: 0px 0px 20px 10px inset rgba(0, 0, 0, 0.15);
}

table th {
	background-color: #009879;
	color: #ffffff;
	text-align: left;
}
table th,td  {
	overflow: paged-y;
	height:10px;
	padding: 12px 15px;
}

.tableRows {
	color:black;
}

input {
	width:80px;
	height:25px;
}

.button-wrapper {
	margin-left:80px;
}

button {
	margin-top:20px;
	outline: none;
	background-color:cadetblue;
	color:white;
	font-weight: bolder;
	border:0;
	height:50px;
	width:200px;
}

#addplayerHeader {
	color:gray;
	font-size:17px;
}

</style>
</head>
<body>
	<header>
		<ul>
			<li><a href="/teams">Teams</a></li>
			<li><a href="/games">Games</a></li>
			<li><a href="/admin">Admin Settings</a></li>
		</ul>
	</header>
	<table class="playerTable">
		<th>Name</th><th>AtBats</th><th>Runs</th><th>Hits</th><th>Doubles</th><th>Triples</th><th>Home Runs</th><th>RBIs</th><th>Walks</th><th>Times Struck Out</th><th>Batting Average</th><th>Innings Pitched</th><th>Home Runs Allowed</th><th>Hits Allowed</th><th>Walks Allowed</th><th>Runs Allowed</th><th>Strikeouts</th><th>ERA</th><th>Game Location</th><th>Team</th></tr>
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
			<td>${player.homeRunsAllowed}</td>
			<td>${player.walksAllowed}</td>
			<td>${player.runsAllowed}</td>
			<td>${player.strikeouts}</td>
			<td><%=0%></td>
			<td><a href="players/edit/${player.statsId}">Edit</a></td>
			<td><a href="players/delete/${player.statsId}">Delete</a></td>
		</tr>
		</c:forEach>
		</table>
	<div class="create-player">
		<div>
			<img id="addPlayer"
				src="https://png.pngtree.com/png-vector/20190307/ourlarge/pngtree-vector-add-user-icon-png-image_762930.jpg" />
			<p>Add Player</p>
		</div>
	</div>
	<form style="visibility: hidden" action="players/createplayer" method="POST">
		<h2 id="addplayerHeader" style="visibility: hidden">ADD PLAYER</h2>
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
</body>

</html>

