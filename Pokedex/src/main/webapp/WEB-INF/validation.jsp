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

		<section class="failure">
		<h1>Your Pokemon process failed.</h1>
		</section>

	</main>
	<jsp:include page='bootstrapFoot.jsp'></jsp:include>
</body>
</html>