package com.clearminds.test;
import com.clearminds.componentes.*;
import com.clearminds.maquina.MaquinaDulces;

public class TestVenderConCambio {

	public static void main(String[] args) {
		MaquinaDulces m = new MaquinaDulces();
		m.configurarMaquina("A1", "A2", "B1", "B2");
		
		m.getCelda1().getProducto().setNombre("Papitas");
		m.getCelda1().getProducto().setPrecio(0.85);
		m.getCelda1().setStock(20);
		m.venderConCambio("A1",20);
		
		m.getCelda2().getProducto().setNombre("Doritos");
		m.getCelda2().getProducto().setPrecio(0.5);
		m.getCelda2().setStock(10);
		
		m.getCelda3().getProducto().setNombre("Rufles");
		m.getCelda3().getProducto().setPrecio(0.95);
		m.getCelda3().setStock(25);

		m.getCelda4().getProducto().setNombre("Queso");
		m.getCelda4().getProducto().setPrecio(0.40);
		m.getCelda4().setStock(10);
		
	}

}
