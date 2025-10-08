package ar.edu.unq.po2.tp7.State.test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp7.State.EstadoPausado;
import ar.edu.unq.po2.tp7.State.EstadoReproduciendo;
import ar.edu.unq.po2.tp7.State.EstadoSeleccion;
import ar.edu.unq.po2.tp7.State.EstadoStop;
import ar.edu.unq.po2.tp7.State.ReproductorMP3;
import ar.edu.unq.po2.tp7.State.Song;

public class ReproductorMP3Test {
	Song cancion = new Song();
	ReproductorMP3 mp3 = new ReproductorMP3(cancion);
	
	@Test
	void testVerificarEstadoInicial() {
		assertTrue(mp3.getEstado() instanceof EstadoStop);
	}
	
	@Test
	public void testElegirCancion() {
		// SetUp
		mp3.play();
		
		// Verify
		assertTrue(mp3.getEstado() instanceof EstadoSeleccion);
	}
	
	@Test
	public void testReproducirCancion() {
		// SetUp
		mp3.play();
		mp3.play();
		
		// Verify
		assertTrue(mp3.getEstado() instanceof EstadoReproduciendo);
	}
	
	@Test
	public void testPausarCancion() {
		// SetUp
		mp3.play();
		mp3.play();
		mp3.pause();
		
		// Verify
		assertTrue(mp3.getEstado() instanceof EstadoPausado);
	}
	
	@Test
	public void testReanudarCancion() {
		// SetUp
		mp3.play();
		mp3.play();
		mp3.pause();
		mp3.pause();
		
		// Verify
		assertTrue(mp3.getEstado() instanceof EstadoReproduciendo);
	}
	
	@Test
	public void testStopCancion() {
		// SetUp
		mp3.play();
		mp3.play();
		mp3.stop();
		
		// Verify
		assertTrue(mp3.getEstado() instanceof EstadoSeleccion);
	}
	
}
