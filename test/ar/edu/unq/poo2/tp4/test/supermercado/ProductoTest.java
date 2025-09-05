package ar.edu.unq.poo2.tp4.test.supermercado;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import supermercado.Producto;

import static org.junit.jupiter.api.Assertions.*;

public class ProductoTest {
	
	private Producto arroz;
	private Producto vino;
	
	@BeforeEach
	public void setUp() {
		arroz = new Producto("Arroz", 18.9d, true);
		vino = new Producto("Vino", 55d);
	}
	
	@Test
	public void testConstructor() {
		assertEquals("Arroz", arroz.getNombre());
		assertEquals(18.9, arroz.getPrecio());
		assertTrue(arroz.getEsPrecioCuidado());
		
		assertEquals("Vino", vino.getNombre());
		assertEquals(55, vino.getPrecio());
		assertFalse(vino.getEsPrecioCuidado());
	}
	
	@Test
	public void testAumentarPrecio() {
		arroz.aumentarPrecio(1.5);
		assertEquals(20.4, arroz.getPrecio());
	}
}
