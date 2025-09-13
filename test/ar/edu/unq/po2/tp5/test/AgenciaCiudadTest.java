package ar.edu.unq.po2.tp5.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ar.edu.unq.po2.tp5.Agencia;
import ar.edu.unq.po2.tp5.AgenciaCiudad;
import ar.edu.unq.po2.tp5.Factura;


public class AgenciaCiudadTest {
	@SuppressWarnings("unused")
	private Agencia interfaz;
	@SuppressWarnings("unused")
	private AgenciaCiudad agencia;
	@SuppressWarnings("unused")
	private Factura factura;
	
	@BeforeEach
    public void setUp() {
		factura = new Factura(1000, "Servicio");
	}
	
	@Test
	void testLaAgenciaRegistraElPagoDeServicio() {
		AgenciaCiudad agencia = new AgenciaCiudad();
		Factura factura = new Factura(1000, "Servicio");
		
		agencia.registrarPago(factura);
		
		assertTrue(agencia.getFacturasRegistradas().contains(factura));
	}
}
