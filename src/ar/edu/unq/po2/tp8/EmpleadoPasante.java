package ar.edu.unq.po2.tp8;

public class EmpleadoPasante extends Empleado{
	
	int horasTrabajadasMes;
	
	public EmpleadoPasante(int horasTrabajadasMes) {
		this.horasTrabajadasMes = horasTrabajadasMes;
	}
	
	@Override
	protected double calcularSueldoBruto() {
		return horasTrabajadasMes * 40;
	}

}
