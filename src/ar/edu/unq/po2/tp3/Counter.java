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
	
}