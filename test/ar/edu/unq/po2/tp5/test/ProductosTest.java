package ar.edu.unq.po2.tp5.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp5.Producto;
import ar.edu.unq.po2.tp5.ProductoCooperativa;
import ar.edu.unq.po2.tp5.ProductoTradicional;

public class ProductosTest {
	
	private Producto arroz;
    private ProductoTradicional fideos;
    private ProductoCooperativa soda;

    @BeforeEach
    public void setUp() {
        arroz = new Producto("Arroz", 500, 20);
        fideos = new ProductoTradicional("Fideos", 700, 15);
        soda = new ProductoCooperativa("Soda", 600, 5, 0.9);
    }

    @Test
    void testPrecioArroz(){
        assertEquals(500, arroz.getPrecio());
    }
    
    @Test
    void testPrecioFideos() {
    	assertEquals(700, fideos.getPrecio());
    }
    
    @Test
    void testPrecioSoda() {
    	assertEquals(540, soda.getPrecio()); // 540 por el descuento de ser producto de cooperativa.
    }
    
    @Test
    void testStockArroz() {
    	assertEquals(20, arroz.getStock());
    }
	
}
