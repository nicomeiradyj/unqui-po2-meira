package ar.edu.unq.po2.tp6;

public class SolicitudDeCreditoHipotecario extends SolicitudDeCredito{
	
	PropiedadInmobiliaria garantia;
	
	public SolicitudDeCreditoHipotecario(Cliente cliente, double montoSolicitado, int plazo, PropiedadInmobiliaria garantia) {
		super(cliente, montoSolicitado, plazo);
		this.garantia = garantia;
	}
	
	public boolean sePuedeAceptar() {
		return this.montoMensualNoSuperaLaMitadDeLosIngresosMensualesDelTitular() &&
				this.montoSolicitadoNoSuperaElSetentaPorCientoDelValorFiscalDeLaGarantia() && 
				this.edadDeClienteNoSuperaLos65AntesDeTerminarDePagarElCredito();
	}
	
	public boolean montoMensualNoSuperaLaMitadDeLosIngresosMensualesDelTitular() {
		return this.montoCuotaMensual() < cliente.sueldoMensual;
	}
	
	public boolean montoSolicitadoNoSuperaElSetentaPorCientoDelValorFiscalDeLaGarantia() {
		return this.montoSolicitado < this.garantia.valorFiscal * 0.7;
	}
	
	public boolean edadDeClienteNoSuperaLos65AntesDeTerminarDePagarElCredito() {
		return edadDeClienteDespuesDeTerminarDePagarElCredito() < 65;
	}
	
	public int edadDeClienteDespuesDeTerminarDePagarElCredito() {
		return cliente.edad + (this.plazoEnMeses / 12);
	}
	
}
