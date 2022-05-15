<%@ page language='java' contentType='text/html; charset=UTF-8'
	pageEncoding='UTF-8'%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>

<!DOCTYPE html>
<html>
<head>
<meta charset='UTF-8'>
<title>RotomDex</title>
<jsp:include page='bootstrapHead.jsp'></jsp:include>
</head>
<body>
	<main class='contaiiner-fluid'>

		<section class='header' id='header'>
			<a href="/"><img src='images/Rotom_Pokedex_small.png'
				class='logo' id='logo' /></a>
			<h1 class="header">Welcome to RotomDex!</h1>
		</section>

		<section class="pokedex">
		<table>
		<thead>
		<th>NDEX</td>
		<th>Name</td>
		<th>Type 1</td>
		<th>Type 2</td>
		<th>Class</td>
		</thead>
		<tbody>
		<c:forEach var="p" items="${pokedex}">
		<tr>
			<td>${p.ndex}</td>
			<td><a href="getPokemonById.do?id=${p.id}">${p.name}</a></td>
			<td>${p.type1}</td>
			<td>${p.type2 }</td>
			<td>${p.classType }</td>
		</tr>
		</c:forEach>
		</tbody>
		</table>
		</section>

	</main>
	<jsp:include page='bootstrapFoot.jsp'></jsp:include>
</body>
</html>