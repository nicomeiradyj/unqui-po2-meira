package ar.edu.unq.po2.tp9.Observer;

public class CriterioTipoArticulo implements CriterioSuscripcion{
	private String tipo;

    public CriterioTipoArticulo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public boolean cumple(ArticuloCientifico articulo) {
        return articulo.getTipoArticulo().equalsIgnoreCase(this.tipo);
    }
}
