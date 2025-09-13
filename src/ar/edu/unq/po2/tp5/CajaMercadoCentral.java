package ar.edu.unq.po2.tp5;

import java.util.ArrayList;
import java.util.List;

public class CajaMercadoCentral {
	double precioTotalProductos;
	List<Producto> productosDelCliente;
	List<Servicio> serviciosDelCliente;
	List<Impuesto> impuestosDelCliente;
	MercadoCentral mercado;
	
	public CajaMercadoCentral(MercadoCentral mercado) {
		this.mercado = mercado;
		this.precioTotalProductos = 0;
        this.productosDelCliente = new ArrayList<>();
        this.serviciosDelCliente = new ArrayList<>();
        this.impuestosDelCliente = new ArrayList<>();
	}
	
	public void registrarProducto(Producto unProducto) {
		this.precioTotalProductos += unProducto.getPrecio();
		unProducto.decrementarStock();
	}
	
	public double getPrecioTotal() {
		return precioTotalProductos;
	}
	
	public void agregarServicioACliente(Servicio servicio) {
		serviciosDelCliente.add(servicio);
	}
	
	public void agregarImpuestoACliente(Impuesto impuesto) {
		impuestosDelCliente.add(impuesto);
	}
	
	public List<Servicio> getServiciosDelCliente(){
		return serviciosDelCliente;
	}
	
	public List<Impuesto> getImpuestosDelCliente(){
		return impuestosDelCliente;
	}
	
	public double pagarServicios(List<Servicio> servicios, Agencia agencia) {
		double totalGeneral = 0;
		for(Servicio s : servicios) {
			double total = s.getPrecioTotalServicio();
			totalGeneral += total;
			Factura factura = new Factura(total, "servicio");
			agencia.registrarPago(factura);
		}
		return totalGeneral;
	}
	
	public double pagarImpuestos(List<Impuesto> impuestos, Agencia agencia) {
		double totalGeneral = 0;
		for(Impuesto i : impuestos) {
			double total = i.getPrecioImpuesto();
			totalGeneral += total;
			Factura factura = new Factura(total, "Impuesto");
			agencia.registrarPago(factura);
		}
		return totalGeneral;
	}
	
}
