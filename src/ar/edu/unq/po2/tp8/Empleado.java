package ar.edu.unq.po2.tp8;

public abstract class Empleado {
	public final double sueldo() {
		// Template Method
		double sueldoBruto = this.calcularSueldoBruto();
		double descuentos = this.calcularDescuentos(sueldoBruto);
		return sueldoBruto - descuentos; 
	}
	
	// Metodo Abstracto (Primitive Operation)
	protected abstract double calcularSueldoBruto();
	
	// Metodo Concreto (Parte Fija)
	private double calcularDescuentos(double sueldoBruto) {
		return sueldoBruto * 0.13;
	}
}
