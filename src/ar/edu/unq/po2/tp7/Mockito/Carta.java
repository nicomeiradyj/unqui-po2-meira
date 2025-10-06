package ar.edu.unq.po2.tp7.Mockito;

import java.util.Objects;

public class Carta {
	private int valor;
	private String palo;
	
	public Carta(int valor, String palo) {
		this.palo = palo;
		this.valor = valor;
	}
	
	public int getValor() {
		return valor;
	}
	
	public String getPalo() {
		return palo;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
        if (!(o instanceof Carta)) return false;
        Carta carta = (Carta) o;
        return valor == carta.valor && palo.equals(carta.palo);
    }

	@Override
	public int hashCode() {
	    return Objects.hash(valor, palo);
	    
	}
}

