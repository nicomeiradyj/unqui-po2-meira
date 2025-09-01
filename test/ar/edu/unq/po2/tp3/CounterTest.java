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
	 
	 @Test
	 public void testNumeroConMasDigitosPares() {
		 // El que mas digitos pares tiene es el 2222.
		Counter arrayNumeros = new Counter();
		arrayNumeros.addNumber(1234);
		arrayNumeros.addNumber(2222);
		arrayNumeros.addNumber(1357);
		arrayNumeros.addNumber(1284);
	    assertEquals(2222, arrayNumeros.numeroConMasDigitosPares());
	 }
	 
	 @Test
	 public void testNumeroConMasDigitosParesTeniendoA2NumerosConLaMismaCantidad() {
		 // Los numeros que mas digitos pares tienen son: el 2222 y el 2284. El sistema devuelve automaticamente el primero con mas cantidad de digitos pares.
		Counter arrayNumeros = new Counter();
		arrayNumeros.addNumber(1234);
		arrayNumeros.addNumber(2222);
		arrayNumeros.addNumber(1357);
		arrayNumeros.addNumber(2284);
	    assertEquals(2222, arrayNumeros.numeroConMasDigitosPares());
	 }
	 
	 @Test
	 public void testNumeroConMasDigitosParesTeniendoANumerosNegativos() {
		 // Los numeros que mas digitos pares tienen son: el 2222 y el 2284. El sistema devuelve automaticamente el primero con mas cantidad de digitos pares.
		Counter arrayNumeros = new Counter();
		arrayNumeros.addNumber(-1234);
		arrayNumeros.addNumber(-2222);
		arrayNumeros.addNumber(-1357);
		arrayNumeros.addNumber(-2284);
	    assertEquals(-2222, arrayNumeros.numeroConMasDigitosPares());
	 }
	 
	 @Test
	 public void testMultiploMasAltoDe() {
	    assertEquals(999, counter.multiploMasAltoDe(3, 9));
	 }
	 
	 @Test
	 public void testMultiploMasAltoDeCon0() {
	    assertEquals(-1, counter.multiploMasAltoDe(0, 9));
	 }
	 
	 @Test
	 public void testEjercicio4A() {
		 String a = "abc";
		 assertEquals(3, a.length());
	 }
	 
	 @Test
	 public void testEjercicio4AParteDos() {
		 String a = "abc";
		 String s = a;	
		 assertEquals(3, s.length());
	 }
	 
	 // Ejercicio 4.B:
	 /*
	 @Test
	 public void testEjercicio4B() {
		 String t;							ESTO FALLA PORQUE LA VARIABLE T NO FUE INICIALIZADA, SI YO LE PIDO EL LENGHT LE ESTARIA PIDIENDO A UNA VARIABLE VACIA Y DA ERROR.
		 assertEquals(0, t.length());
	 }
	 */
	 
	 @Test
	 public void testEjercicio4C() {
		 String a = "abc";
		 assertEquals("1abc", 1 + a);
	 }
	 
	 @Test
	 public void testEjercicio4D() {
		 String a = "abc";
		 assertEquals("ABC", a.toUpperCase());
	 }
	 
	 @Test
	 public void testEjercicio4E() {
		 assertEquals(4, "Libertad".indexOf("r"));  // El numero de indice es 4 porque empieza en 0.
	 }
	 
	 @Test
	 public void testEjercicio4F() {	
		 assertEquals(7, "Universidad".lastIndexOf("i"));
	 }
	 
	 @Test
	 public void testEjercicio4G() {	
		 assertEquals("il", "Quilmes".substring(2, 4));
	 }
	 
	 @Test
	 public void testEjercicio4H() {
		 String a = "abc";
		 assertEquals(false, (a.length() + a).startsWith("a"));
	 }
	 
	 @Test
	 public void testEjercicio4I() {
		 String a = "abc";
		 String s = a;	
		 assertEquals(true, s == a);
	 }
	 
	 @Test
	 public void testEjercicio4J() {
		 String a = "abc";
		 assertEquals(true, a.substring(1, 3).equals("bc"));
	 }
	 
}

