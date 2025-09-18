package ar.edu.unq.po2.tp6;

public class SolicitudDeCreditoHipotecario extends SolicitudDeCredito{
	
	PropiedadInmobiliaria garantia;
	
	public SolicitudDeCreditoHipotecario(Cliente cliente, double montoSolicitado, int plazo, PropiedadInmobiliaria garantia) {
		super(cliente, montoSolicitado, plazo);
		this.garantia = garantia;
	}
	
	public boolean sePuedeAceptar() {
		return this.montoCuotaMensual() < cliente.sueldoMensual &&
				this.montoSolicitado < this.garantia.valorFiscal * 0.7 && 
				cliente.edad < 65;
	}
	
	public boolean montoMensualNoSuperaLaMitadDeLosIngresosMensualesDelTitular() {
		return this.montoCuotaMensual() < cliente.sueldoMensual;
	}
	
}
