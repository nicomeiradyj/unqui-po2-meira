package ar.edu.unq.po2.tp9.Observer;

import java.util.ArrayList;
import java.util.List;

public class SistemaReferenciaPublicaciones {
	private List<ArticuloCientifico> articulos;
	private List<Suscriptor> suscriptores;
	
	//this.articulos = new ArrayList<>(); // Crea la lista vacía
    //this.suscriptores = new ArrayList<>();
	
	public SistemaReferenciaPublicaciones(List<ArticuloCientifico> articulos, List<Suscriptor> suscriptores) {
		this.articulos = articulos;
		this.suscriptores = suscriptores;
	}
	
	// Aca añado al nuevo observador al sistema, como Suscriptor.
	public void añadirSuscriptor(Suscriptor suscriptor) {
		suscriptores.add(suscriptor);
	}
	
	public void quitarSuscriptor(Suscriptor suscriptor) {
		this.suscriptores.remove(suscriptor);
	}
	
	public void addArticulo(ArticuloCientifico articulo) {
		articulos.add(articulo);
		this.notificarSuscriptores(articulo);
	}
	
	public void notificarSuscriptores(ArticuloCientifico articulo) {
		List<Suscriptor> suscriptoresACopiar = new ArrayList<>(this.suscriptores);
		for(Suscriptor suscriptor : suscriptoresACopiar) {
			suscriptor.actualizar(articulo);
		}
	}
	
	
	
}
