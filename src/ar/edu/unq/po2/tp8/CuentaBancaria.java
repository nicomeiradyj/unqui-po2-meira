package ar.edu.unq.po2.tp8;

import java.util.ArrayList;
import java.util.List;
	// Clase Abstracta
public abstract class CuentaBancaria {
	
	private String titular;
	private int saldo;
	private List<String> movimientos;
	
	public CuentaBancaria(String titular){
		this.titular=titular;
		this.saldo=0;
		this.movimientos=new ArrayList<String>();
	}
	public String getTitular(){
		return this.titular;
	}
	
	public int getSaldo(){
		 return this.saldo;
	}
	
	protected void setSaldo(int monto){
		this.saldo=monto;
	}
	
	public void agregarMovimientos(String movimiento){
		this.movimientos.add(movimiento);
	}
	
	// Template Method
	public final void extraer(int monto) {
		if(this.puedeExtraer(monto)) {
			this.setSaldo(this.getSaldo() - monto);
			this.agregarMovimientos("Extraccion");
		}
	}
	
	// Primitive Operation
	protected abstract boolean puedeExtraer(int monto);
	
}

 
