package ar.edu.unq.po2.tp7.State;

public class EstadoSeleccion implements EstadoReproductorMP3 {

	@Override
	public void play(ReproductorMP3 mp3) {
		System.out.println("Seleccionando canción.");
		mp3.getCancionActual().play();
		mp3.setEstado(new EstadoReproduciendo());
	}

	@Override
	public void pause(ReproductorMP3 mp3) {
		System.out.println("No hay ninguna canción seleccionada.");
	}

	@Override
	public void stop(ReproductorMP3 mp3) {
		System.out.println("No hay ninguna canción seleccionada.");
	}

}
