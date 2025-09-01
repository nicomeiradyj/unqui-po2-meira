package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;

public class Counter {
    
	private List<Integer> numeros;
	
	public Counter() { // Constructor, siempre tiene que tener el mismo nombre que la clase
		this.numeros = new ArrayList<>();
	}
	
	public void addNumber(int numero) {
		this.numeros.add(numero);
	}
	
	public int countEven() {
		int count = 0;
		for(Integer n : numeros) { // aca se hace un foreach
			if (n % 2 == 0) { // % es modulo
				count++;
			}
		}
		return count;
	}
	
	public int countOdd() {
		int count = 0;
		for (Integer n : numeros) {
			if(n % 2 != 0) {
				count ++;
			}
		}
		return count;
	}
	
	public int countMultiplesOf(int divisor) {
		int count = 0;
		for (Integer n : numeros) {
			if (n % divisor == 0) {
				count ++;
			}
		}
		return count;
	}
	
	public int numeroConMasDigitosPares() {
		int maxPares = -1;
		int maxNumero = 0;
		for (Integer n : numeros) {
			int copiaDeN = Math.abs(n); 
			int contadorDePares = 0;
			while (copiaDeN > 0) {
				int ultimo = copiaDeN % 10; // agarro el ultimo digito de N
				if( ultimo % 2 == 0) {
					contadorDePares++;
				}
				copiaDeN = copiaDeN / 10; // saco el ultimo digito del numero
			}
			if (contadorDePares > maxPares) {
				maxPares = contadorDePares;
				maxNumero = n;
			}
		}
		return maxNumero;
	}
	
	public int multiploMasAltoDe(int x, int y) {
		if(x == 0 || y == 0) {
			return -1;
		}
		for(int n = 1000; n >= 0; n--) {
			if(n % x == 0 && n % y == 0) {
				return n;
			}
		}
		return -1;
	}
	
	
}