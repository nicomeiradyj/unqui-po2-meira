package ar.edu.unq.po2.tp6;

import java.util.Set;

public class Banco {
	public Set<Cliente> clientes;
	public Set<SolicitudDeCredito> solicitudesCreditos;
	
	public Banco(Set<Cliente> clientes) {
		this.clientes = clientes;
	}
	
	public void agregarCliente(Cliente cliente) {
		this.clientes.add(cliente);
	}
	
	
	
}