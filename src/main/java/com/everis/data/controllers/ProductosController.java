package com.everis.data.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.everis.data.models.Producto;
import com.everis.data.services.ProductoService;

@Controller
public class ProductosController {
	
	@Autowired
	ProductoService productoService;
	
	@RequestMapping("/productos")
	public String productos(@RequestParam(value="nombre") String nombre,
			@RequestParam(value="marca") String marca,
			@RequestParam(value="precio") Integer precio,
			Model model) {
		
		
		Producto producto= new Producto();
		producto.setNombre(nombre);
		producto.setMarca(marca);
		producto.setPrecio(precio);
		
		producto = productoService.guardarProducto(producto);
		
		
		List<Producto> productos_lista = productoService.allProductos();
		model.addAttribute("nombre", nombre);
		model.addAttribute("pass", precio);
		model.addAttribute("listaProductos",productos_lista);
		return "productolist.jsp";
	}
	
	@RequestMapping("/eliminarproducto/{id}")
	public String eliminarProducto(@PathVariable("id") Long id,
			Model model)
	{
	
		productoService.deleteById(id);
		
		List<Producto> productos_lista = productoService.allProductos();
	
		model.addAttribute("listaProductos",productos_lista);
		return "productolist.jsp";
	}

	
	@RequestMapping("/editarproducto")
	public String editarProducto(@RequestParam(value="id") Long id,
			@RequestParam(value="nombre") String nombre,
			@RequestParam(value="marca") String marca,
			@RequestParam(value="precio") Integer precio,
			Model model){
		
		Producto producto = new Producto();
		producto.setId(id);
		producto.setNombre(nombre);
		producto.setMarca(marca);
		producto.setPrecio(precio);
		
		productoService.editById(producto);
		List<Producto> productos_lista = productoService.allProductos();
		model.addAttribute("listaProductos",productos_lista);



		return "productolist.jsp";
	}
}
