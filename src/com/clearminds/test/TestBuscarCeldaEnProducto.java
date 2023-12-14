package com.clearminds.test;
import com.clearminds.componentes.*;
import com.clearminds.maquina.MaquinaDulces;

public class TestBuscarCeldaEnProducto {

	public static void main(String[] args) {
		MaquinaDulces m = new MaquinaDulces();
		m.configurarMaquina("A1", "A2", "B1", "B2");

		m.getCelda1().getProducto().setCodigo("KE23");
		
		System.out.println(m.buscarCeldaProducto("KE23"));
		
		
	}

}
