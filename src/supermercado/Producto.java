package supermercado;

public class Producto {
	String nombre ;
	double precio;
	boolean esPrecioCuidado;
	
	public Producto(String nombre, double precio, boolean esPrecioCuidado) {
		this(nombre, precio);
		this.esPrecioCuidado = esPrecioCuidado;
	}
	
	
	public Producto(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}
	
	
	public String getNombre() {
		return this.nombre;
	}
	
	public double getPrecio() {
		return this.precio;
	}
		
	public boolean getEsPrecioCuidado() {
		return this.esPrecioCuidado;
	}
	
	public void aumentarPrecio() {
		this.precio = this.precio++;
	}
	
}
