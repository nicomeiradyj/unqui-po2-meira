package ar.edu.unq.po2.tp7.State;

public class EstadoStop implements EstadoReproductorMP3 {

	@Override
	public void play(ReproductorMP3 mp3) {
		System.out.println("Primero elegir una canción.");
		mp3.setEstado(new EstadoSeleccion());
	}

	@Override
	public void pause(ReproductorMP3 mp3) {
		System.out.println("El reproductor no está reproduciendo ninguna canción.");
	}

	@Override
	public void stop(ReproductorMP3 mp3) {
		System.out.println("El reproductor ya está en STOP.");
	}

}
