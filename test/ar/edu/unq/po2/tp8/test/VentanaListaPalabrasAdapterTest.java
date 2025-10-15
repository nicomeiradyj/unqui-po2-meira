package ar.edu.unq.po2.tp8.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp8.ListaDePalabrasOrdenadas;
import ar.edu.unq.po2.tp8.VentanaListaPalabrasAdapter;

class VentanaListaPalabrasAdapterTest {

    private ListaDePalabrasOrdenadas listaOrdenada; 
    private VentanaListaPalabrasAdapter adapter;      

    @BeforeEach
    void setUp() {
        this.listaOrdenada = new ListaDePalabrasOrdenadas();
        this.adapter = new VentanaListaPalabrasAdapter(this.listaOrdenada);
    }

    @Test
    void testAlAgregarPalabrasElAdaptadorLasMantieneOrdenadas() {
       // SetUp
    	adapter.addElement("casa");
        adapter.addElement("arbol");
        adapter.addElement("perro");
        adapter.addElement("telefono");
        adapter.addElement("brazo");
        
        // Verify
        
        assertEquals(5, adapter.getSize()); 
        
        assertEquals("arbol", adapter.getElementAt(0));
        assertEquals("brazo", adapter.getElementAt(1));
        assertEquals("casa", adapter.getElementAt(2));
        assertEquals("perro", adapter.getElementAt(3));
        assertEquals("telefono", adapter.getElementAt(4));
    }
}
