package ar.edu.unq.po2.tp5.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import ar.edu.unq.po2.tp5.Servicio;

public class ServicioTest {
	private Servicio servicio;
	
	@BeforeEach
	public void setUp() {
		servicio = new Servicio(1000, 5);
	}
	
	@Test
	public void testPrecioServicio() {
		assertEquals(5000, servicio.getPrecioTotalServicio());
	}
}
