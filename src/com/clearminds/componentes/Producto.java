package com.clearminds.componentes;

public class Producto {
	private String nombre;
	private double precio;
	private String codigo;
	
	public Producto(String nombre, String codigo, double precio) {
		this.nombre = nombre;
		this.codigo = codigo;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public void incrementarPrecio(int incr) {
		double totalIncr = this.precio + (this.precio * incr/100);
		System.out.println("Precio Incrementado: " + totalIncr);
	}
	
	public void disminuirPrecio(double dism) {
		double totalDism = this.precio - (this.precio * dism/100);
		System.out.println("Precio Disminuido: " + totalDism);		
	}
}
