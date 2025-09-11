package ar.edu.unq.po2.tp5;

public class ProductoCooperativa extends Producto{
	
	double descuento;
	
	public ProductoCooperativa(String nombre, double precio, int stock, double descuento) {
		super(nombre, precio, stock);
		this.descuento = descuento;
	}
	
	@Override
	public double getPrecio() {
		return super.getPrecio() * descuento;
	}
	
}
