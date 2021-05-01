package com.everis.data.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.data.models.Venta;
import com.everis.data.repositories.VentaRepository;

@Service
public class VentaService {
	//inyeccion dependencia repository
	@Autowired
	VentaRepository ventaRepository;

	public Venta guardarVenta(Venta venta) {
		
		return ventaRepository.save(venta);
	}

	public List<Venta> allVentas() {
		return ventaRepository.findAll();
	}

	public Optional<Venta> findById(Long id) {
		Optional<Venta> oa = ventaRepository.findById(id);
		return oa;
	}

	public void deleteById(Long id) {
		ventaRepository.deleteById(id);	
	}
	
	public Venta editById(Venta venta) {
		
		return ventaRepository.save(venta);


		
	}
}