package supermercado;

public class ProductoPrimeraNecesidad extends Producto{
	
	public ProductoPrimeraNecesidad(String nombre, double precio, boolean esPrecioCuidado) {
		super(nombre, precio, true);
	}
	
	@Override
	public double getPrecio() {
		return super.getPrecio() * 0.9;
	}
}
