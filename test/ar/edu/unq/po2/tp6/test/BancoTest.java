package ar.edu.unq.po2.tp6.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import ar.edu.unq.po2.tp6.Cliente;
import ar.edu.unq.po2.tp6.PropiedadInmobiliaria;
import ar.edu.unq.po2.tp6.SolicitudDeCredito;
import ar.edu.unq.po2.tp6.Banco;

public class BancoTest {
	private Banco banco;
	private Cliente cliente1;
	private Cliente cliente2;
	private Cliente cliente3;
	private Set<Cliente> clientes;
	private PropiedadInmobiliaria propiedad;
	
	@BeforeEach
	public void setUp() {
		banco = new Banco(clientes);
		cliente1 = new Cliente("Juan", "Gomez", 23, 200000, 0);
		cliente2 = new Cliente("Juan", "Lopez", 53, 400000, 0);
		cliente3 = new Cliente("Lucas", "Gonzalez", 35, 500000, 0);
		clientes = new HashSet<>(); 
		clientes.add(cliente1);
		clientes.add(cliente2);
		clientes.add(cliente3);
		propiedad = new PropiedadInmobiliaria("Duplex", "Libertador 234", 150000);
	}
	
	@Test
	void testSolicitudPersonalAceptada() {
		SolicitudDeCredito solicitud = cliente1.crearSolicitudPersonal(10000, 12);
		banco.procesarSolicitud(solicitud);
		assertTrue(solicitud.sePuedeAceptar());
	}
	
	@Test
	void testSolicitudHipotecariaAceptada() {
		SolicitudDeCredito solicitudH = cliente1.crearSolicitudHipotecaria(100000, 24, propiedad);
		banco.procesarSolicitud(solicitudH);
		assertTrue(solicitudH.sePuedeAceptar());
	}
	
}
