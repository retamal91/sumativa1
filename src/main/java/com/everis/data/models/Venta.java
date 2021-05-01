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
@Table(name="ventas")
public class Venta {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Size(min=3,max= 50)
	private String fecha;
	@Max(1000000)
	@Min(1)
	private Integer precioTotal;
	
	public Venta() {};
	
	public Venta(@Size(min = 3, max = 50) String fecha, @Max(1000000) @Min(1) Integer precioTotal) {
		super();
		this.fecha = fecha;
		this.precioTotal = precioTotal;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public Integer getPrecioTotal() {
		return precioTotal;
	}
	public void setPrecioTotal(Integer precioTotal) {
		this.precioTotal = precioTotal;
	}
	
	
	
}
