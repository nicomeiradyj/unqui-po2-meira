package ar.edu.unq.po2.tp8.test;

import ar.edu.unq.po2.tp8.Empleado;
import ar.edu.unq.po2.tp8.EmpleadoPasante;
import ar.edu.unq.po2.tp8.EmpleadoPlanta;
import ar.edu.unq.po2.tp8.EmpleadoTemporario;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class EmpleadoTest {
	
	 @Test
	    void testCalculoDeSueldoEmpleadoTemporario() {
	        Empleado empleado = new EmpleadoTemporario(80, 1000, false, true);
	        
	        // SetUp
	        double sueldoEsperado = 1305.0;

	        // Execution
	        double sueldoCalculado = empleado.sueldo();
	        
	        // Verify
	        assertEquals(sueldoEsperado, sueldoCalculado, 0.001);
	    }

	    @Test
	    void testCalculoDeSueldoEmpleadoPlanta() {

	        Empleado empleado = new EmpleadoPlanta(2);
	        
	        // SetUp
	        double sueldoEsperado = 2871.0;
	        
	        // Execution
	        double sueldoCalculado = empleado.sueldo();

	        // Verify
	        assertEquals(sueldoEsperado, sueldoCalculado, 0.001);
	    }

	    @Test
	    void testCalculoDeSueldoEmpleadoPasante() {
	        // SetUp
	        Empleado empleado = new EmpleadoPasante(100);
	        double sueldoEsperado = 3480.0;

	        // Execution
	        double sueldoCalculado = empleado.sueldo();

	        // Verify
	        assertEquals(sueldoEsperado, sueldoCalculado, 0.001);
	    }
	
}
