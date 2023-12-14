package com.clearminds.test;
import com.clearminds.componentes.*;

public class TestContenidoCelda {
	public static void main(String[] args) {		
		Producto prod = new Producto("Papitas", "KE34", 0.85);
		Celda c = new Celda("A1");
		System.out.println("CELDA: "+c.getCodigo());
		System.out.println("***********************");
		c.ingresarProducto(prod, 10);

	}
}
