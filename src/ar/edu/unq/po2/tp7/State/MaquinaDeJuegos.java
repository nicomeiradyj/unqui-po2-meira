package ar.edu.unq.po2.tp7.State;

public class MaquinaDeJuegos {
	EstadoMaquina estado;
	
	public MaquinaDeJuegos() {
		this.estado = new MaquinaApagada(); // Estado inicial
	}
	
	public void setEstado(EstadoMaquina nuevoEstado) {
		this.estado = nuevoEstado;
	}
	
	public EstadoMaquina getEstado() {
		return this.estado;
	}
	
	public void insertarFicha() {
		estado.insertarFicha(this);
	}
	
	public void presionarInicio() {
		estado.presionarInicio(this);
	}
	
	public void encender() {
		estado.encender(this);
	}
	
	public void terminarJuego() {
		estado.terminarJuego(this);
	}
	
}
