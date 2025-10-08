package ar.edu.unq.po2.tp7.State;

public class EstadoPausado implements EstadoReproductorMP3 {

	@Override
	public void play(ReproductorMP3 mp3) {
		System.out.println("No se puede reproducir otra canción.");
	}

	@Override
	public void pause(ReproductorMP3 mp3) {
		System.out.println("Reanudando canción...");
		mp3.getCancionActual().play();
		mp3.setEstado(new EstadoReproduciendo());
	}

	@Override
	public void stop(ReproductorMP3 mp3) {
		System.out.println("Pasando a selección de canciones");
		mp3.getCancionActual().stop();
		mp3.setEstado(new EstadoSeleccion());
	}

}
