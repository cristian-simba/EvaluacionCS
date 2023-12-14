package com.clearminds.test;
import com.clearminds.componentes.*;
import com.clearminds.maquina.MaquinaDulces;

public class TestCargarProducto {
	public static void main(String[] args) {
		Producto prod = new Producto("Papitas", "KE24", 0.85);
		Celda celd0 = new Celda("A1");
		Celda celd1 = new Celda("A2");
		Celda celd2 = new Celda("B1");
		Celda celd3 = new Celda("B2");
		MaquinaDulces m = new MaquinaDulces();
		m.configurarMaquina("A1", "A2", "B1", "B2");		
		
		m.cargarProducto(prod, celd0, 0);
		m.cargarProducto(prod, celd1, 0);
		m.cargarProducto(prod, celd2, 4);
		m.cargarProducto(prod, celd3, 0);
	
	}
}
