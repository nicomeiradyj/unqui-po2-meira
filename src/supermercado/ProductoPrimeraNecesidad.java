package supermercado;

public class ProductoPrimeraNecesidad extends Producto{
	
	double descuento;
	
	public ProductoPrimeraNecesidad(String nombre, double precio, boolean esPrecioCuidado, double descuento) {
		super(nombre, precio, true);
		this.descuento = descuento;
	}
	
	@Override
	public double getPrecio() {
		return super.getPrecio() * descuento;
	}
}
