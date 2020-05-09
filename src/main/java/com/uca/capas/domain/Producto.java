package com.uca.capas.domain;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Producto {
	@Size(max = 15, message="Nombre no debe tener mas de 15 caracteres")
	@NotEmpty(message = "este campo no puede estar vacio")
	String nombre;
	@Size(max = 30, message="Descripcion no debe tener mas de 30 caracteres")
	@NotEmpty(message = "este campo no puede estar vacio")
	String descripcion;
	@NotNull(message = "el campo no puede estar vacio")
	@Min(value = 0, message = "el precio no debe ser negativo")
	Double precio;
	
	@Pattern(regexp="([0-9]{2})/([0-9]{2})/([0-9]{4})", message = "El formato de la fecha es dd/mm/yyyy")
	@NotEmpty(message = "este campo no puede estar vacio")
	String vencimiento;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public String getVencimiento() {
		return vencimiento;
	}
	public void setVencimiento(String vencimiento) {
		this.vencimiento = vencimiento;
	}
	
	
}
