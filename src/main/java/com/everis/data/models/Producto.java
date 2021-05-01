package com.everis.data.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

@Entity
@Table(name="productos")
public class Producto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Size(min=3,max= 50)
	private String nombre;
	@Size(min=3,max= 50)
	private String marca;
	@Max(100000)
	@Min(1)
	private Integer precio;
	
	public Producto() {};
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Integer getPrecio() {
		return precio;
	}

	public void setPrecio(Integer precio) {
		this.precio = precio;
	}

	public Producto(@Size(min = 3, max = 50) String nombre, @Size(min = 3, max = 50) String marca,
			@Max(100000) @Min(1) Integer precio) {
		super();
		this.nombre = nombre;
		this.marca = marca;
		this.precio = precio;
	}


}
