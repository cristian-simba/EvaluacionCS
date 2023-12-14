package com.clearminds.maquina;
import com.clearminds.componentes.*;

public class MaquinaDulces {
    private Celda celda1 = new Celda("");
    private Celda celda2 = new Celda("");
    private Celda celda3 = new Celda("");
    private Celda celda4 = new Celda("");
	private double saldo;
	
	public Celda getCelda1() {
		return celda1;
	}
	public void setCelda1(Celda celda1) {
		this.celda1 = celda1;
	}
	public Celda getCelda2() {
		return celda2;
	}
	public void setCelda2(Celda celda2) {
		this.celda2 = celda2;
	}
	public Celda getCelda3() {
		return celda3;
	}
	public void setCelda3(Celda celda3) {
		this.celda3 = celda3;
	}
	public Celda getCelda4() {
		return celda4;
	}
	public void setCelda4(Celda celda4) {
		this.celda4 = celda4;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void configurarMaquina(String cod1, String cod2, String cod3, String cod4) {
		celda1.setCodigo(cod1);
        celda1.setProducto(new Producto("Producto1", "P1", 1.0));

		celda2.setCodigo(cod2);
        celda2.setProducto(new Producto("Producto2", "P2", 2.0));

		celda3.setCodigo(cod3);
        celda3.setProducto(new Producto("Producto3", "P3", 3.0));

		celda4.setCodigo(cod4);
		celda4.setProducto(new Producto("Producto4", "P4", 4.0));
	}
	
	public void mostrarConfiguracion() {
		System.out.println("CELDA 1: "+ celda1.getCodigo());
		System.out.println("CELDA 2: "+ celda2.getCodigo());
		System.out.println("CELDA 3: "+ celda3.getCodigo());
		System.out.println("CELDA 4: "+ celda4.getCodigo());
		System.out.println("SALDO: "+ this.saldo);
	}
	
	public String buscarCelda(String cod) {
		if(cod != null) {
			if(cod == celda1.getCodigo()) {
				return "Celda encontrada: " + celda1.getCodigo();
			}else if(cod == celda2.getCodigo()) {
				return "Celda encontrada: " + celda2.getCodigo();				
			}else if(cod == celda3.getCodigo()) {
				return "Celda encontrada: " + celda3.getCodigo();				
			}else if(cod == celda4.getCodigo()) {
				return "Celda encontrada: " + celda4.getCodigo();				
			}else {
				System.out.println("No existe la celda");
			}
		}
		return null;
	}
	
	public void cargarProducto(Producto prod, Celda celd, int cantidad) {
		Celda celdaRecuperada = new Celda(buscarCelda(celd.getCodigo()));
		System.out.println("------ CELDA "+celd.getCodigo()+" -----");
		celdaRecuperada.ingresarProducto(prod, cantidad);
	}
	
	public void mostrarProductos() {
		System.out.println("CELDA "+ celda1.getCodigo());
		System.out.println("Stock: "+celda1.getStock());
		System.out.println("Nombre del producto: "+celda1.getProducto().getNombre());
		System.out.println("Precio del producto: "+celda1.getProducto().getPrecio());
		System.out.println("CELDA "+ celda2.getCodigo());
		System.out.println("Stock: "+celda2.getStock());
		System.out.println("Nombre del producto: "+celda2.getProducto().getNombre());
		System.out.println("Precio del producto: "+celda2.getProducto().getPrecio());
		System.out.println("CELDA "+ celda3.getCodigo());
		System.out.println("Stock: "+celda3.getStock());
		System.out.println("Nombre del producto: "+celda3.getProducto().getNombre());
		System.out.println("Precio del producto: "+celda3.getProducto().getPrecio());
		System.out.println("CELDA "+ celda4.getCodigo());
		System.out.println("Stock: "+celda4.getStock());
		System.out.println("Nombre del producto: "+celda4.getProducto().getNombre());
		System.out.println("Precio del producto: "+celda4.getProducto().getPrecio());
	}
	
	public String buscarProductoEnCelda(String cod) {
		if(cod != null) {
			if(cod == celda1.getCodigo()) {
				return "Producto encontrado: " + celda1.getProducto().getNombre();
			}else if(cod == celda2.getCodigo()) {
				return "Producto encontrado: " + celda2.getProducto().getNombre();			
			}else if(cod == celda3.getCodigo()) {
				return "Producto encontrado: " + celda3.getProducto().getNombre();				
			}else if(cod == celda4.getCodigo()) {
				return "Producto encontrado: " + celda4.getProducto().getNombre();				
			}else {
				System.out.print("Producto encontrado: ");
			}
		}
		return null;
	}
	
	public double consultarPrecio(String cod) {
		if(cod != null) {
			System.out.print("El precio es: ");
			if(cod == celda1.getCodigo()) {
				return celda1.getProducto().getPrecio();
			}else if(cod == celda2.getCodigo()) {
				return celda2.getProducto().getPrecio();			
			}else if(cod == celda3.getCodigo()) {
				return celda3.getProducto().getPrecio();			
			}else if(cod == celda4.getCodigo()) {
				return celda4.getProducto().getPrecio();	
			}else {
				System.out.println("No Encontrado");
			}
		}
		return 0;
	}
	
	public String buscarCeldaProducto(String cod) {
		if(cod != null) {
			if(cod == celda1.getProducto().getCodigo()) {
				return "Celda encontrada: " + celda1.getCodigo();
			}else if(cod == celda2.getCodigo()) {
				return "Celda encontrada: " + celda2.getCodigo();		
			}else if(cod == celda3.getCodigo()) {
				return "Celda encontrada: " + celda3.getCodigo();				
			}else if(cod == celda4.getCodigo()) {
				return "Celda encontrada: " + celda4.getCodigo();				
			}else {
				System.out.println("No existe la celda");
			}
		}
		return null;
	}
	
	public void incrementarProductos(String codProd, int incr) {
		Celda celdaEncontrada = new Celda(buscarCeldaProducto(codProd));
		celdaEncontrada.setStock(incr);
	}
	public void vender(String cod) {
		if(cod != null) {
			if(cod == celda1.getCodigo()) {
				int v = celda1.getStock() - 1;
				celda1.setStock(v);
				saldo += celda1.getProducto().getPrecio();
				
			}else if(cod == celda2.getCodigo()) {
				int v = celda2.getStock() - 1;
				celda2.setStock(v);
				saldo += celda2.getProducto().getPrecio();

			}else if(cod == celda3.getCodigo()) {
				int v = celda3.getStock() - 1;
				celda3.setStock(v);
				saldo += celda3.getProducto().getPrecio();

			}else if(cod == celda4.getCodigo()) {
				int v = celda4.getStock() - 1;
				celda4.setStock(v);
				saldo += celda4.getProducto().getPrecio();
			}else {
				System.out.print("Producto No Encontrado");
			}
			mostrarProductos();
			System.out.println("saldo: " + saldo);
		}
	}
	
	public double venderConCambio(String cod, double val) {
		double cambio = 0;
		if(cod != null) {
			if(cod == celda1.getCodigo()) {
				int v = celda1.getStock() - 1;
				celda1.setStock(v);
				saldo += celda1.getProducto().getPrecio();
				cambio = val - celda1.getProducto().getPrecio();
				
			}else if(cod == celda2.getCodigo()) {
				int v = celda2.getStock() - 1;
				celda2.setStock(v);
				saldo += celda2.getProducto().getPrecio();
				cambio = val - celda1.getProducto().getPrecio();
				
			}else if(cod == celda3.getCodigo()) {
				int v = celda3.getStock() - 1;
				celda3.setStock(v);
				saldo += celda3.getProducto().getPrecio();
				cambio = val - celda1.getProducto().getPrecio();

			}else if(cod == celda4.getCodigo()) {
				int v = celda4.getStock() - 1;
				celda4.setStock(v);
				saldo += celda4.getProducto().getPrecio();
				cambio = val - celda1.getProducto().getPrecio();
				
			}else {
				System.out.print("Producto No Encontrado");
			}
			mostrarProductos();
			System.out.println("saldo: " + saldo);
			System.out.println("su cambio es: " + cambio);
		}
		return cambio;
	}
}
