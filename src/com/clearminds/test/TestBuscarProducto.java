package com.clearminds.test;
import com.clearminds.componentes.*;
import com.clearminds.maquina.MaquinaDulces;

public class TestBuscarProducto {
	public static void main(String[] args) {
		MaquinaDulces m = new MaquinaDulces();
		m.configurarMaquina("A1", "A2", "B1", "B2");

		m.getCelda1().getProducto().setNombre("Papitas");
		
		System.out.println(m.buscarProductoEnCelda("A1"));
		System.out.println(m.buscarProductoEnCelda("Z1"));
		
	
	}
}
