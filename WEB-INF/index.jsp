<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="css/style.css" type="text/css">
<link href="https://fonts.googleapis.com/css?family=Roboto+Condensed&display=swap" rel="stylesheet">
<title>TimeLine</title>
<link rel="icon" type="image/x-icon" href="img/logo.png" />
</head>
<body>
<h1>
	<span>B</span>
	<span>a</span>
	<span>c</span>
	<span>k</span>
	<br>
	<span>t</span>
	<span>o</span>
	<br>
	<span>t</span>
	<span>h</span>
	<span>e</span>
	<br>
	<span>F</span>
	<span>u</span>
	<span>t</span>
	<span>u</span>
	<span>r</span>
	<span>e</span>
</h1>
<br> 
<canvas id='c'></canvas>
<script src='https://rawgit.com/akm2/simplex-noise.js/master/simplex-noise.js'></script>
<div class="process-wrapper">
<div id="progress-bar-container">
	<ul>
		<li class="step step01"><div class="step-inner">26 de out. de 1985</div></li>
		<li class="step step02"><div class="step-inner">5 de nov. de 1955</div></li>
		<li class="step step03"><div class="step-inner">12 de nov. de 1955</div></li>
		<li class="step step04"><div class="step-inner">26 de out. de 1985</div></li>
		<li class="step step05"><div class="step-inner">21 de out. de 2015</div></li>
	</ul>
	
	<div id="line">
		<div id="line-progress"></div>
	</div>
</div>

<div id="progress-content-section">
 	<div class="section-content jump1">
		<h2>${objUser.nome} & ${objUser.nome}</h2>
		<img alt="" src="${objUser.urlAvatar}" width="100px" height="100px">
		<img alt="" src="${objUser.urlAvatar}" width="100px" height="100px">
		<p>Sobre o Ator: ${objUser.sobre}</p>
		<p>Sobre o Ator: ${objUser.sobre}</p>
		<p>Papel Filme: ${objUser.papelFilme}</p>	
		<p>Papel Filme: ${objUser.papelFilme}</p>	
	</div>
	
	<div class="section-content jump2">
		<h2>${objUser.nome}</h2>
		<img alt="" src="${objUser.urlAvatar}" width="100px" height="100px">
		<p>Sobre o Ator: ${objUser.sobre}</p>
		<p>Papel Filme: ${objUser.papelFilme}</p>
	</div>
	
	<div class="section-content jump3">
		<h2>${objUser.nome}</h2>
		<img alt="" src="${objUser.urlAvatar}" width="100px" height="100px">
		<p>Sobre o Ator: ${objUser.sobre}</p>
		<p>Papel Filme: ${objUser.papelFilme}</p>
	</div>
	
	<div class="section-content jump4">
		<h2>${objUser.nome}</h2>
		<img alt="" src="${objUser.urlAvatar}" width="100px" height="100px">
		<p>Sobre o Ator: ${objUser.sobre}</p>
		<p>Papel Filme: ${objUser.papelFilme}</p>
		</div>
	
	<div class="section-content jump5">
		<h2>${objUser.nome}, ${objUser.nome} e ${objUser.nome}</h2>
		<img alt="" src="${objUser.urlAvatar}" width="100px" height="100px">
		<img alt="" src="${objUser.urlAvatar}" width="100px" height="100px">
		<img alt="" src="${objUser.urlAvatar}" width="100px" height="100px">
		<p>Sobre os Atores: ${objUser.sobre}</p>
		<p>Sobre os Atores: ${objUser.sobre}</p>
		<p>Sobre os Atores: ${objUser.sobre}</p>
		<p>Papel Filme: ${objUser.papelFilme}</p>
		<p>Papel Filme: ${objUser.papelFilme}</p>
		<p>Papel Filme: ${objUser.papelFilme}</p>
	</div> 
	</div>
</div>

<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jqueryui/1.12.1/jquery-ui.min.js"></script>
<script src="./js/script.js" type="text/javascript"></script>
<script src="./js/index.js" type="text/javascript"></script>

</body>
</html>