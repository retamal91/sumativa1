package com.everis.data.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.data.models.Usuario;
import com.everis.data.repositories.UsuarioRepository;

@Service
public class UsuarioService {
	//inyeccion dependencia repository
	@Autowired
	UsuarioRepository usuarioRepository;

	public Usuario guardarUsuario(Usuario usuario) {
		
		return usuarioRepository.save(usuario);
	}

	public List<Usuario> allUsuarios() {
		return usuarioRepository.findAll();
	}

	public Optional<Usuario> findById(Long id) {
		Optional<Usuario> oa = usuarioRepository.findById(id);
		return oa;
	}

	public void deleteById(Long id) {
		usuarioRepository.deleteById(id);	
	}
	
	public Usuario editById(Usuario usuario) {
		
		return usuarioRepository.save(usuario);


		
	}
}