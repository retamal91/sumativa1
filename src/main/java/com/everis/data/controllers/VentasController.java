package com.everis.data.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.everis.data.models.Venta;
import com.everis.data.services.VentaService;

@Controller
public class VentasController {
	
	@Autowired
	VentaService ventaService;
	
	@RequestMapping("/ventas")
	public String ventas(@RequestParam(value="fecha") String fecha,
			
			@RequestParam(value="precioTotal") Integer precioTotal,
			Model model) {
		
		
		Venta venta= new Venta();
		venta.setFecha(fecha);
		venta.setPrecioTotal(precioTotal);
		
		venta = ventaService.guardarVenta(venta);
		
		
		List<Venta> ventas_lista = ventaService.allVentas();
		model.addAttribute("fecha", fecha);
		model.addAttribute("precioTotal", precioTotal);
		model.addAttribute("listaVentas",ventas_lista);
		
		return "ventalist.jsp";
	}
	
	@RequestMapping("/eliminarventa/{id}")
	public String eliminarVenta(@PathVariable("id") Long id,
			Model model)
	{
	
		ventaService.deleteById(id);
		
		List<Venta> ventas_lista = ventaService.allVentas();
	
		model.addAttribute("listaVentas",ventas_lista);
		return "ventalist.jsp";
	}

	
	@RequestMapping("/editarventa")
	public String editarProducto(@RequestParam(value="id") Long id,
			@RequestParam(value="fecha") String fecha,
			@RequestParam(value="precioTotal") Integer precioTotal,
			Model model){
		
		Venta venta = new Venta();
		venta.setId(id);
		venta.setFecha(fecha);
		venta.setPrecioTotal(precioTotal);
		
		
		ventaService.editById(venta);
		List<Venta> ventas_lista = ventaService.allVentas();
		model.addAttribute("listaVentas",ventas_lista);



		return "ventalist.jsp";
	}
}
