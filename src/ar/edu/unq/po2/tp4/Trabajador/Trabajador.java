package ar.edu.unq.po2.tp4.Trabajador;

import java.util.ArrayList;
import java.util.List;

public class Trabajador {
	private List<Ingreso> ingresosPercibidos = new ArrayList<>();
	
	public void agregarIngreso(Ingreso ingreso) {
		ingresosPercibidos.add(ingreso);
	}
	
	public double getMontoPercibido() {
		double total = 0;
		for (Ingreso ingreso : ingresosPercibidos) {
			total = total + ingreso.getMontoPercibido();
		}
		return total;
	}
	
	public double getMontoImponible() {
		double total = 0; 
		for (Ingreso ingreso : ingresosPercibidos) {
			total = total + ingreso.getMontoImponible();
		}
		return total;
	}
	
	public double getImpuestoAPagar() {
		return this.getMontoImponible() * 0.02;
	}
}
