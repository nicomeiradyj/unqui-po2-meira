package ar.edu.unq.po2.tp5;

public class Producto {
	String nombre;
	double precio;
	private int stock;
	
	public Producto (String nombre, double precio, int stock) {
		this.nombre = nombre;
		this.precio = precio;
		this.stock = stock;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public double getPrecio() {
		return this.precio;
	}
	
	public int getStock() {
		return this.stock;
	}
	
	public void setStock(int stock) {
		this.stock = stock;
	}

	public void decrementarStock() {
		stock--;
	}
	
}
