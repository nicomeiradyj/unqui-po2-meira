package ar.edu.unq.po2.tp7.test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp7.Caballero;
import ar.edu.unq.po2.tp7.Celda;
import ar.edu.unq.po2.tp7.Ejercito;
import ar.edu.unq.po2.tp7.Ingeniero;
import ar.edu.unq.po2.tp7.Mapa;

public class MapasTest {
	
	@Test
	public void testIngenieroColocaLajas() {
		Mapa mapa = new Mapa(5, 5);
		Celda origen = mapa.getCelda(0, 0);
		Celda destino = mapa.getCelda(2, 2);
		Ingeniero ing = new Ingeniero(10);
		
		ing.caminar(origen, destino, mapa);
		
		List<Celda> camino = mapa.caminoMasCorto(origen, destino);
		for(Celda celda : camino) {
			assertTrue(celda.getTieneLaja());
		}
	}
	
	@Test public void testEjercitoCamina() {
		Mapa mapa = new Mapa(5, 5);
		Celda origen = mapa.getCelda(0, 0);
		Celda destino = mapa.getCelda(2, 2);
		
		Ingeniero ing = new Ingeniero(10);
		Caballero cab = new Caballero();
		Ejercito ejercito = new Ejercito();
		ejercito.agregar(cab);
		ejercito.agregar(ing);
		
		ejercito.caminar(origen, destino, mapa);
		
		List<Celda> camino = mapa.caminoMasCorto(origen, destino);
		long lajasColocadas = camino.stream().filter(celda -> celda.getTieneLaja()).count();
		assertTrue(lajasColocadas > 0);
	}
	
}
