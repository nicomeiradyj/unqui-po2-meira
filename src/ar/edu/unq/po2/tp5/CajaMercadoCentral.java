package ar.edu.unq.po2.tp5;

import java.util.List;

public class CajaMercadoCentral {
	double precioTotalProductos;
	List<Producto> productosDelCliente;
	List<Servicio> serviciosDelCliente;
	List<Impuesto> impuestosDelCliente;
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
	
	public void pagarServicios(List<Servicio> servicios, Agencia agencia) {
		for(Servicio s : servicios) {
			double total = s.getPrecioTotalServicio();
			Factura factura = new Factura(total, "servicio");
			agencia.registrarPago(factura);
		}
	}
	
	public void pagarImpuestos(List<Impuesto> impuestos, Agencia agencia) {
		for(Impuesto i : impuestos) {
			double total = i.getPrecioImpuesto();
			Factura factura = new Factura(total, "Impuesto");
			agencia.registrarPago(factura);
		}
	}
	
}
