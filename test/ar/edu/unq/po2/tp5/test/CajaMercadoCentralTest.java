package ar.edu.unq.po2.tp5.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp5.CajaMercadoCentral;
import ar.edu.unq.po2.tp5.MercadoCentral;
import ar.edu.unq.po2.tp5.Producto;
import ar.edu.unq.po2.tp5.ProductoCooperativa;
import ar.edu.unq.po2.tp5.ProductoTradicional;

public class CajaMercadoCentralTest {
	private MercadoCentral mercado;
    private CajaMercadoCentral caja;
    private Producto arroz;
    private ProductoTradicional fideos;
    private ProductoCooperativa soda;
    
    @BeforeEach
    public void setUp() {
    	arroz = new Producto("Arroz", 500, 10);
        fideos = new ProductoTradicional("Fideos", 700, 5);
        soda = new ProductoCooperativa("Soda", 600, 3, 0.9);
        
        mercado = new MercadoCentral();
        mercado.agregarProducto(arroz);
        mercado.agregarProducto(fideos);
        mercado.agregarProducto(soda);
        
        caja = new CajaMercadoCentral(mercado);
    }
    
    @Test
    void testRegistrarProductoAumentaElTotal() {
    	caja.registrarProducto(arroz);
    	assertEquals(500, caja.getPrecioTotal());
    }
    
    @Test
    void testRegistrarVariosProductosSumaCorrectamente() {
        caja.registrarProducto(arroz);
        caja.registrarProducto(fideos);
        caja.registrarProducto(soda); // este aplica descuento

        // Precio esperado: 500 + 700 + (600 * 0.9) = 500 + 700 + 540 = 1740
        assertEquals(1740, caja.getPrecioTotal());
    }
    
    @Test
    void testRegistrarProductoDecrementaStock() {
        int stockInicial = arroz.getStock();

        caja.registrarProducto(arroz);

        assertEquals(stockInicial - 1, arroz.getStock());
    }
    
}
