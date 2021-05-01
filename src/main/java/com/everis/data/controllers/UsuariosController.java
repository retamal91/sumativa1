package com.everis.data.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.everis.data.models.Usuario;
import com.everis.data.services.UsuarioService;

@Controller
public class UsuariosController {
	
	@Autowired
	UsuarioService usuarioService;
	
	@RequestMapping("/usuarios")
	public String productos(@RequestParam(value="nombre") String nombre,
			@RequestParam(value="apellido") String apellido,
			@RequestParam(value="edad") Integer edad,
			Model model) {
		
		
		Usuario usuario= new Usuario();
		usuario.setNombre(nombre);
		usuario.setApellido(apellido);
		usuario.setEdad(edad);
		
		usuario = usuarioService.guardarUsuario(usuario);
		
		
		List<Usuario> usuarios_lista = usuarioService.allUsuarios();
		model.addAttribute("nombre", nombre);
		model.addAttribute("apellido", apellido);
		model.addAttribute("listaUsuarios",usuarios_lista);
		return "usuariolist.jsp";
	}
	
	@RequestMapping("/eliminarusuario/{id}")
	public String eliminarProducto(@PathVariable("id") Long id,
			Model model)
	{
	
		usuarioService.deleteById(id);
		
		List<Usuario> usuarios_lista = usuarioService.allUsuarios();
	
		model.addAttribute("listaUsuarios",usuarios_lista);
		return "usuariolist.jsp";
	}

	
	@RequestMapping("/editarusuario")
	public String editarProducto(@RequestParam(value="id") Long id,
			@RequestParam(value="nombre") String nombre,
			@RequestParam(value="apellido") String apellido,
			@RequestParam(value="edad") Integer edad,
			Model model){
		
		Usuario usuario = new Usuario();
		usuario.setId(id);
		usuario.setNombre(nombre);
		usuario.setApellido(apellido);
		usuario.setEdad(edad);
		
		usuarioService.editById(usuario);
		List<Usuario> usuarios_lista = usuarioService.allUsuarios();
		model.addAttribute("listaUsuarios",usuarios_lista);



		return "usuariolist.jsp";
	}
}
