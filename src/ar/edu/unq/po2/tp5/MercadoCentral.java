package ar.edu.unq.po2.tp5;

import java.util.ArrayList;
import java.util.List;

public class MercadoCentral {
	List <Producto> productosDisponibles;
	
	public MercadoCentral() {
		this.productosDisponibles = new ArrayList<>();
	}
	
	public void agregarProducto(Producto producto) {
		productosDisponibles.add(producto);
	}
	
	public List<Producto> getProductosDispoibles(){
		return productosDisponibles;
	}
	
	public Producto getProducto(String unProducto) {
		for (Producto p : productosDisponibles) {
			if (p.getNombre() == unProducto) {
				return p;
			}
		}
		return null;
	}
	
}


