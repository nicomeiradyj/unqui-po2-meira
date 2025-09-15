package ar.edu.unq.po2.tp5.test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

import ar.edu.unq.po2.tp5.Persona;
import ar.edu.unq.po2.tp5.Mascota;
import ar.edu.unq.po2.tp5.Nombre;

public class PersonasYMascotasTest {
	private Persona persona1;
	private Persona persona2;
	private Mascota mascota1;
	private Mascota mascota2;
	private List<Nombre> personasYMascotas;
	
	
	@BeforeEach
	public void setUp() {
		persona1 = new Persona("Juan", LocalDate.of(2000, 4, 22));
		persona2 = new Persona("Tomas", LocalDate.of(2010, 1, 1));
		mascota1 = new Mascota("Tikus", "Caniche");
		mascota2 = new Mascota("Max", "Husky");
		
		personasYMascotas = new ArrayList<>();
		personasYMascotas.add(persona1);
		personasYMascotas.add(persona2);
		personasYMascotas.add(mascota1);
		personasYMascotas.add(mascota2);
	}
	
	public List<String> iterarColeccion(List<Nombre> personasYMascotas) {
		List<String> nombres = new ArrayList<>();	
		for(Nombre n : personasYMascotas) {
				nombres.add(n.getNombre());
			}
		return nombres;
	}
	
	@Test
	void testEdadDePersonas() {
		assertEquals(25, persona1.getEdad());
		assertEquals(15, persona2.getEdad());
	}
	
	@Test
	void testImprimirNombresDeColeccion() {
		List<String> nombres = this.iterarColeccion(personasYMascotas);
		assertEquals(List.of("Juan", "Tomas", "Tikus", "Max"), nombres);
	}
}
