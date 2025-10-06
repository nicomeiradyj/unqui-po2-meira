package ar.edu.unq.po2.tp7.Mockito.test;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp7.Mockito.Carta;
import ar.edu.unq.po2.tp7.Mockito.PokerStatus;

public class PokerStatusTest {
	
	Carta carta1 = new Carta(5, "Diamante");
	Carta carta2 = new Carta(1, "Pica");
	Carta carta3 = new Carta(5, "Pica");
	Carta carta4 = new Carta(5, "Trebol");
	Carta carta5 = new Carta(5, "Corazon");
	Carta carta6 = new Carta(8, "Diamante");
	Carta carta7 = new Carta(3, "Pica");
	Carta carta8 = new Carta(2, "Pica");
	Carta carta9 = new Carta(1, "Pica");
	
	List<Carta> jugada1 = List.of(carta1, carta2, carta3, carta4, carta5);
	List<Carta> jugada2 = List.of(carta1, carta2, carta3, carta4, carta6);
 	
	@Test
	public void testVerificarPoker() {
		// SetUp
		PokerStatus status = new PokerStatus();
		
		// Exercise
		boolean resultado = status.verificar(carta1, carta2, carta3, carta4, carta5);
		
		// Verify
		assertTrue(resultado);
	}
	
	@Test
	public void testVerificarPoker2() {
		// SetUp
		PokerStatus status = new PokerStatus();
		
		// Verify
		assertEquals("Poquer", status.verificarPCTN(carta1, carta2, carta3, carta4, carta5));
	}
	
	@Test
	public void testVerificarPokerIncorrecto() {
		// SetUp
		PokerStatus status = new PokerStatus();
		
		// Exercise
		boolean resultado = status.verificar(carta1, carta2, carta3, carta4, carta6);
		
		// Verify
		assertFalse(resultado);
	}
	
	@Test
	public void testVerificarTrio() {
		// SetUp
		PokerStatus status = new PokerStatus();
		
		// Verify
		assertEquals("Trio", status.verificarPCTN(carta1, carta2, carta3, carta4, carta6));
	}
	
	@Test
	public void testVerificarColor() {
		// SetUp
		PokerStatus status = new PokerStatus();
		
		// Verify
		assertEquals("Color", status.verificarPCTN(carta2, carta3, carta7, carta8, carta9));
	}
	
	@Test
	public void  testGanadorDeJugada() {
		// SetUp
		PokerStatus status = new PokerStatus();
		
		// Verify
		assertEquals(jugada1, status.jugadaGanadora(jugada1, jugada2));
	}
	
	@Test
	public void testMuestraResultadoCorrecto() {
		// SetUp
		PokerStatus statusMock = mock(PokerStatus.class);
        when(statusMock.verificarPCTN(carta1, carta2, carta3, carta4, carta6)).thenReturn("Trio");
	}
	
}
