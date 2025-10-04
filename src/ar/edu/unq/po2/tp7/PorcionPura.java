package ar.edu.unq.po2.tp7;

public class PorcionPura implements PorcionesDeTierra{
	public Cultivo plantacion;
	
	public PorcionPura(Cultivo plantacion) {
		this.plantacion = plantacion;
	}
	
	@Override
	public double gananciaAnual() {
		return plantacion.precioPorHectarea();
	}
	
	public double gananciaPlantacion(Cultivo plantacion) {
		if (this.plantacion == plantacion) {
			return plantacion.precioPorHectarea();
		} else {
			return 0;
		}
	}
}
