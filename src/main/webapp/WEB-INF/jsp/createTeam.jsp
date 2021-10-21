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
  <body>
    <header>
      <ul>
        <li>Home</li>
        <li>LogOut</li>
      </ul>
    </header>
    <div class="create-team,">
      <div>
        <img
          id="addPlayer"
          src="https://png.pngtree.com/png-vector/20190307/ourlarge/pngtree-vector-add-user-icon-png-image_762930.jpg"
        />
        <p>Add Team</p>
      </div>
    </div>
</body>
<script>
	var button = document.getElementById("button");
	var table = document.querySelector("table");
	var teamName = document.querySelector("#teamName");
	var numberofPlayers = document.querySelector("#numberofPlayers");
	button
			.addEventListener(
					"click",
					function(e) {
						e.preventDefault();
						var tr = document.createElement("tr");
						tr.classList.add("tableRows");
						table.appendChild(tr);
						tr.innerHTML += `<td>${teamName.value}</td><td>${numberofPlayers.value}</td></tr>`;
						setIdtoRows();
					});

	function setIdtoRows() {
		var tableRows = document.querySelectorAll(".tableRows");
		var deleteButtons = document.querySelectorAll(".delete-row");
		for (var i = 0; i < tableRows.length; i++) {
			deleteButtons[i].setAttribute("id", i + 1);
		}
	}

	function createDeleteButtonforRows() {
		var button = document.createElement("button");
		button.setAttribute(id, i);
	}

	function deleteRow(e, id) {
		var id = e.target.id;
		e.parentElement.style.display = none;

		//maybe put the button inside of the row so it will have the id when it is clicked
		//get the id of the row that is selected to be deleted
		//row.getAttribute(id);
		//row.getElementById(id).style.display = none;
		//
		//remove the visibility of the row and possibly remove it from the parent node;
	}
</script>
</html>

