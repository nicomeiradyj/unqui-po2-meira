package ar.edu.unq.po2.tp9.Observer;

import java.util.List;

public class GestorPartidos {
	
	private List<Partido> partidos;
	private List<SuscriptorResultado> suscriptores;
	
	public GestorPartidos(List<Partido> partidos, List<SuscriptorResultado> suscriptores) {
		this.partidos = partidos;
		this.suscriptores = suscriptores;
	}
	
	public void añadirSuscriptores(SuscriptorResultado suscriptor) {
		this.suscriptores.add(suscriptor);
	}
	
	public void quitarSuscriptores(SuscriptorResultado suscriptor) {
		this.suscriptores.remove(suscriptor);
	}
	
	public void addPartido(Partido nuevoPartido) {
		this.partidos.add(nuevoPartido);
		this.notificarSuscriptores(nuevoPartido);
	}
	
	public void notificarSuscriptores(Partido nuevoPartido) {
		for(SuscriptorResultado suscriptor : this.suscriptores) {
			suscriptor.actualizar(nuevoPartido);
		}
	}
	
}
