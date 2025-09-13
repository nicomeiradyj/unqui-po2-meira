package ar.edu.unq.po2.tp5;

import java.util.ArrayList;
import java.util.List;

public class AgenciaCiudad implements Agencia{
	
	private List<Factura> facturasRegistradas = new ArrayList<>();
	
	@Override
	public void registrarPago(Factura factura) {
		facturasRegistradas.add(factura);
		System.out.println("Se registro el pago de la factura " + factura.getConcepto());
	}
	
	public List<Factura> getFacturasRegistradas(){
		return facturasRegistradas;
	}
}
