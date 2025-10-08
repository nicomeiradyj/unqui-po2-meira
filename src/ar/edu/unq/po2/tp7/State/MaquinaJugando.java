package ar.edu.unq.po2.tp7.State;

public class MaquinaJugando implements EstadoMaquina {

	@Override
	public void insertarFicha(MaquinaDeJuegos maquina) {
		System.out.println("No se pueden ingresar fichas mientras se este jugando.");
	}

	@Override
	public void presionarInicio(MaquinaDeJuegos maquina) {
		System.out.println("El juego ya esta iniciado");
	}

	@Override
	public void encender(MaquinaDeJuegos maquina) {
		System.out.println("La maquina ya esta encendida");
	}

	@Override
	public void terminarJuego(MaquinaDeJuegos maquina) {
		System.out.println("Terminando juego... Volviendo al estado inicial.");
		maquina.setEstado(new MaquinaApagada());
	}

}
