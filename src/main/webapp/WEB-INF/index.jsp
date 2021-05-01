<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js" integrity="sha384-JEW9xMcG8R+pH31jmWH6WWP0WintQrMb4s7ZOdauHnUtxwoG2vI5DkLtS3qm9Ekf" crossorigin="anonymous"></script>
</head>
<body>
<div class="jumbotron">
  <h1 class="display-4">Tienda Productos!</h1>
  <p class="lead">Ingrese informacion de los productos y ventas.</p>
  <hr class="my-4">
  <p>se podra editar dentro de cada una.</p>

</div>
	<div>
		<h2>Ingrese información Producto</h2>
		<form  class=form-inline" action="/productos" method="POST">
			<label for="nombre">Nombre: </label>
			<input type="text" id="nombre" name="nombre">
			<label for="pass">Marca: </label>
			<input type="text" id="marca" name="marca">
			<label for="pass">Precio: </label>
			<input type="number" id="precio" name="precio">
		
			<input type="submit" value="enviar y ver datos">
		</form>
		<br>
				<h2>Ingrese información Usuario</h2>
		<form class=form-inline" action="/usuarios" method="POST">
			<label for="nombre">Nombre: </label>
			<input type="text" id="nombre" name="nombre">
			<label for="pass">Apellido: </label>
			<input type="text" id="apellido" name="apellido">
			<label for="pass">Edad: </label>
			<input type="number" id="edad" name="edad">
		
			<input type="submit" class="button" value="enviar y ver datos">
		</form>
		<br>
		<h2>Ingrese información Ventas</h2>
		<form class=form-inline" action="/ventas" method="POST">
			<label for="fecha">fecha: </label>
			<input type="date" id="fecha" name="fecha">
			<label for="precioTotal">precioTotal: </label>
			<input type="number" id="precioTotal" name="precioTotal">
		
			<input type="submit" value="enviar y ver datos">
		</form>
	</div>
</body>
</html>