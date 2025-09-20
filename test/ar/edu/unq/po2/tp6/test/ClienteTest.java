package ar.edu.unq.po2.tp6.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp6.Cliente;

public class ClienteTest {
	private Cliente cliente1;
	
	@BeforeEach
	public void setUp() {
		cliente1 = new Cliente("Juan", "Gomez", 23, 200000, 0); 
	}
	
	@Test
	void testEdadCliente() {
		assertEquals(23, cliente1.getEdad());
	}
	
	@Test
	void testMontoCliente() {
		assertEquals(0, cliente1.getMonto());
	}
	
	@Test
	void testSueldoMensualCliente() {
		assertEquals(200000, cliente1.getSueldoMensual());
	}
	
	@Test
	void testNombreCliente() {
		assertEquals("Juan", cliente1.getNombre());
	}
	
	@Test
	void testIngresosAnualesCliente() {
		assertEquals(2400000, cliente1.ingresosAnuales());
	}
	
}
