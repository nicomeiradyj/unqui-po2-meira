package ar.edu.unq.po2.tp9.Observer;

public class CriterioPalabrasClave implements CriterioSuscripcion{
	String palabraBuscada;
	
	public CriterioPalabrasClave(String palabraBuscada) {
		this.palabraBuscada = palabraBuscada;
	}
	
	@Override
	public boolean cumple(ArticuloCientifico articulo) {
		for(String palabraArticulo : articulo.getPalabrasClaves()) {
			if(palabraArticulo == this.palabraBuscada) {
				return true;
			}
		}
		return false;
	}
}
