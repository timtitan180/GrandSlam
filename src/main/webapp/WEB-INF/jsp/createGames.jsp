
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
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
            background-color:white;
            color:black;
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
            margin-left: 750px;
            position: absolute;
            margin-top: 200px;
            border-radius: 20px;
            height: 550px;
            width: 600px;
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

        table {
            margin-left:550px;
            width: 40%; }
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
        table th,td  {
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
            margin-left:150px;
        }

        button {
            outline: none;
            background-color:cadetblue;
            color:white;
            font-weight: bolder;
            border:0;
            height:50px;
            width:200px;
        }


    </style>
</head>
<body>
    <div>
        <form>
          <div>
            <input id="gameDate" name="gameDate" placeholder="Enter Game Date"/>
            <input id="gameLocation" name="gameLocation" placeholder="Enter Game Location" />
            <input id="team1" name="team1" placeholder="Enter First Team"/>
            <input id="team2" name="team2" placeholder="Enter Second Team"/>
            <input id="score" name="score" placeholder="Enter score"/>
            
        </div>
              <button type="submit" id="button">Submit</button>
          </form>
          </div>
        <h2 class="stats-header">Stats</h2>

    </div>
</body>
<script>
	var button = document.getElementById("button");
	var table = document.querySelector("table");
	var gameDate = document.querySelector("#gameDate");
	var gameLocation = document.querySelector("#gameLocation");
	var team1 = document.querySelector("#team1");
	var team2 = document.querySelector("#team2");
	var score = document.querySelector("#score");
	button
			.addEventListener(
					"click",
					function(e) {
						e.preventDefault();
						var tr = document.createElement("tr");
						tr.classList.add("tableRows");
						table.appendChild(tr);
						tr.innerHTML += `<td>${gameDate.value}</td><td>${gameLocation.value}</td><td>${rbi.value}</td><td>${team1.value}</td><td>${team2.value}</td><td>${score.value}</td></tr>`;
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


