package ar.edu.unq.po2.tp5;

public class Impuesto {
	double tasaDeServicio;
	
	public Impuesto(double tasaDeServicio) {
		this.tasaDeServicio = tasaDeServicio;
	}
	
	public double getPrecioImpuesto() {
		return this.tasaDeServicio;
	}
}
