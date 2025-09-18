package ar.edu.unq.po2.tp6;

public class SolicitudDeCreditoPersonal extends SolicitudDeCredito{
	public SolicitudDeCreditoPersonal(Cliente cliente, double montoSolicitado, int plazo) {
		super(cliente, montoSolicitado, plazo);
	}
	
	public boolean sePuedeAceptar() {
		return cliente.ingresosAnuales() >= 15000 && this.montoCuotaMensual() < (cliente.sueldoMensual) * 0.7;
	}
}
