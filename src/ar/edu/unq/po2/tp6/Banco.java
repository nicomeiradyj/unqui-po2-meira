package ar.edu.unq.po2.tp6;

import java.util.HashSet;
import java.util.Set;

public class Banco {
	public Set<Cliente> clientes;
	public Set<SolicitudDeCredito> solicitudesCreditos;
	
	public Banco(Set<Cliente> clientes) {
		this.clientes = clientes;
		solicitudesCreditos = new HashSet<>();
	}
	
	public void agregarCliente(Cliente cliente) {
		this.clientes.add(cliente);
	}

	public void registrarSolicitudDeCredito(SolicitudDeCredito solicitud) {
		this.solicitudesCreditos.add(solicitud);
	}
	
	public boolean evaluarSolicitud(SolicitudDeCredito solicitud) {
		return solicitud.sePuedeAceptar();
	}
	
	public void procesarSolicitud(SolicitudDeCredito solicitud) {
		this.registrarSolicitudDeCredito(solicitud);
		if(this.evaluarSolicitud(solicitud)) {
			this.otorgarDineroAlCliente(solicitud.montoSolicitado, solicitud.cliente);
		}
	}
	
	public void otorgarDineroAlCliente(double montoSolicitado, Cliente cliente) {
		cliente.ingresarDinero(montoSolicitado);
	}
	
}