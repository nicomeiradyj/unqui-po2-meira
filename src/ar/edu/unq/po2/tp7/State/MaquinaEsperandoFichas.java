package ar.edu.unq.po2.tp7.State;

public class MaquinaEsperandoFichas implements EstadoMaquina {
	
	private int fichas = 0;
	
	@Override
	public void insertarFicha(MaquinaDeJuegos maquina) {
		fichas ++;
		System.out.println("Se ingreso una ficha. Total: " + fichas);
	}

	@Override
	public void presionarInicio(MaquinaDeJuegos maquina) {
		if (fichas == 0) {
			System.out.println("Ingresar al menos una ficha para comenzar el juego");
		} else {
			System.out.println("Iniciando juego para " + fichas + "jugador/es");
			maquina.setEstado(new MaquinaJugando());
		}
	}

	@Override
	public void encender(MaquinaDeJuegos maquina) {
		System.out.println("La máquina está esperando fichas.");
	}

	@Override
	public void terminarJuego(MaquinaDeJuegos maquina) {
		System.out.println("La máquina está esperando fichas, todavía no se inició el juego.");
	}

}
