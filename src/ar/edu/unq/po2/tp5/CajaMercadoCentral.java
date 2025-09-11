package ar.edu.unq.po2.tp5;

import java.util.List;

public class CajaMercadoCentral {
	double precioTotalProductos;
	List<Producto> productosDelCliente;
	MercadoCentral mercado;
	
	public CajaMercadoCentral(MercadoCentral mercado) {
		this.mercado = mercado;
	}
	
	public void registrarProducto(Producto unProducto) {
		this.precioTotalProductos += unProducto.getPrecio();
		unProducto.decrementarStock();
	}
	
	public double getPrecioTotal() {
		return precioTotalProductos;
	}
	
	
}
