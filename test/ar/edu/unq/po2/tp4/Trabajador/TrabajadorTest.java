package ar.edu.unq.po2.tp4.Trabajador;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TrabajadorTest {
	private Trabajador trabajador;
	
	@BeforeEach
	public void setUp() {
		Ingreso sueldo = new Ingreso("Enero", "Sueldo", 1000);
		IngresoHorasExtras extras = new IngresoHorasExtras("Enero", "Horas Extras", 500, 10);
		
		trabajador = new Trabajador();
		trabajador.agregarIngreso(extras);
		trabajador.agregarIngreso(sueldo);
	}
	
	@Test
	void testTotalPercibido() {
		assertEquals(1500, trabajador.getMontoPercibido());
	}
	
	@Test
	void testTotalImponible() {
		assertEquals(1000, trabajador.getMontoImponible());
	}
	
	@Test
	void testImpuestoAPagar() {
		assertEquals(20, trabajador.getImpuestoAPagar());
	}
}
