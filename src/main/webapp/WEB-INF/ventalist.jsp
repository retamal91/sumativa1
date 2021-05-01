<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js" integrity="sha384-JEW9xMcG8R+pH31jmWH6WWP0WintQrMb4s7ZOdauHnUtxwoG2vI5DkLtS3qm9Ekf" crossorigin="anonymous"></script>
</head>
<body>





<table class="table">
  <thead>
    <tr>
      <th scope="col">Id</th>
      <th scope="col">Fecha</th>
      <th scope="col">Monto Total</th>

      
 
    </tr>
  </thead>
  <tbody>

  <c:forEach var = "venta" items="${listaVentas}"> 
    <tr>
		<td>${venta.id}</td>
		<td>${venta.fecha}</td>
		<td>${venta.precioTotal}</td>
		<td><a href="http://localhost:8080/eliminarventa/${venta.id}"><button type="button"  class="btn btn-primary">eliminar</button></a>
		</td>
		
         
 </tr>
</c:forEach>

  </tbody>
</table>

<h1> Editar Venta</h1>

<form action="/editarventa" method="POST">
  <div class="form-group">
    <label for="precioTotal">Id</label>
    <input type="text" class="form-control" id="id" aria-describedby="emailHelp" name="id" placeholder="ID">
  </div>
  <div class="form-group">
    <label for="precioTotal">Fecha</label>
    <input type="date" class="form-control" id="fecha" name="fecha" placeholder="fecha">
  </div>
  <div class="form-group">
    <label for="precioTotal">Monto Total</label>
    <input type="number" class="form-control" id="precioTotal" name="precioTotal" placeholder="monto total">
  </div>
  <button type="submit" class="btn btn-primary">Editar</button>
</form>
</body>
</html>