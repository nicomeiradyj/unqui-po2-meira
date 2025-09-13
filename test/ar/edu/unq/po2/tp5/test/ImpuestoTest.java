package ar.edu.unq.po2.tp5.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import ar.edu.unq.po2.tp5.Impuesto;

public class ImpuestoTest {
	private Impuesto impuesto;
	
	@BeforeEach
	public void setUp() {
		impuesto = new Impuesto(5000);
	}
	
	@Test
	void testPrecioTotalImpuesto() {
		assertEquals(5000, impuesto.getPrecioImpuesto());
	}
}
