package ar.edu.unq.po2.tp7.State;

public class EstadoReproduciendo implements EstadoReproductorMP3 {

	@Override
	public void play(ReproductorMP3 mp3) {
		System.out.println("La cancion ya se está reproduciendo.");
	}

	@Override
	public void pause(ReproductorMP3 mp3) {
		System.out.println("Pausando canción...");
		mp3.getCancionActual().pause();
		mp3.setEstado(new EstadoPausado());
	}

	@Override
	public void stop(ReproductorMP3 mp3) {
		System.out.println("Pasando a seleccion de canciones...");
		mp3.getCancionActual().stop();
		mp3.setEstado(new EstadoSeleccion());
	}

}
