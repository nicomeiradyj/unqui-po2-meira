package ar.edu.unq.po2.tp8;

public class EmpleadoPlanta extends Empleado{
	
	int cantidadDeHijos;
	double sueldoBasico;
	
	public EmpleadoPlanta(int cantidadDeHijos) {
		this.cantidadDeHijos = cantidadDeHijos;
		this.sueldoBasico = 3000;
	}
	
	@Override
	protected double calcularSueldoBruto() {
		double montoPorHijos = 150 * cantidadDeHijos;
		return sueldoBasico + montoPorHijos;
	}

}
