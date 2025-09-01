package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



public class CounterTest {
	private Counter counter;
	/**
	* Crea un escenario de test básico, que consiste en un contador
	* con 10 enteros
	*
	* @throws Exception
	*/
	@BeforeEach
	public void setUp() throws Exception {
	
		//Se crea el contador
		counter = new Counter();
	
		//Se agregan los numeros. Un solo par y nueve impares
		counter.addNumber(1);
		counter.addNumber(3);
		counter.addNumber(5);
		counter.addNumber(7);
		counter.addNumber(9);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(4);
	}
	
	/**
	* Verifica la cantidad de pares
	*/
	@Test
	public void testCountEven() {
        // pares: 4, total = 3
        assertEquals(1, counter.countEven());
    }
	
	@Test
	public void testCountEvenConListaVacia() {
        Counter vacio = new Counter();
        assertEquals(0, vacio.countEven());
    }
	
	 @Test
	 public void testCountEvenSoloImpares() {
	    Counter soloImpares = new Counter();
	    soloImpares.addNumber(1);
	    soloImpares.addNumber(3);
	    soloImpares.addNumber(5);
	    assertEquals(0, soloImpares.countEven());
	 }
	 
	 @Test
	 public void testCountOdd() {
		 // impares = 9
		 assertEquals(9, counter.countOdd());
	 }
	 
	 @Test
	 public void testCountOddConListaVacia() {
	    Counter vacio = new Counter();
	    assertEquals(0, vacio.countOdd());
	 }
	 
	 @Test
	 public void testCountOddSoloPares() {
	    Counter soloPares = new Counter();
	    soloPares.addNumber(2);
	    soloPares.addNumber(6);
	    soloPares.addNumber(10);
	    assertEquals(0, soloPares.countOdd());
	 }
	 
	 @Test
	 public void testCountMultiplesOf() {
		 // divisor = 3, entonces hay 2 multiplos de 3: 3 y 9.
	    assertEquals(2, counter.countMultiplesOf(3));
	 }
	 
	 @Test
	 public void testCountMultiplesOfSinNingunMultiplo() {
		 // divisor = 8, no hay ningun numero que sea multiplo de 8
	    assertEquals(0, counter.countMultiplesOf(8));
	 }
	 
}

