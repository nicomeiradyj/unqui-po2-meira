package ar.edu.unq.po2.tp9.Observer;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SistemaReferenciaPublicacionesTest {

	private SistemaReferenciaPublicaciones sistema;
    private Investigador investigadorGamma;
    private Investigador investigadorSmalltalk;
    private Investigador investigadorGeneral;

    // Artículos de prueba (los definimos aquí para reusarlos)
    private ArticuloCientifico articuloGoF = new ArticuloCientifico(
            "Design Patterns",
            Arrays.asList("Gamma", "Helm", "Johnson", "Vlissides"),
            new ArrayList<>(), "Libro", "Addison-Wesley", new ArrayList<>());

    private ArticuloCientifico articuloConf = new ArticuloCientifico(
            "Observer Pattern in Practice",
            Arrays.asList("Beck"), new ArrayList<>(), "Conference Paper", "Smalltalks", new ArrayList<>());

    private ArticuloCientifico articuloOtro = new ArticuloCientifico(
            "Intro to Python",
            Arrays.asList("Guido"), new ArrayList<>(), "Tutorial", "Web", Arrays.asList("Programming"));


    @BeforeEach
    void setUp() {

        sistema = new SistemaReferenciaPublicaciones(new ArrayList<>(), new ArrayList<>());

        List<CriterioSuscripcion> criteriosGamma = new ArrayList<>();
        criteriosGamma.add(new CriterioAutor("Gamma"));

        List<CriterioSuscripcion> criteriosSmalltalk = new ArrayList<>();
        criteriosSmalltalk.add(new CriterioLugarPublicacion("Smalltalks"));

        List<CriterioSuscripcion> criteriosNada = new ArrayList<>(); // Esta ya estaba bien

        investigadorGamma = new Investigador("Investigador Gamma", criteriosGamma);
        investigadorSmalltalk = new Investigador("Investigador Smalltalk", criteriosSmalltalk);
        investigadorGeneral = new Investigador("Investigador General", criteriosNada);

        sistema.añadirSuscriptor(investigadorGamma);
        sistema.añadirSuscriptor(investigadorSmalltalk);
        sistema.añadirSuscriptor(investigadorGeneral);
    }

    @Test
    void testNotificacionCuandoCoincideAutor() {
        sistema.addArticulo(articuloGoF);


        assertNotNull(investigadorGamma.getUltimoArticuloNotificado(), "Gamma debería haber sido notificado");
        assertEquals(articuloGoF, investigadorGamma.getUltimoArticuloNotificado(), "Gamma debería haber recibido el artículo GoF");

        assertNull(investigadorSmalltalk.getUltimoArticuloNotificado(), "Smalltalk NO debería haber sido notificado");
        assertNull(investigadorGeneral.getUltimoArticuloNotificado(), "General NO debería haber sido notificado");
    }

    @Test
    void testNotificacionCuandoCoincideLugar() {
  
        sistema.addArticulo(articuloConf);

   
        assertNull(investigadorGamma.getUltimoArticuloNotificado());
        assertNotNull(investigadorSmalltalk.getUltimoArticuloNotificado());
        assertEquals(articuloConf, investigadorSmalltalk.getUltimoArticuloNotificado());
        assertNull(investigadorGeneral.getUltimoArticuloNotificado());
    }

    @Test
    void testNoNotificacionCuandoNoCoincideNada() {
     
        sistema.addArticulo(articuloOtro);

  
        assertNull(investigadorGamma.getUltimoArticuloNotificado());
        assertNull(investigadorSmalltalk.getUltimoArticuloNotificado());
        assertNull(investigadorGeneral.getUltimoArticuloNotificado());
    }

     @Test
    void testQuitarSuscriptor() {

        sistema.quitarSuscriptor(investigadorGamma);

        // Act
        sistema.addArticulo(articuloGoF);

        assertNull(investigadorGamma.getUltimoArticuloNotificado(), "Gamma fue quitado, no debería ser notificado");
    }
	
}
