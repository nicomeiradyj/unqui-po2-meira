package ar.edu.unq.po2.tp9.Observer;

public class CriterioAutor implements CriterioSuscripcion{
	private String autorBuscado;
	
	public CriterioAutor(String autorBuscado) {
		this.autorBuscado = autorBuscado;
	}
	
	@Override
	public boolean cumple(ArticuloCientifico articulo) {
		for(String autorArticulo : articulo.getAutores()) {
			if (autorArticulo.equalsIgnoreCase(this.autorBuscado)) {
				return true;
			}
		}
		return false;
	}
	
}
