package ar.edu.unq.po2.tp7.Mockito;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PokerStatus {
	
	public boolean verificar(Carta c1, Carta c2, Carta c3, Carta c4, Carta c5) {
		List<Carta> cartas = List.of(c1, c2, c3, c4, c5);
		Map<Integer, Integer> contador = new HashMap<>();
		for(Carta carta : cartas) {
			contador.put(carta.getValor(), contador.getOrDefault(carta.getValor(), 0) + 1);
		}
		return contador.values().stream().anyMatch(cantidad -> cantidad >= 4);
	}
	
	public String verificarPCTN(Carta c1, Carta c2, Carta c3, Carta c4, Carta c5) {// Verificar para Poquer, Color,  Trio o Nada. 
		List<Carta> cartas = List.of(c1, c2, c3, c4, c5);
		if(hayPoquer(cartas)) {
			return "Poquer";
		}  else {
			if (hayTrio(cartas)) {
				return "Trio";
			} else {
				if (hayColor(cartas)) {
					return "Color";
				} else {
					return "Nada";
				}
			}
		}
	}
	
	private boolean hayPoquer(List<Carta> cartas) {
		Map<Integer, Integer> contador = new HashMap<>();
		for(Carta carta : cartas) {
			contador.put(carta.getValor(), contador.getOrDefault(carta.getValor(), 0) + 1);
		}
		return contador.values().stream().anyMatch(cantidad -> cantidad >= 4);
	}
	
	private boolean hayTrio(List<Carta> cartas) {
		Map<Integer, Integer> contador = new HashMap<>();
		for(Carta carta : cartas) {
			contador.put(carta.getValor(), contador.getOrDefault(carta.getValor(), 0) + 1);
		}
		return contador.values().stream().anyMatch(cantidad -> cantidad == 3);
	}
	
	private boolean hayColor(List<Carta> cartas) {
		Map<String, Integer> contador = new HashMap<>();
		for(Carta carta : cartas) {
			contador.put(carta.getPalo(), contador.getOrDefault(carta.getPalo(), 0) + 1);
		}
		return contador.values().stream().anyMatch(cantidad -> cantidad == 5);
	}
	
	private int ranking(List<Carta> jugada) {
		if(hayPoquer(jugada)) {
			return 3;
		} else if (hayColor(jugada)){
			return 2;
		} else if(hayTrio(jugada)) {
			return 1;
		} else {
			return 0;
		}
	}
	
	public List<Carta> jugadaGanadora(List<Carta> jugada1, List<Carta> jugada2){
		int ranking1 = ranking(jugada1);
		int ranking2 = ranking(jugada2);
		
		if(ranking1 > ranking2) {
			return jugada1;
		} else if(ranking2 > ranking1) {
			return jugada2;
		} else {
			return manoConJugadaMasGrande(jugada1, jugada2);
		}
	}
	
	private List<Carta> manoConJugadaMasGrande(List<Carta> jugada1, List<Carta> jugada2) {
		return  null;
	}
	
}
