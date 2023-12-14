package com.clearminds.test;
import com.clearminds.componentes.*;

public class TestProducto {
	public static void main(String[] args) {		
		Producto prodt = new Producto("Papitas", "KE34", 0.85);

		System.out.println("Codigo: "+prodt.getCodigo());
		System.out.println("Nombre: "+prodt.getNombre());
		System.out.println("Precio: "+prodt.getPrecio());
		System.out.println("***********************");
		prodt.incrementarPrecio(60);
		prodt.disminuirPrecio(2);
	}
}
