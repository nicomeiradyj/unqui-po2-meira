package ar.edu.unq.po2.tp8;

import java.util.List;

public class Empresa {
	
	List<Empleado> empleados;
	
	public Empresa(List<Empleado> empleados) {
		this.empleados = empleados;
	}
	
	public void pagoDeSueldos() {
		for(Empleado e : empleados) {
			e.sueldo();
		}
	}
	
}
