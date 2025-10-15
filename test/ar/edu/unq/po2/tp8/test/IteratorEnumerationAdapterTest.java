package ar.edu.unq.po2.tp8.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp8.IteratorEnumerationAdapter;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

public class IteratorEnumerationAdapterTest {
	@Test
    void testAdaptadorRecorreCorrectamenteUnArrayList() {
        // 1. Arrange (Preparación)
        // Creamos la lista original y le agregamos datos.
        List<String> listaOriginal = new ArrayList<>();
        listaOriginal.add("Primer Elemento");
        listaOriginal.add("Segundo Elemento");
        listaOriginal.add("Tercer Elemento");
        
        // Obtenemos el Iterator que queremos adaptar.
        Iterator<String> iterator = listaOriginal.iterator();
        
        // Creamos nuestro adaptador, pasándole el iterator.
        // Ahora 'adaptador' se comporta como una Enumeration.
        Enumeration<String> adaptador = new IteratorEnumerationAdapter<>(iterator);

        // 2. Act & Assert (Actuar y Verificar)
        // Verificamos que el adaptador dice que tiene elementos.
        assertTrue(adaptador.hasMoreElements());
        
        // Recorremos y verificamos cada elemento uno por uno.
        assertEquals("Primer Elemento", adaptador.nextElement());
        
        assertTrue(adaptador.hasMoreElements());
        assertEquals("Segundo Elemento", adaptador.nextElement());
        
        assertTrue(adaptador.hasMoreElements());
        assertEquals("Tercer Elemento", adaptador.nextElement());
        
        // Al final, verificamos que el adaptador ya no tiene más elementos.
        assertFalse(adaptador.hasMoreElements());
    }
}
