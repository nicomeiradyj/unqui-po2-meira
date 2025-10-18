package ar.edu.unq.po2.tp9.Observer;

public class CriterioFiliacion implements CriterioSuscripcion{
	
	String filiacionBuscada;
	
	public CriterioFiliacion(String filiacionBuscada) {
		this.filiacionBuscada = filiacionBuscada;
	}
	
	@Override
	public boolean cumple(ArticuloCientifico articulo) {
		for(String filiacionArticulo : articulo.getFiliaciones()) {
			if(filiacionArticulo == this.filiacionBuscada) {
				return true;
			}
		}
		return false;
	}
}
