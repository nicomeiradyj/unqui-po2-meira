package ar.edu.unq.po2.tp6;

public abstract class SolicitudDeCredito {
	Cliente cliente;
	double montoSolicitado;
	int plazoEnMeses;
	
	public SolicitudDeCredito(Cliente cliente, double montoSolicitado, int plazoEnMeses) {
		this.cliente = cliente;
		this.montoSolicitado = montoSolicitado;
		this.plazoEnMeses = plazoEnMeses;
	}
	
	public double montoCuotaMensual() {
		return this.montoSolicitado / this.plazoEnMeses;
	}
	
	public abstract boolean sePuedeAceptar();
	
}
