package ar.edu.unq.po2.tp5.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import ar.edu.unq.po2.tp5.Factura;

public class FacturaTest {
	private Factura factura;
	
	@BeforeEach
	public void setUp() {
		factura = new Factura(1000, "Servicio");
	}
	
	@Test
	void testPrecioFactura() {
		assertEquals(1000, factura.getMonto());
	}
	
	@Test
	void testConceptoFactura() {
		assertEquals("Servicio", factura.getConcepto());
	}
}
