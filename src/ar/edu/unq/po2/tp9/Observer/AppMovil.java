package ar.edu.unq.po2.tp9.Observer;

import java.util.Set;

public class AppMovil implements SuscriptorResultado{

	@SuppressWarnings("unused")
	private String usuarioApp;
	private Set<String> deportesInteres;
	private Set<String> contrincantesInteres;
	
	public AppMovil(String usuarioApp, Set<String> deportesInteres, Set<String> contrincantesInteres) {
		this.usuarioApp = usuarioApp;
		this.deportesInteres = deportesInteres;
		this.contrincantesInteres = contrincantesInteres;
	}
	
	@Override
	public void actualizar(Partido nuevoPartido) {
		boolean deporteCoincide = deportesInteres.contains(nuevoPartido.getDeporte());
		
		boolean contrincanteCoincide = false;
		for(String contrincantePartido : nuevoPartido.getContrincantes()) {
			if (contrincantesInteres.contains(contrincantePartido)) {
				contrincanteCoincide = true;
				break;
			}
		}
		
		if(deporteCoincide || contrincanteCoincide) {
			System.out.println("Nuevo Resultado en partido: "+ nuevoPartido.getResultado());
		}
		
	}
	
	
	
}
