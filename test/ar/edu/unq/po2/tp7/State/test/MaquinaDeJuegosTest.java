package ar.edu.unq.po2.tp7.State.test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import ar.edu.unq.po2.tp7.State.MaquinaApagada;
import ar.edu.unq.po2.tp7.State.MaquinaDeJuegos;
import ar.edu.unq.po2.tp7.State.MaquinaEsperandoFichas;
import ar.edu.unq.po2.tp7.State.MaquinaJugando;

public class MaquinaDeJuegosTest {
	
	MaquinaDeJuegos maquina = new MaquinaDeJuegos();
	
	@Test
	public void testVerificarEstadoInicial() {
		// SetUp
		assertTrue(maquina.getEstado() instanceof MaquinaApagada);
	}
	
	@Test
	public void testEncenderMaquina() {
		// SetUp
		maquina.encender();
		
		// Verify
		assertTrue(maquina.getEstado() instanceof MaquinaEsperandoFichas);
	}
	
	@Test
	public void testInsertarFichasYPresionarInicio() {
		// SetUp
		maquina.encender();
		maquina.insertarFicha();
		maquina.presionarInicio();
		
		// Verify
		assertTrue(maquina.getEstado() instanceof MaquinaJugando);
	}
	
	@Test
	public void testTerminarJuego() {
		// SetUp
		maquina.encender();
		maquina.insertarFicha();
		maquina.presionarInicio();
		maquina.terminarJuego();
		
		// Verify
		assertTrue(maquina.getEstado() instanceof MaquinaApagada);
	}
	
}
