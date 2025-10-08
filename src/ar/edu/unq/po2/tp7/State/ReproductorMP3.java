package ar.edu.unq.po2.tp7.State;

public class ReproductorMP3 {
	private EstadoReproductorMP3 estado;
	private Song cancionActual; 
	
	public ReproductorMP3(Song cancion) {
		this.estado = new EstadoStop();
		this.cancionActual = cancion;
	}
	
	public void play() {
		estado.play(this);
	}
	
	public void pause() {
		estado.pause(this);
	}
	
	public void stop() {
		estado.stop(this);
	}
	
	public Song getCancionActual() {
		return this.cancionActual;
	}
	
	public void setEstado(EstadoReproductorMP3 nuevoEstado) {
		this.estado = nuevoEstado;  
	}
	
	public EstadoReproductorMP3 getEstado() {
		return this.estado;
	}
	
}
