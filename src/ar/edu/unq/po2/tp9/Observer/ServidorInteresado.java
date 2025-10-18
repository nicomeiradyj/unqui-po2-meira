package ar.edu.unq.po2.tp9.Observer;

import java.util.List;

public class ServidorInteresado implements SuscriptorResultado{

	private String nombreServidor;
	private List<String> deportesInteres;
	
	public ServidorInteresado(String nombreServidor, List<String> deportesInteres) {
		this.nombreServidor = nombreServidor;
		this.deportesInteres = deportesInteres;
	}
	
	@Override
	public void actualizar(Partido nuevoPartido) {
		String deportePartido = nuevoPartido.getDeporte();
		if(deportesInteres.contains(deportePartido)) {
			System.out.println("Servidor:" + this.nombreServidor + "Nuevo Resultado en Partido: " + nuevoPartido.getResultado());
		}
	}
	
}
