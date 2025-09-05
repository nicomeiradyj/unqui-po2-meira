package supermercado;

public class ProductoPrimeraNecesidad extends Producto{
	
	public ProductoPrimeraNecesidad(String nombre, double precio, boolean esPrecioCuidado) {
		super(nombre, precio, 0);
	}
	
	@Override
	public double getPrecio() {
		return super.getPrecio() * 3;
	}
}
