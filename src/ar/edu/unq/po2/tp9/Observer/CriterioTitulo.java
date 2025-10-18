package ar.edu.unq.po2.tp9.Observer;

public class CriterioTitulo implements CriterioSuscripcion {
    private String titulo;

    public CriterioTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public boolean cumple(ArticuloCientifico articulo) {
        return articulo.getTitulo().equalsIgnoreCase(this.titulo);
    }
}
