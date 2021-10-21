<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body>

<div><input type="search" name="search"/><button>Search</button></div>
	<tr><th>Name</th><th>atBats</th><th>Runs</th><th>Hits</th><th>Doubles</th><th>Triples</th><th>Triples</th><th>Triples</th><th>Home Runs</th><th>Walks</th><th>RunsBattedIn</th><th>Batting Average</th><th>Times Struck Out</th><th>Innings Pitched</th><th>Walks Allowed</th><th>Home Runs Allowed</th><th>Hits Allowed</th><th>Strikeouts</th></tr>
	<c:forEach items="${result}" var="playerStats">
		<td>${playerStats.name}</td>
		<td>${playerStats.atBats}</td>
		<td>${playerStats.runs}</td>
		<td>${playerStats.hits}</td>
		<td>${playerStats.doubles}</td>
		<td>${playerStats.triples}</td>
		<td>${playerStats.homeRuns}</td>
		<td>${playerStats.walks}</td>
		<td>${playerStats.runsBattedIn}</td>
		<td>${playerStats.battingAverage}</td>
		<td>${playerStats.timesStruckOut}</td>
		<td>${playerStats.inningsPitched}</td>
		<td>${playerStats.walksAllowed}</td>
		<td>${playerStats.homeRunsAllowed}</td>
		<td>${playerStats.hitsAllowed}</td>
		<td>${playerStats.strikeouts}</td>
	</c:forEach>

</body>
</html>