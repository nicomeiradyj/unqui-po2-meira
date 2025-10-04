package ar.edu.unq.po2.tp7;

import java.util.List;

public class PorcionMixta implements PorcionesDeTierra{
	private List<PorcionesDeTierra> subporciones;
	
	public PorcionMixta(List<PorcionesDeTierra> subporciones) {
		this.subporciones = subporciones;
	}
	
	@Override 
	public double gananciaAnual() {
		double total = 0;
		for(PorcionesDeTierra p : subporciones ) {
			total = total + p.gananciaAnual() / 4;
		}
		return total;
	}
	
	public double gananciaPlantacion(Cultivo plantacion) {
		double total = 0;
		for(PorcionesDeTierra p : subporciones) {
			total = total + p.gananciaPlantacion(plantacion) / 4;
		}
		return total;
	}
}


