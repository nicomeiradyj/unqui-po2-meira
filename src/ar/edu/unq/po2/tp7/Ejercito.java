package ar.edu.unq.po2.tp7;

import java.util.ArrayList;
import java.util.List;

public class Ejercito implements Personaje{
	private List<Personaje> miembros = new ArrayList<>();
	
	public void agregar(Personaje personaje) {
		miembros.add(personaje);
	}
	
	@Override
	public void caminar(Celda origen, Celda destino, Mapa mapa) {
		for(Personaje p : miembros) {
			p.caminar(origen, destino, mapa);
		}
	}
}
