<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>Parcel Sandbox</title>
<meta charset="UTF-8" />
<link rel="stylesheet" shref="css/signupstyle.css" type="text/css" />
<style>
* {
	box-sizing: border-box;
}

body {
	font-family: sans-serif;
	background-color: rgba(10, 10, 10, 0.1);
}

.errors {
	color: red;
	display: block;
	position: relative;
	text-align: center;
	margin-bottom: 10px;
	font-size: 10px;
}

ul li {
	position: absolute;
	margin-top: 20px;
	margin-right: 15px;
	display: inline;
	text-decoration: none;
	float: right;
}

a {
	margin-right: 2px;
	text-decoration: none;
	font-weight: bold;
}

a:hover {
	color: rgba(0, 100, 250, 0.3)
}

/* .col {
    float: left;
    width:%;
  } */
.header {
	background-color: white;
	width: 100%;
	height: 80px;
	padding-top: 20px;
	padding-right: 500px;
	padding-left: 270px;
	overflow: hidden;
	margin-bottom: 5px;
	box-shadow: 0 10px 6px -8px gray;
}

header h4 {
	position: absolute;
	color: red;
	margin-left: -50px;
	margin-top: -40px;
	font-size: 30px;
	font-family: "Gluten", cursive;
}

.links {
	position: relative;
	margin-right: 200px;
}

form {
	margin-left:900px;
	background-color: rgba(250, 250, 250);
	height: 430px;
	width: 310px;
	margin-top: 30px;
	border: 1px solid gray;
	border-radius: 5px;
	border: 1px solid rgba(252, 252, 252, 0.9);
	box-shadow: 0 1px 4px 1px gray;
}

p {
	font-family: 'Padauk', sans-serif;
	font-size: 11px;
}

.col {
	margin-left: 30px;
}

h3 {
	text-align: center;
}

.inputs {
	margin-left: 80px;
	display: block;
	border: 1px solid rgba(252, 252, 252, 0.7);
	background-color: rgba(0, 0, 0, 0.1);
	padding-top: 7px;
	height: 35px;
	width: 150px;
	border-radius: 3px;
	font-family: "Source Sans Pro", sans-serif;
	color: white;
	margin-top: 25px;
	margin-bottom: 8px;
}


button {
	margin-right: 130px;
	margin-top: 10px;
	border: none;
	background-color: rgba(250, 250, 250, 0.4);
	border-radius: 6px;
	padding-bottom: 5px;
	font-weight: 800px;
}

button:hover {
	background-color: aqua;
	opacity: 60%;
}

h5 {
	color: rgba(250, 250, 250, 0.4);
}

header {
	overflow: hidden;
	padding-top:40px;
	width: 100%;
	margin-right: 20px;
	padding-left: 20px;
	border-bottom: 1px solid rgba(250, 250, 250, 0.4);
}

header img {
	position: relative;
	margin-left:-200px;
	height: 40px;
	width: 40px;
}

select {
	padding-top: 7px;
}

td {
	border: 1px solid rgba(250, 250, 250, 0.4);
}

.button-container {
	margin-top: 60px;
}

.register-header {
	margin-top: 80px;
	margin-left: 950px;
	justify-content: center;
	text-align: center;
	align-items: center;
	color: white;
	height: 40px;
	width: 200px;
	background-color: cadetblue;
	border-radius: 10px;
}

.register-header img {
	margin-left: 2px;
}
</style>
</head>
<body>
	<header class="header">
		<img
			src="data:image/jpeg;base64,/9j/4AAQSkZJRgABAQAAAQABAAD/2wCEAAkGBxERExEREBQWERERFxEWFhcTFxAYGBYWFhYXFxkWFhcaHioiGRsnHhYXJDMjJywtMDAwGSI2OzYvOiovMi0BCwsLDw4PHBERHDEnIScvLy8vLy8vLS8vLS0vLy8vMS8xLy8vLS0vLy8vLy8vLy8vLy0vLy8vLy8tLy8vLy8tL//AABEIAOEA4QMBIgACEQEDEQH/xAAcAAEAAgMBAQEAAAAAAAAAAAAAAwQCBQYHAQj/xAA/EAACAgECAwYEAggEBgMBAAABAgADEQQhBRIxBhNBUWFxIjKBkRShByNCUmJyscGCwtHhJDNDkvDxg6KyFv/EABkBAQADAQEAAAAAAAAAAAAAAAABAgQDBf/EADARAAICAAMFBgUFAQAAAAAAAAABAhEDITESQVFhgSIycaHR8ARCkbHBE3Ky4fGC/9oADAMBAAIRAxEAPwD3GIiAIiIAiIgCIiAIiIAiIgCIiAIiIAiIgCIiAIiIAiIgCIiAIiIAiIgCIiAIiIAiIgCIiAIiR2WKvU4gEkSlZrh+yM+pld9VYfHHtIsG1mBceYmobJ6kn3MwNcWDdCweY+4lIcY0xfuhdUbc45OdObPljPX0nM9qnVdPYpdKjaCgNhbx645QSTj0nmD8JpROVXWxj0A7xH/wB1Ct7bGUlOjT8P8ADrFTbteCs/QsT831Lq7g1p720ocBzzlgVHQFjzDHp0npH6PO2NttTVakM70kLz/DzFfAN5sPXH1kqduhifD7EFNST48j0iJU0nEK7PkYZ8jsftLcuZhERAEREAREQBERAEREAREQBERAEREATFmA3O0wuuVRlv8A37TV3XtYd9h4CAWbtdnZPuf7CVTk7k5PrAEzAkAxAn3E+gTLEAxxMcSTEEQDWcYuuRM0UC+wkAKXRAP4iW8PbecpxrR8RsQi1dJcOvc/tf4GbB5vqJ1/GdC9yciXvpxnLNXyZK+IyR8PuJxeo7N8JHMr6xu8PVmvqJz67Y+8pK/bo04Dis3r+3af3VdDkeFacPZfUmkt1Fi4JD2Or1D907DO/QncjE2/ZH9XqbKm+B2X5L1AvGN8K+Bzp18vPzn23hOqourajX1tRce577m5mrG7hXG4x8Ox5h9Jc4Zrb/xFddtlGvUEhbVZO9ryNyAwB9wCfeUSp/4aMSe1CUU7S/ffnaXhk1x49M643G02Gh49ZXhbP1ief7Q+vj9ZVsWVrFnU847fSatLF5kOR+Y9CPCWJ57p9U9Lc9ZwfyPoR4zr+EcWS8fu2D5l/uPMSbBs4iJIEREAREQBERAEREAREQBItRcEUs3QfmfKSEzn9bq+9bb5B0/1gGVlrWNzN9B5CSKJHUJMBKgyAn0CfAJIBJAAmQWfQJmBAMOWfCskxPhEAqazSpaj1WDmRwVYbjIPtON4jwbgenPJcK1cdV73UFh7qrEid2RNLr+AaFme6+mks27PYq/mTIkjphT2Hm2lydHn3E+z/CbUc6TVd3ZysVRnPK5AyE/WDIz0yDKuvv4LyVisXV2hUJepiSrYBIbvGwSD5CdXreF8EsyhNCHzqs5D91M1NfEdNwkW6dEGq71lelv1bGxWGCtjgblWGBt0YTnWW42rEbku+3uTdefqdDwnWV3VK1dvegAAscBsgftAdDJbVmg4NxkLZyNoG0nfHPNXUyqT/FhRidHaJdOzFiQ2JV+U/NZFCwSBLWrYOh5WU5BEtWiVbRLHM7jgfFl1CeVi45l/uPQzaTzHR6x6bFsTqvUeBHiDPRdDq1uRbE+Vh9j4g+ohAsxESQIiIAiIgCIiAIiazj/Ga9HU11uSBgKq7s7Hoq+u0N0TFOTpamHHNXygVjq3X2/3mspE5PRdrrNS7O9S1rnmZmclUp8ycDc9APHcze8H4styu4Vq60OA9g5Q4xnmXPh7ylp6FpYcod5e/fro0buuSrK2kuV1DowdW6FSCD7ES0skoZLJFkayVZIMwJmBMVkggDEwIkk+GSCEyjxbhdWprNV6d4hIOMsNx0OQQZfMjaQSm1mjktX2P4VWD3iJWD4tdYn2JcYmls7N6XSumu0Vve/hzztVz1WgoQVcqfm5grEjfwnRcU7GaTUWPbaLGZ8f9RwB7Dwms1n6OdIw/VtbS3gytzfkwlNl3kkaVix2aliSz6r+WZqn7a6vUEtpNI1tSkjm5bGz7sPhB9N8TotNa71o1iGt2GSh35T5TSPxo8Hp/CWjvrVP6ghSi2I5PzAZwVbIwNzkSfgtOuLG7VtyK4+GoD5fInHT23MJ06ZGJGMo7UUordrcvfTgbC2VLZctlS2XMxTtm67HcT5Le5Y/Bb09H/3Ax9pprJVZiCCDgjBBHgR4wD1+JQ4NrhfTXb4sPi9GGx/MS/JAiIgCIiAIiIAnnn6Y7UXTU5bFgtyq+LA1urHHkOYbz0OeL/pR5zritmSCtHd+QQq+V9zYp/KUxO6aPhUniW3VZmt4Nr673qpbCpdqGsYNgDu66lKIc7YPQD0m6tvp1F+sbUsfwuhAC1gkKzkkbgdScEY9RNF2YavF1tiq/cadWRXAILOuS2DsT1+8ws4KTRpaqizajX2C0rkCvkAIXmAHkSSff0nLd796mxxqeT5c18zfLspK/BHXcJ1HErq1bSJp9JpcfqxYr5K56gDbHU5wPrNuO2GlWyrT85ttcqhNSkrzdCc+WfLOJzfaviV/Pp+HO1WkrsAFlivlSg6AZAKjAOx6+eJYs4hRo2XRcLpW/VH5n2bBA3Zm8T57gD8pe2jP+mpq6zatJZJLjKT9eeVnoQkizluzPD9fXZZdrrw4ZcCtccqnrnoAMek31fEKS4rFtZsOcKHQscdds5nSzLJJNpO+av0L4MzBkIMzBgqS5mBMxzPhMAEzBp9JmDGAVtfW71utb907AhXAB5T54M4q79H7WHmt1lzuepIB39MnpO6JnNdq7+IEpToa8c4Ja4lQF/hGeh9cH+8rJJrNHbBnOMqhLZvec5qexmtosqvqtTVLp3DrXdzg4HzcmcjmI9pX47x+zX3jSaM8qEAsxyCcgFuY9Qq5xjxMtL2F1dvxX60h/IB3x/iLD+krU8MHBTdqLX/EC5McwTlZXXJCkcxyHJ+bw5RKbL00NLxIqW1tKUtF2az+za5o21DV6da9Oz5cjA5urf6CS2zmezWltvZuIanYMS1fNtt+/jwUDYfebHhHGBqRYQvKEYAb5yDv9DLJmfFwqbad13nuttlq2VbJZsMq2GXOB1v6PdZ/zaT6WL/+W/yztJ5Z2T1Xd6qnyclD/iGB+eJ6nCAiIkgREQBERAE887WqtmpcMA3J3eM+BCg5+7GehzzbtA3/ABN3839hIYNRVwepRZyDl7ytaiB0CqCBgfX8pjouHW026F6zzihGrctgbcpwQPczYIZYQyKRdTkt/vQ1vCtZX+O4lfqQC1NaFARkBCGyBnpkIv3Mj7Eaa9F1PEEWlKrWb9UQEyik5KWf9MAkgA7HHh1lnjek5qdR3SZttRV2xluU7An6mafiwt7vQcNDFQy1l8eY6n1AIc48wJR5e97NUZLFVaXSfKMY7vFky8R1nGrnqoJo0tZw5zsPINg5dj+70E3uh4Bw7hjpfdeTaoPKbCPEYJWtBnofWYdortJw+iv8MTRdystRqClmHibgdmXO+TvnpNR2I7Mpqw9+vZ3tJyam71GAPyu+cMwONsbe8is8s2W27hcm4w0SWsuv3s77hPaTSalilFgdwM8vK6nHnhgJtw00ek4TotGTaldVBxguSF28ssZd03FKLCFrursY+CPWx29AZ0XMxySu4p1z9dC/mC0w5p8JklDImYEwTPhMA+EzBjPpMgseQDlO1FfErbO70pSqoAfHz8rMfEZALD6Ae802n7BvYebWap7PNay2/oXYk/bE7i55wnE+F8T1LEPdXTWSdlZ+n8qj4vq0q1vNWDiyrZ2lFcazf0z8yv2r4nala6GsGy1zyKyY+OsdM4+VvA+xPjKPEieHaeqpHzc7FnI6kkb49M8oHtNvpey1GlHetc3fDpYzBVU+idCD03ztNLo9P+J1Fuq1DoyUH4VU5GVGQ38o6jzMh+ZaLgllnFZ6d6W439eozyoxHehVLAeGR/7mNhnN8O1zM2q1ZHwDCpnxOQPyHL95u9PqO8RH6FlDY95ZOzhi4Tg/LrVtdCfSW8ltTj9l62+zAz2aeJL1HvPaqvlX2H9JZHIziIkgREQBERAE807SDGpvH8QP3VT/AHnpc877a1cupY/vqjfYcv8AlkMGtRpOjSmjSdGgFxGkDcPRr69SSeatGRRtjcnf33I+s+o0mVpBKbWhouGoL+JW2WLz16XlCg9Ofwx7fEfciXu03avntSvh9T3apMgOoyMftIVx8a++ACAZb1xburRUP1hV+XGB8RGAZzeg154TUfhV9VeMnO4RRsoJG58dvE5lHka8OsV5q3koq8slq+W82vBeyp1SnUcR1D2WZIavPJ3LDqjHz9sDBHWb3g/Z/hlNq2UlTamcE3FiMjBOC2M4M5J+zmu1P/F66wpSeUulWBZ3f7xGOUYB6bnA+k6N/wBH+gYAr3i7bMlr7+u+RCXBEzxFVTxH/wArs/dHYBwem/tGZqOA8Kr0lXc1M7rktmxuY5PrgTZGyXMWW4kJmJaRNZInskgkeyVrLJi9krvZAFjzXa9n5H7ogWYPLzdM+ssWPK1jyAce/Zi65ufV3nHUhM5/722UewlDjFmjrrbT6ZSXbbmrJySf3m3L9BtOn41ozcnILDWM/FjxHlNFYdLoQcDntx1OC2/r0Ue05tVobYYjxO9cnuiskueWRreIZFem0NSMjNguG6jxJJ6HxOfaZfjFR7HUE11AVgZ2/wDNjPo7+wtqb2apFDcgGxORjAB6Dp13M19IBSmrojM11jMR8QU/7Yh5++hdUlTz41e93LxdJR3nXaTDEY33A+vlPaaxgAeQE/OHBddat1Tp0tsDFT+6z7fU8s/SUvF2ZMXCeGIiJc5CIiAIiIAnG/pB0+1No8CyH67j+jTspqu0ui77T2oN2A5l/mXcD69PrAPNEaTK0pq0mVpALitJVeU1aSq8AuK8193CKrL1vsyzIByqflBHQ48TLCvFo5lZckcwIyOoz5SGWjJrR0Q6rtpYp7jSVfiLBkZAZh7AL1x57CajQdnNZqXKa259KgGa6lww5M4PL8RA5SQMb9RvJm4hTw4AVLzXHrk7kfxt5ekp6vV8Z1AFqJ3aIGYH4EOCpBC5POcj+056unmbknGKlhJRW6T1fNf19Tbp2Lt07q+l1bIcjPMBuPH5Tg/UTtO9nBaDsnY6CzUaly7AH9WSQM7/ADN832E3HBeFNpi5N1lqsAAr9B69TvJjluOOPJTzeJtPw/PqdE1sjayVzbI2tnQykz2SB7JE1kheyAZ2WStY8xeyQO8AWPNddSnMbOQF8dcDO3rLLvK1jyAc5xJncc+pbuqgdkHzN6D19ZW09RCvqHXCsvd01keB2BwfQf1nR2aVLCpdQ3KcjPgZX1GgsLF2+Pl2RR8qDxdh4keU5tUjZDGUqi8lw3a6Lx3tmf6PeFi/XVcwJWrFh/8Aixyg+Q5uUYnu84f9GXBxTS17DFl52yNwik4B9SSSfX2ncS8FSzOfxOIpz7OiyEREuZxERAEREAREQDyztVw7uL3AHwWZdPYncfQ/2msVp6V2r4R+JpIUfra/iT181+o/PE8vBxsdjKgtK0lV5UVpmrSQWw8zDyqHmQeAVNe+npbvnTmdjscZ3+uwlR+0ut1A7rR1EDoXI/zn4R+Zm4Yg9d/eamztM1bNXVS9j9AMHr7AHac5I1YUtr5ba3t5JeGRHpdBxSsctdyZTAZWd8DIBHLlTtvjw6S3otNxQOpuuq5AQWA5mJHiPkH9ZrieJM3e5CM+wrJA2XfBGCPE7HfrJRruKMMdzXWf3iV++AT/AEj6l5tv5oPjkvTzR2RtkbWTX6SywIvekGzHxFemfSSNZLmJk7WSJ7JC1kiaySCR7JA7zBnkLvAMneRgZnxVzLNVUiwKa5tOH6NrHVF6sQP95DTVOz7KcN5QbmG7bL/L4n6yNQb/AE9IRVReigAfSSxEuBERAEREAREQBERAE4HtvwDlJ1NQ+Fv+YB4H9/2Pj6zvpg6gggjIOQQfEHwgHimcTINOn7UdmjSTbUM1Hw6lPQ/w+s5hqpUGYeZh5XwRHNJBZDyhquMmp+UVux81BwfsDLAea3ibW8y91clZx8rsBn1GxzKyvcdMJRcu1XW68s/xxPj6zWXENy9wikEE9cn4enU9fSfbNdxBfh7lH/iBGD/9h/SUNT+KwTZdWijf5yM46YAAzM6NbrRsqpavgwKkfcESv1NLarJw8Krzyv69DfcMtvKn8QFDZ2CHO3rLRsmr4fZdhjfy5J2C+HvLReXRkn3np00J2skbWSPcz6tUFT4WzPqVydKZZrpkAhqql2qmSVUzb8J4U1rYGyj5m8vQesgGXAeE962T/wAtfmPn/CJ2yqAABsBsJHp6FrUKgwo/8yZNLpUBERJAiIgCIiAIiIAiIgCIiAYMoIIIyDsQfGcdx7spjNmnGR1NfiP5fMek7SIB489GNiMGQtTPU+KcEpv3Ycr/ALy4z9fOclxDs7dXk47xPNN/uOolaByxpmj7QaGpipsrdtiOZPD0I8Z2Boms4zWFVWJtUA9af8w8pVvI64L7a/v8ZnG16TSjPLXa7YOMjYHHU48pep4fpWY8lj0N+0obl3+st3aheVgttzbH4QoH/cfKT9yLPiZaLx4MSEf/ABAym0bp4clra6yX80l9nwJuG6BKweR2sydyzc2/9peWmScK0CohxUKixyQpBz5HImwWiXs86feZQWmTpRLi6eTpp4KlSuiWK6Js9Fwqyz5V28zsPvOi0HBK68Fvjb16D2EJWDTcJ4G1mGf4E/M+3+s6qilUUKowoksS6VARESQIiIAiIgCIiAIiIAiIgCIiAIiIAiIgFPV8Nqt+dAT5jY/cTQcU7FVXADmZeU5XfcHzBGJ1cSKTJTado811v6P78fq7mc5XHM+wwwySCPi28JD/APxGsLA2dwRnflrTLD1JO30E9QiV/TidFjTX+L09+JxVfZ64YATAHTddvzlivs7aevKPc/6TrYk7JyOfp7Nj9t/oo/uZstNwulOi5Pm2/wDtL0SaQEREkCIiAIiIAiIgCIiAIiIAiIgCIiAIiIAiIgCIiAIiIAiIgCIiAIiIAiIgCIiAIiIAiIgCIiAIiIAiIgCIiAIiIAiIgCIiAIiIAiIgCIiAIiIAiIgCIiAIiIAiIgCIiAIiIB//2Q=="
			alt="baseball-image" />
		<h4>GRAND SLAM</h4>
		<ul><li><a href="/login">LOGIN</a></li></ul>
	</header>
	<c:forEach items="${errors}" var="error">
		<p style="margin-left:600px;color: red">${error}</p>
	</c:forEach>
	<div class="register-header">
		<h3>REGISTER</h3>
	</div>
	<form action="signup" method="POST">
		<input class="inputs" id="fname" autcomplete="off" autofill="off" name="firstName" placeholder="Enter First Name"></input> <input
			class="inputs" autcomplete="off" autofill="off" id="lname"
			placeholder="Enter Last Name" name="lastName"></input> <input
			autocomplete="off" autofill="off" class="inputs" id="email" name="email" placeholder="Enter Email"></input>
		<input class="inputs" placeholder="Enter Password" id="password" name="password"></input>
		<input class="inputs" placeholder="Confirm Password" id="confirmPassword" name="confirmPassword"></input>
		<button type="submit" id="button"
			style="color: white; background-color: lime; height: 30px; width: 60px; border-radius: 1px; margin-top: 25px; margin-left: 45%; margin-bottom: 170px; position: relative;">Submit</button>
	</form>
</body>
</html>