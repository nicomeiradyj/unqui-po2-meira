package ar.edu.unq.po2.tp4.Trabajador;

public class Ingreso {
	String mesDePercepcion;
	String concepto;
	double montoPercibido;
	
	public Ingreso (String mesDePercepcion, String concepto, double montoPercibido) {
		this.mesDePercepcion = mesDePercepcion;
		this.concepto = concepto;
		this.montoPercibido = montoPercibido;
	}
	
	public double getMontoPercibido() {
		return montoPercibido;
	}
	
	public double getMontoImponible() {
		return this.montoPercibido;
	}
	
}
