package ar.edu.unq.po2.tp7;

import java.util.List;

public class Ingeniero implements Personaje{
	private int cantidadDeLajas;
	
	public Ingeniero(int cantidadDeLajas) {
		this.cantidadDeLajas = cantidadDeLajas;
	}
	
	public void caminar(Celda origen, Celda destino, Mapa mapa) {
		List<Celda> camino = mapa.caminoMasCorto(origen, destino);
		for(Celda celda : camino) {
			if(!celda.getTieneLaja() && cantidadDeLajas > 0) {
				celda.colocarLaja();
				cantidadDeLajas--;
			}
		}
	}
}
