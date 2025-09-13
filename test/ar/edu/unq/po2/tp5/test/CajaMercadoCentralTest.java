package ar.edu.unq.po2.tp5.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp5.AgenciaCiudad;
import ar.edu.unq.po2.tp5.CajaMercadoCentral;
import ar.edu.unq.po2.tp5.Impuesto;
import ar.edu.unq.po2.tp5.MercadoCentral;
import ar.edu.unq.po2.tp5.Producto;
import ar.edu.unq.po2.tp5.ProductoCooperativa;
import ar.edu.unq.po2.tp5.ProductoTradicional;
import ar.edu.unq.po2.tp5.Servicio;

public class CajaMercadoCentralTest {
	private MercadoCentral mercado;
    private CajaMercadoCentral caja;
    private Producto arroz;
    private ProductoTradicional fideos;
    private ProductoCooperativa soda;
    private Servicio servicio1;
    private Servicio servicio2;
    private Servicio servicio3;
    private Impuesto luz;
    private Impuesto agua;
    private Impuesto gas;
    private AgenciaCiudad agencia;
    @BeforeEach
    public void setUp() {
    	arroz = new Producto("Arroz", 500, 10);
        fideos = new ProductoTradicional("Fideos", 700, 5);
        soda = new ProductoCooperativa("Soda", 600, 3, 0.9);
        servicio1 = new Servicio(1000, 3);
        servicio2 = new Servicio(2000, 5);
        servicio3 = new Servicio(10000, 1);
        luz = new Impuesto(5000);
        agua = new Impuesto(3000);
        gas = new Impuesto(4000);
        agencia = new AgenciaCiudad();
        
       
        mercado = new MercadoCentral();
        mercado.agregarProducto(arroz);
        mercado.agregarProducto(fideos);
        mercado.agregarProducto(soda);
        
        caja = new CajaMercadoCentral(mercado);
        caja.agregarServicioACliente(servicio1);
        caja.agregarServicioACliente(servicio2);
        caja.agregarServicioACliente(servicio3);
        caja.agregarImpuestoACliente(agua);
        caja.agregarImpuestoACliente(gas);
        caja.agregarImpuestoACliente(luz);
        
        
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
    
    @Test
    void testPrecioTotalImpuestos() {
    	assertEquals(12000, caja.pagarImpuestos(caja.getImpuestosDelCliente(), agencia)); // Cuando ejecuto, tambien se abre la consola porque se le informa a la agencia del pago de la factura.
    }
    
    
    @Test
    void testPrecioTotalServicios() {
    	assertEquals(23000, caja.pagarServicios(caja.getServiciosDelCliente(), agencia)); // Cuando ejecuto, tambien se abre la consola porque se le informa a la agencia del pago de la factura.
    }
}
