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

<h3>${pokemon.name }</h3><h5>- A ${pokemon.classtype }</h5><br>

<ul>
<li><strong>ID: </strong>${pokemon.id}</li>
<li><strong>NDEX: </strong>${pokemon.ndex }</li>
<li><strong>Type(s):</strong>${pokemon.type1 } | ${pokemon.type2 }</li>
<li><strong>Abilities:</strong>${pokemon.ability1 } | ${pokemon.ability2 }</li>
<li><strong>Special Ability:</strong>${pokemon.specAbility }</li>
<li><strong>HP:</strong>${pokemon.hp }</li>
<li><strong>Attack:</strong>${pokemon.attack }</li>
<li><strong>Special Attack:</strong>${pokemon.specAttack }</li>
<li><strong>Defense:</strong>${pokemon.defense }</li>
<li><strong>Special Defense:</strong>${pokemon.specDefense }</li>
<li><strong>Speed:</strong>${pokemon.speed }</li>
<li><strong>Weight:</strong>${pokemon.weight }</li>
<li><strong>Height:</strong>${pokemon.height }</li>
<li><strong>Egg Type(s):</strong>${pokemon.egg1 } | ${pokemon.egg2 }</li>
<li><strong>Descriptions:</strong>${pokemon.dex1 }<br>${pokemon.dex2 }</li>
</ul>

	</main>
	<jsp:include page='bootstrapFoot.jsp'></jsp:include>
</body>
</html>