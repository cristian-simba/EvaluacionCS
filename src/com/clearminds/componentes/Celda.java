package com.clearminds.componentes;

public class Celda {
	private Producto producto;
	private int stock;
	private String codigo;
	
	public Celda(String codigo) {
		this.codigo = codigo;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public void ingresarProducto(Producto prod, int stock) {
		if(stock != 0) {			
			System.out.println("Stock: "+ stock);
			System.out.println("Nombre Producto: "+prod.getNombre());
			System.out.println("Precio Producto: "+prod.getPrecio());
			System.out.println("Codigo Producto: "+prod.getCodigo());
		}
		else{
			System.out.println("Stock: "+ stock);
			System.out.println("La celda no tiene producto");
		}
	}
	
}
