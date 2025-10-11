package ar.edu.unq.po2.tp8;

public class EmpleadoTemporario extends Empleado{
	
	int horasDeTrabajo;
	double sueldoBasico;
	boolean poseeHijos;
	boolean estaCasado;
	
	
	public EmpleadoTemporario(int horasDeTrabajo, double sueldoBasico, boolean poseeHijos, boolean estaCasado) {
		this.horasDeTrabajo = horasDeTrabajo;
		this.sueldoBasico = 1000;
		this.poseeHijos = poseeHijos;
		this.estaCasado = estaCasado;
	}
	
	public int siTieneHijosOEstaCasado100(EmpleadoTemporario e) {
		if (e.estaCasado || e.poseeHijos) {
			return 100;
		} else {
			return 0;
		}
	}
	
	@Override
	protected double calcularSueldoBruto() {
		double montoPorHoras = this.horasDeTrabajo;
		double montoFamiliar = this.siTieneHijosOEstaCasado100(this);
		return this.sueldoBasico + montoPorHoras + montoFamiliar;
	}
	
}
