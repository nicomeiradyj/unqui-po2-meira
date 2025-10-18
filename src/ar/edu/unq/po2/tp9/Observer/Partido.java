package ar.edu.unq.po2.tp9.Observer;

import java.util.List;

public class Partido {
	String resultado;
	List<String> contrincantes;
	String deporte;
	
	public Partido(String resultado, List<String> contrincantes, String deporte) {
		this.resultado = resultado;
		this.contrincantes = contrincantes;
		this.deporte = deporte;
	}
	
	public String getResultado() {
		return this.resultado;
	}
	
	public String getDeporte() {
		return this.deporte;
	}
	
	public List<String> getContrincantes(){
		return this.contrincantes;
	}
	
}
