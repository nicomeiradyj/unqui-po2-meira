package ar.edu.unq.po2.tp7.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import ar.edu.unq.po2.tp7.Cultivo;
import ar.edu.unq.po2.tp7.PorcionMixta;
import ar.edu.unq.po2.tp7.PorcionPura;
import ar.edu.unq.po2.tp7.PorcionesDeTierra;
import ar.edu.unq.po2.tp7.Soja;
import ar.edu.unq.po2.tp7.Trigo;

public class PorcionesDeTierraTest {
	
	@Test
	public void testGananciaCultivoEnPorcionMixta() {
		Cultivo soja = new Soja();
		Cultivo trigo = new Trigo();
		
		List<PorcionesDeTierra> subporciones = new ArrayList<>();
		subporciones.add(new PorcionPura(soja));
		subporciones.add(new PorcionPura(soja));
		subporciones.add(new PorcionPura(trigo));
		subporciones.add(new PorcionPura(trigo));
		
		PorcionesDeTierra porcionMixta = new PorcionMixta(subporciones);
		
		assertEquals(400, porcionMixta.gananciaAnual(), 0.01);
	}
	
	@Test
	public void testGananciaCultivoEnPorcionPura() {
		Cultivo soja = new Soja();
		PorcionesDeTierra porcionPura = new PorcionPura(soja);
		
		assertEquals(500, porcionPura.gananciaAnual(), 0.01);
	}
	
}
