package ar.edu.unq.po2.tp4.Trabajador;

public class IngresoHorasExtras extends Ingreso {
	
	int horasExtras;
	
	public IngresoHorasExtras (String mesDePercepcion, String concepto, double montoPercibido, int horasExtras) {
		super(mesDePercepcion, concepto, montoPercibido);
		this.horasExtras = horasExtras;
	}
	
	public double getMontoImponible() {
		return 0;
	}
	
}
