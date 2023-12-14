package com.clearminds.test;
import com.clearminds.componentes.*;
import com.clearminds.maquina.MaquinaDulces;

public class TestBusqueda {
	public static void main(String[] args) {
		MaquinaDulces m = new MaquinaDulces();
		
		m.configurarMaquina("A1", "B1", "C1", "D1");
		System.out.println( m.buscarCelda("A1"));
		System.out.println( m.buscarCelda("Z1"));
		System.out.println( m.buscarCelda("B1"));
	}
}
