package ar.edu.unq.po2.tp6;

public class Cliente {
	String nombre;
	String apellido;
	int edad;
	double sueldoMensual;
	
	public Cliente(String nombre, String apellido, int edad, double sueldoMensual) {
		this.nombre = nombre;
		this.edad = edad;
		this.apellido = apellido;
		this.sueldoMensual = sueldoMensual;
	}
	
	public void solicitarCreditoAlBancoPor(Banco banco, double cantidadDinero) {
		banco.registrarSolicitudDeCreditoDelCliente(this);
		banco.evaluarSolicitud(this, cantidadDinero);
	}
	
	public double ingresosAnuales() {
		return sueldoMensual * 12;
	}
	
}
