package com.everis.data.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.data.models.Producto;
import com.everis.data.repositories.ProductoRepository;

@Service
public class ProductoService {
	//inyeccion dependencia repository
	@Autowired
	ProductoRepository productoRepository;

	public Producto guardarProducto(Producto producto) {
		
		return productoRepository.save(producto);
	}

	public List<Producto> allProductos() {
		return productoRepository.findAll();
	}

	public Optional<Producto> findById(Long id) {
		Optional<Producto> oa = productoRepository.findById(id);
		return oa;
	}

	public void deleteById(Long id) {
		productoRepository.deleteById(id);	
	}
	
	public Producto editById(Producto producto) {
		
		return productoRepository.save(producto);


		
	}
	
	

}