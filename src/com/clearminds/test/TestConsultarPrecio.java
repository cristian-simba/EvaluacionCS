package com.clearminds.test;
import com.clearminds.componentes.*;
import com.clearminds.maquina.MaquinaDulces;

public class TestConsultarPrecio {

	public static void main(String[] args) {
		MaquinaDulces m = new MaquinaDulces();
		m.configurarMaquina("A1", "A2", "B1", "B2");

		m.getCelda1().getProducto().setPrecio(0.85);
		
		System.out.println(m.consultarPrecio("A1"));
		
	}

}
