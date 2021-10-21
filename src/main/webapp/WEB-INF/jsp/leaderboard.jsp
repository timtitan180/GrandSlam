      	<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <title>Parcel Sandbox</title>
    <meta charset="UTF-8" />
    <style>
      body {
        display: flexbox;
        align-content: center;
      }
      form {
        margin-top: 40px;
        text-align: center;
        margin-left: 350px;
        height: 400px;
        width: 300px;
        border-radius: 5px;
        background-color: white;
        box-shadow: 0px 0px 5px 0px inset gray;
      }

      form input {
        margin-top: 15px;
        width: 50%;
      }
    </style>
  </head>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>&lt;c:choose&gt;, &lt;c:when&gt;, &lt;c:otherwise&gt; Demo</title>
    </head>
    <body>
       <c:choose>
       <c:when test="${teamPlayers.count > 10}">
         <table border="0" width="150" height="50" bgcolor="#ff0000">
           <tr><td>&nbsp;</td></tr>
         </table>
      </c:when>
     <c:when test="${teamPlayers.count < 11}">
     	<section><p>In order for a leaderboard to be shown there must be at least 11 players on the same team. Add more players to see the leaderboard</p></section>
    </c:when>
  <c:otherwise>
    <table border="0" width="150" height="50" bgcolor="#000000">
      <tr><td>&nbsp;</td></tr>
     </table>
  </c:otherwise>
</c:choose>
<br/>
<form>
<p>LeaderBoard</p>
        <p style="width: 100%; background-color: rgba(250, 250, 250, 0.4);">
          Name Number Position Batting Average Team Rank
        </p>
        <br />
        <tr>
          <td>Johnny Manziel</td>
          <td>23</td>
          <td>RF</td>
          <td>.305</td>
          <td>#1</td>
        </tr>
      </form>
    </div>
    <script src="src/index.js"></script>
  </body>
</html>
