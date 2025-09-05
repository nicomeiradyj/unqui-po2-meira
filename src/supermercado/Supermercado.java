package supermercado;

import java.util.ArrayList;
import java.util.List;

public class Supermercado {
	String nombre;
	String direccion;
	List<Producto> productos;
	
	public Supermercado(String nombre, String direccion) {
		this.direccion = direccion;
		this.nombre = nombre;
		this.productos = new ArrayList<Producto>();
	}
	
	public int getCantidadDeProductos() {
		return this.productos.size();
	}
	
	public void agregarProducto(Producto productoAAgregar);{
		this.productos.add(productoAAgregar);
	}
}
