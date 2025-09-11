package ar.edu.unq.po2.tp5;

public class Factura {
	double monto;
	String concepto;
	
	public Factura(double monto, String concepto) {
		this.monto = monto;
		this.concepto = concepto;
	}
	
	public double getMonto() {
		return this.monto;
	}
	
	public String getConcepto() {
		return this.concepto;
	}
}
