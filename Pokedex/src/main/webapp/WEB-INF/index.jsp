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

		<section class="forms">
			<form action="getPokemonById.do" method="GET">
				<label for="idSearch" class="formLabels">Find Pokemon By ID:</label>
				<input type="text" name="idSearch" id="idSearch"> <input
					type="submit" value="Search" />
			</form>
			<form action="getPokemonByNdex.do" method="GET">
				<label for="ndexSearch" class="formLabels">Find Pokemon By
					NDEX Number:</label> <input type="text" name="ndexSearch" id="ndexSearch">
				<input type="submit" value="Search" />
			</form>
			<form action="getPokemonByName.do" method="GET">
				<label for="ndexSearch" class="formLabels">Find Pokemon By
					Name:</label> <input type="text" name="ndexSearch" id="ndexSearch">
				<input type="submit" value="Search" />
			</form>
			<form action="getAllPokemon.do" method="GET">
				<input type="submit" value="Show All Pokemon" />
			</form>
		</section>

	</main>
	<jsp:include page='bootstrapFoot.jsp'></jsp:include>
</body>
</html>