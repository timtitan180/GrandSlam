<!DOCTYPE html>
<html>
  <head>
    <title>CreateTeam</title>
    <meta charset="UTF-8" />
    <style>
    body {
  opacity: 100%;
  background-image: url("https://wallpaperaccess.com/full/100400.jpg");
  background-repeat: no-repeat;
  background-size:100%;
  font-family: sans-serif;
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

.create-team {
  border: 1.5px solid black;
  margin-left: 200px;
  margin-top: 150px;
  position: absolute;
  height: 60px;
  width: 400px;
  background-color: white;
}

.create-team img {
  opacity: 50%;
  margin-top: 10px;
  margin-left: 5px;
  height: 40px;
  width: 40px;
}

.create-team img:hover {
  opacity: 80;
  position: relative;
  color: gold;
  background-color: gold;
}

.create-team p {
  margin-left: 90px;
  font-size: bold;
  font-weight: light;
  color: gray;
  display: inline;
  position: absolute;
  margin-bottom: 60px;
}

form {
  margin-left: 300px;
  position: absolute;
  margin-top: 250px;
  border-radius: 20px;
  height: 700px;
  width: 220px;
  background-color: white;
  justify-content: space-around;
}

form input {
  margin-left: 10px;
  margin-top: 20px;
  width: 80px;
}

form h5 {
  text-align: center;
}

div button {
  margin-top: 20px;
  margin-left: 60px;
  display: inline;
}
    </style>
  </head>
  <c:>
    <header>
      <ul>
        <li>Home</li>
        <li>LogOut</li>
      </ul>
    </header>
    <div class="create-team">
      <div>
        <img
          id="addTeam"
          src="https://png.pngtree.com/png-vector/20190307/ourlarge/pngtree-vector-add-user-icon-png-image_762930.jpg"
        />
        <p>Add Team</p>
      </div>
    </div>
    <form action="/teams/addTeam" method="POST" style="visibility:hidden" class="form">
      <label>Enter Team Name</label>
      <input id="teamName" name="teamName" placeholder="Enter Team Name"/>
      <label>Enter Number of Players</label>
      <input id="numberofPlayers" name="numberofPlayers" placeholder="Enter Num of Players"/>
      <input type="submit" value="Save Team"/>
    </form>
    <c: test="{if not empty teamName}"/>
    <table>
      <tr><td>Team Name</td><td>Number of Players</td></tr>
      <tr><td>${team.teamName}</td></tr>
      <tr><td>${team.numberofPlayers}</td></tr>
    </table>
    </c:>
</body>
<script>
	var addTeamImage = document.getElementById("addTeam");
    var form = document.querySelector(".form");
    addTeamImage.addEventListener("click",function(){
        form.style.visibility = "visible";
    });
	var table = document.querySelector("table");
	var teamName = document.querySelector("#teamName");
	var numberofPlayers = document.querySelector("#numberofPlayers");
</script>
</html>

