package ar.edu.unq.po2.tp9.Observer;

public class CriterioLugarPublicacion implements CriterioSuscripcion {
    private String lugarBuscado;

    public CriterioLugarPublicacion(String lugar) {
        this.lugarBuscado = lugar;
    }

    @Override
    public boolean cumple(ArticuloCientifico articulo) {
    	return articulo.getLugarPublicacion().equalsIgnoreCase(this.lugarBuscado);
    }
}
